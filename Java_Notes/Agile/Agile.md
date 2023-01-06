# Agile

## The old ways: Waterfall
Anytime any project gets started, there is a key question that needs to be asked: can I go back?
This might seem like a silly question, but there are some fields/projects where the answer to this question is no: a bridge builder can't just click "undo" if a mistake was made.
There are times when work needs to be done and it needs to be done right the first time because there is little to no room for error. This USED to be prevelent in the software world.

Pros:
- It is very easy to know what the end goal is
    - usually explicitly spelled out in some sort of contract
- It is very easy to know what the "next" step is
- Helps to reduce confusion between teams
    - each team will usually have a specific role in the development process, no need to second guess yourself and the part of the process you are working in
- Don't need any in-depth knowledge of any sort of "ceremonies" or mindsets to do your job well in a Waterfall environment: once Step A is finished, move to Step B, etc

Cons:
- If a client agrees to a contract/terms but later realizes that they don't actually want those features, they are stuck
    - On the flip side, the developers can't go back and revise things with the client in order to better produce what the client wants
- Lack of "backwards" movement creates a lot of pressure to "get it right the first time". This can be problematic if teams are all doing isolated jobs and don't necessarily know how the pieces work together.
- Debugging is hard to do until the complete project is finished and the end of the waterfall is reached. Because there is no backwards movement, any bugs discovered during the developement process have to be worked around.


## The Modern Way: Agile
If the Waterfall Methodology is strict, rigid, and only moves forward, the Agile Methodology is it's counterpart.
Where the Waterfall way is to only step forward, the Agile way allows for taking one step back in order to take two steps forward.

There are four main tenants of the Agile Methodology, many of which were decided upon because of a direct correlation to the waterfall methodology:
1. Individuals and Interactions over process and tools
    - The waterfall methodology typically involes a large amount of contracts, documentation and specifications about what tools can and can't be used.
    - The Agile methodology focuses more on constant communication and good relations between the client and developer instead of the peripherals.
2. Working software over comprehensive documentation
    - In the Waterfall method, even if you know how to fix a bug, if the work to fix it was part of a previous step too bad: document the bug and workarounds and give notes to the client
    - In the Agile method, you go back and fix it even if you need to cut back on some features you can release on time
3. Customer Collaboration over contract negotiatoin
    - rigid contracts in the Waterfall method made it difficult to change things if/when necessary on both client and developer side
    - in Agile method, there is collaboration between the two, so if changes need to be made the need can be communicated, discussed and implemented
4. Responding to change over a plan
    - It is better overall to be able to adjust plans on the fly to actually give the customer what they want than to stick with a plan that does not satisfy anyone


## Agile Methodology
Teams that work with an Agile mindset typically have three things in common:
1. Dynamic Project Scopes
2. Iterative Development Cycles
3. Copius use of Automation Tools

There is some common terminology that is used across Agile methodologies you should be aware of aswell:
- Epic
    - used to describe related functionality ("Users should be able to manage their authentication with our app")
- User Story
    - easy to undertand descriptions of functionality in the  app (dont need technical knowledge to understand them)
    - "as a user I want to login so I can manage my account"
    - typically user stories will be organized into multiple epics
- Story Points
    - arbitrary numbers (as determined by the team) that are assigned to user stories to determine how much time/effort it will take to complete said user story. These numbers are arbitrary because each team will need to decide how to assign story points to user stories
        - for instance, for a login user story, you might assign it three story points due to three potential methods calls needed to implement the user story
- Velocity
    - number of story points handled (completed) during a development cycle. As a team matures and completes more cycles, the velocity numbers (both completed and aimed for) can be referenced to better understand the capabilities of the team and help the team storypoint user stories more accurately in the future
- Spring
    - development cycles (typically a few weeks in length), during which a velocity will be aimed for. When finished, the team can check if they met the target velocity which helps them forcast their capabilities for the future.


## Agile Implementation: Scrum
Scrum is a methodology that uses the Agile mindset to guide the work process and the way teams interact with clients. There are a couple different roles in a scrum, some for the dev team and others to categorize the client:
- Development Team
    - Usually a small team, no more than 10 individuals, that is doing the work
    - Can be multiple teams
- Product Owner
    - individual/team that handles communication and coordination with the scrum team
- Stakeholder
    - individual/entity that the work is for
- Scrum Master
    - leading the scrum team: handles communicating with the Product Owner and also manage communication between different teams within the Scrum
    - Some teams may not have the Scrum Master handle product owner communication, just be aware
- Team Members (Scrumlings)
    - Individuals that compose the various teams in the scrum


## Scrum Terms
Three main phases:
    - Initial
        - initial starting goals are set and the starting backlog is created
        - Backlog is a collection of epics/user stories that need to be completed
    - Sprint
        - this is when the sprint happens: depending on how requirements change this phase can be increased or decreased according to business needs
    - Closure
        - where project work is finished, any closing documentation is written up, team can be assigned to a new project
Key Terms
    - Project Backlog
        - complete collection of epics/user stories that need to be finished
    -Sprint Backlock
        - collection of user stories that need to be completed during current Sprint
Ceremonies
    - User Story Grooming Ceremony
        - activity at the start of a sprint where user stories and/or epics (depending on storypoints involved) are assigned to individuals or groups
    - Daily Standup (The Scrum)
        - daily team check-in during the sprint where teams are able to collaborate and realign with each other
            - update
            - What am I/my team going to do today
            - blockers
    - Sprint Retrospective
        - happens at the end of sprint, time for the team to review how the sprint went and to strategize on how to improve the next sprint