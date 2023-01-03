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
    - upon finishing your work you should undo your imperative changes to allow the system to manage its own intended/current state

In a Declarative System:
- commands equal end statements
    - updating a deployment from an old image to a new one can be done declaratively by updating a config file and then applying it to the cluster.
- in Kubernetes the declarative system creates the "intended state" of the cluster.
    - you use config files to indicate the intended state for the app, and once Kubernetes reads these files it updates itself accordingly to change (if needed) its current state to match the intended state.
- this is the default way Kubernetes is intended to be used: use configs to tell Kubernetes what the intended state should be