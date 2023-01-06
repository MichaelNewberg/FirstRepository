# Kubernetes: The Need
Good news! A few investors have taken an interest in the Planetarium, and the company is going global! There are a few things that need to be considered before this can become reality:
- Things are constantly updating: How are you going to ensure that all users get the same updates at the same time?
- The application needs to be reliable
    - Availability needs to be high
    - There needs to be failsafes in case availability drops
- There needs to be room for growth
- There needs to be room for feature additions


# Kubernetes: The Solution
Kubernetes is a system that is capable of handling all of these requirements and more for us.
- Kubernetes makes use of containers natively in order to run applications.
    - aka it is very easy to deploy software using kubernetes
- Kubernetes has built in systems/integrations for maintaining high levels of availability.
    - Kubernetes supports autoscaling (vertical & horizontal)
    - supports loadbalancing
    - performs constant health checks to ensure the app(s) are running correctly. 
        - if a problem is discovered Kubernetes will automatically take action in order to correct any mistakes, and if necessary destroy/recreate containers.
- Kubernetes supports your infrastructure using Infrastructure as Code (IaC).
    - Most of Kubernetes is created/written using IaC.
        - yml or jason files
    - You can update your configurations on the fly and Kubernetes will adjust itself accordingly.


# Kubernetes: Infrastructure
Kubernetes is really a bunch of smaller moving parts taht make a cohesive whole: there are a few key pieces you need to be aware of:
- Cluster
    - where all the work that Kubernetes is doing is localized. Any Virtual machines,  apps you deploy, eauxilary software you use, etc.: all of this is located in the "cluster".
    - Clusters are handled by something called the Control Plane: this is the software you interact with to tell Kubernetes what you want, and it is the tool that manages the cluster.
    - the control plane is able to interact with nodes inside the cluster via the node's kublet.
        - kublets are software attached to nodes that handle incoming control plane messages.
- Node
    - These are the VMs that Kubernetes uses to host/run your app and auxilary software.
        - Some cloud providers place the Control Plane in an isolated node away from the cluster.
- Pod
    - These are individual bits of computing resources that host/run your containerized software.
        - all containers are run inside of Pods, typically one per pod.
        - you can run multiple within a pod, but it is not common.
            - this is due to the potential for pods needing to be reset for a variety of reasons: updating an image or reseting a broken app. If a pod needs to be reset due to a faulty app, but there are 2 apps running within it, both will be reset despite only 1 needing to be.
- Service
    - These are tools that help to manage communication between resources within the cluster and to manage interactions with people and resources outside of the cluster.
        - services can help manage spreading traffic between Instances of an app.
        - services can also be used to handle incoming requests to the cluster.
            - these external services (typically load balancers) can also directly send external requests to the apps expecting them.


# Kubernetes: Imperative vs Declarative
The difference between an imperative and declarative system is in HOW the system is informed about what you want.
In an Imperative System:
- command equals action
    - scaling your deployment from 3 to 10 pods is typically an imperative action: you would give the actual command to Kubernetes and it would adjust accordingly.
- you are telling Kubernetes exactly what to do in an imperative system.
    - Kubernetes will respond to your kubectl commands.
- you will typically only use imperative commands when debugging/handling an incident
    - upon finishing your work you should undo your imperative changes to allow the system to manage its own desired/current state

In a Declarative System:
- commands equal end statements
    - updating a deployment from an old image to a new one can be done declaratively by updating a config file and then applying it to the cluster.
- in Kubernetes the declarative system creates the "desired state" of the cluster.
    - you use config files to indicate the desired state for the app, and once Kubernetes reads these files it updates itself accordingly to change (if needed) its current state to match the desired state.
- this is the default way Kubernetes is desired to be used: use configs to tell Kubernetes what the desired state should be


# Kubernetes: The Pod
Pods are the computational objects that host your containerized applications and have meta data that allows them to be interacted with. There are some key points to a pod:
- container
    - one or more containers hosted by the pod, Kubernetes uses pods to host them
    - typically only host 1 container per pod, but can support more than 1
- meta data
    - includes data that allows you and kubernetes to interact with the pod and containers inside of the pod
        - name: this is how you reference the pod with kubectl commands
            - kubectl logs {pod name}
            - kubectl describe pod {pod name}
        - lables: this is how kubernetes knows to link your pod and other objects to each other
            - can target your pods with services by matching labels: a service targeting pods with the label app:my-app will only send traffic to pods with that label


# Kubernetes: Basic Services
There are 3 basic services you will see in Kubernetes deployments:
- ClusterIp
    - this service is used when you want to target one or more pods within the cluster via internal services
    - this service does not have a public facing ip address
    - ClusterIps do support limited horizontal load balancing: they will cycle through which instance of your applications recieve traffic (assuming you have multiple instances of your application deployed)
- Nodeport
    - this service allows you to map a port in your container (typically the exposed port for the app) to a port on the node that is hosting the pod your container is running in
    - this kind of service can be extremely limited: if your nodes do not have assigned public IP addresses then you can't use a Nodeport service
    - Nodeports do not support horizontal load balancing, unlike ClusterIps: one pod/container can be mapped to a nodeport at a time
- Loadbalancer
    - this service spins up an external resource (a load balancer) and is the most common tool used for handling external traffic to clusters
    - can be mapped directly to a pod, but is more common to set up "ingress" rules that better direct traffic to the appropriate resources
    - also help keep your applications from being overloaded by requests: they can limit the amount of resources being handled at a time


# Kubernetes: deployments
It is not normal to use Kubernetes to handle deploying a single instance of an app: it was built to handle large scale enterprise apps: multiple instances of whatever app provides the service, auxilary software for the monitoring/maintanence, the whole works. An easy way to handle multiple pods in a single location is to use a deployment manifest. You define the specs of the pod normally within a deployment manifest, but you are also able to control things like replica sets (how many pods do you want), environment variables, volumes and more.


# Kubernetes: Loadbalancer Limitations
You can have multiple pods with the same label, and when your service that is a loadbalancer targets those pods you will see in the service info that the service can target multiple pods. However, loadbalancers have a limitation: they are unable to disperse the incoming http requests to the multiple pods. Instead, one pod will be chosen and your requests will be sent to that one consistently. In order to make use of your extra pods and to better balance the load of incoming requests you will need to make use of Ingress rules and an Ingress controller.