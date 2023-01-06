# RESTful Web Service
In a REpresentational State Transer (REST) web service, info that is being passed to and from users and web servers is represented by a "representation" of the data. Typically the "representation" is in JSON formatting, since JSONs are fundamentally just formatted strings, and just about all programming languages are able to work with Strings. You as the end user don't need to know how your information you send to the web server is being transformed/handled, and the web server doesn't need to know how your info was transformed into a JSON and sent to it.


# REST Constraints
There are 6 constraints that any "true" Restful web service will adhere to:
1. Client-Server architecture
    - RESTful web services should not handle any client-side logic
    - This allows your application to be tech-agnostic when it comes to the client-side implementation: because no matter what language/tools are used to get info from the end users to your app, a representation will be sent, so it ultimately doesn't matter to the server what tools are used
2. Stateless
    - RESTful web services don't keep track of their users: they are there to handle converting info into it's representation and sending it on it's way
3. Chacheble
    - info can be stored clientside for optimization
4. Uniform Interface
    - RESTful web services should have Universal Resource Identifiers (URIs) that match as closely as possible
        - Try and keep URIs as similar as possible, which makes it easier to understand what the route is trying to accomplish in a moments notice:
            - GET api/planet/{name}
            - GET api/planet/id/{id}
            - POST api/planet
            - DELETE api/planet/{id}
        - This means the methods (verbs) should be consistent as well (GET will always get, POST will always create, etc)
5. Layered System
    - RESTful web services should be able to communicate with each other
        - for example, if logging in, the first RESTful web service hit might just validate the login data is the correct format (no illegal characters for example) and then send the data to a second RESTful web service that actually checks if the login data exists or not, and once validation is completed returns a response to the login requester
    - end user doens't need to be aware of the layers: they just need to get the end results
6. Code on Demand
    - RESTful web services CAN return executable code
        - this is not a common practice, this constraint is considered optional
