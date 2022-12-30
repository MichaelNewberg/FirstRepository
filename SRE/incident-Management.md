# Incident Management
- The goal of an SRE is  to MANAGE incidents (Major issues as defined by the company/stakeholders/users) as they happen.
    - company: can't acces internal tools used to do job
    - stakeholders: a service is down that will hurt company relationship with the public
    - user: unable to access service, unexpected results, etc.

There are some general guidelines when determining if an issue constitutes an incident or not:
- Is the problem user facing?
- Are multiple teams/departments needed to solve the issue?
- Is it taking too long to solve the issue?
- Is a manual response required?
- Did monitoring tools/alerts not alert you to the issue? (Novel problem)
- Was any data lost?
- Was user data exposed?

## Incident Management Guiding Properties
- Maintain clear line of command
- Designate clearly defined roles
- Keep records of debuggin/mitigation solutions
- Declare incidents sooner rather than later

## Incident Command System
Initially devoloped by Firefighters in 1968 to better manage dealing with forest fires.
There are 3 guiding principles for ICS that work well with the Incident management guiding principles:
- coordinate
- communicate
- control

When managing an incident there are three primary leadership roles that should be filled by individuals who can consistently maintain an environment of control, communication and coordination:
- Incident Commander
    - Typically the one who declares the incident starts as the Commander, but can hand off responsibility later
    - Coordinates between teams
    - Delegates responsibilities
        - When an incident starts, assumes the Communications lead and Ops lead positions until they can be delegated
- Communications Lead
    - Handle communication with those outside the incident management team
    - Any pertinent info is given to the Commander who can share it with the appropriate teams
- Ops Lead
    - Handles the team working to solve the issue
        - Once the source of the issue is found, Ops lead changes depending on the issue
    - Can roll back a deployment
    - Can redirect traffic from a corrupt node to another one
    - Can raise computing power for a virtual machine


# Postmortem
A postmortem is a document that provides context for an incident after the fact. It should include AS MUCH detail about the incident as can be provided reasonably:
- when did the incident happen?
- who worked on it to solve it?
- what was the incident?
- what caused the incident?
- timeline of events
- mitigation efforts taken
- damage done
- solution to incident
- recovery efforts
- etc

## PostMortem: Blameless Culture
It can be very easy to think that your mistakes are yours alone and that you will be blamed/get in trouble for making a mistake: this kind of thinking can lead to incomplete PostMortem reports taht don't actually help anyone deal with the same issue in the future. To avoid this, a blameless culture should be encouraged surrounding PostMortem reports.
- Blameless incident summary
    - at 12:32 PM on Dec. 25th 2022 a corrupt image was deployed to the production environment instead of the newly corrected one. Due to this, a memory leak spiraled out of control leading to vm's crashing, rebooting and repeating. After 2 hours of searching the logs and system metrics the typo was discovered in the deployment config, changed, and the system began to work as expected.
-Blameful incident summary
    - Eric was at it again this weekend: he made a typo in the deployment config which caused the entire SRE and developement team to miss out on Christmas with their families. After the other SREs and Dev team memebers (not Eric, he was crying in the corner) exhausted the logs and system metrics, Sally, the hero of the day realized that Eric made a typo in the deployment config, then we forced him to fix it while we stared at him.

There should be collaboration while creating the document because not everyone has the whole picture. Also, senior members of the teams involved should review the document before it's approved in order to ensure the document is sufficient.3