# What is HTTP?
Hyper Text Transfer Protocol (http) is the most popular way of transporting info across the web in modern times.
It is a request/response system that garuntees a response for every request made.
There are a few standard components of a http request you should be familiar with:
    -uri: part of the request that tells the web server what information you want.
    -body: many http requests are going to contain a body: this is the information needed to complete the request made.
    -verb: provides context for what the requester is trying to accomplish with the request.
        *GET: request wishes to "get" some kind of information
        *POST: usually used when the request wants to create an entry or new information within the system.    
        *PUT: typically used when request wants to update ALL of some resource handled by the web app.
        *PATCH: typically used when request wants to update SOME of the resource handled by the web app.
        *DELETE: request wants to remove some resource handled by the web app.

Also be familiar with the following components of a HTTP response:
    -body: contains the info requested or an error message.
    -status code: number that gives an immediate indication of how the request was handled.
                  [More information](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status)
                  There are multiple http status levels you can get:
                  *100-199 informational
                  *200-299 success
                  *300-399 redirect
                  *400-499 user error (clientside)
                  *500-599 server error (developerside) THIS IS BAD

# JSON
Javascript Object Notation (JSON) is one of the most popular ways of formatting information in http requests(really for any web based communication).
At their core, JSONs are just formatted strings.
```json
{
    "keyOne":"value one",
    "keyTwo":2,
    "keyThree":true
}
```
JSONs accept three data types: Strings, numbers, and booleans.