
# Calculator API

This is my solution to the challenge.

I created an API to do 
addition ,  subtraction 
multiplication and division.

These are the paths to do the requests:

localhost:8080/api/v1/calculator/divide
localhost:8080/api/v1/calculator/multiply
localhost:8080/api/v1/calculator/add
localhost:8080/api/v1/calculator/subtract

to do an operation you must send a JSON in the body with the two values that are going to be use.
like this:


 {
    "firstNum": 0,
    "secondNum": 0
}

Note:
I have in mind other solution adding other parameter to the body called operation but due the requirements I chose to create different endpoints for each operation.
(Also I added two extra operations multiplication and division).


## Installation

To install the project you must run

```bash
  mvn clean install
```
Since we are using Tracer you must add the jar file in src/main/resources in order to be able to run succesfully the application.

After doing this you can just run the application locally and then open Postman to send the requests.