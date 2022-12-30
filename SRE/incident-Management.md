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
