# student-demo
Spring-boot project with REST and MySQL for Student CURD Operation.
Here List of CURD operation URL with request and response data.

ADD Student:
---------------------
  URL: localhost:9090/student/add
  Method: POST
  Request body: 
{
	"name": "abc",
	"studyClass": "abc"
	"dob": "12/JAN/1992",
	"email": "abc@gmail.com"
}

UPDATE Student:
--------------------
URL: localhost:9090/student/update
METHOD: PUT
Request BODY:
{
  "studId": 1,
	"name": "abc",
	"studyClass": "abc"
	"dob": "12/JAN/1992",
	"email": "abc@gmail.com"
}


GET Student By ID:
-----------------------
URL: localhost:9090/student/1
METHOD: GET
Response BODY:
{
  "studId": 1,
	"name": "abc",
	"studyClass": "abc"
	"dob": "12/JAN/1992",
	"email": "abc@gmail.com"
}

GET ALL Students
----------------------
URL:localhost:9090/students
METHOD: GET
Response BODY:
{
  "studId": 1,
	"name": "abc",
	"studyClass": "abc"
	"dob": "12/JAN/1992",
	"email": "abc@gmail.com"
}

DELETE Student By ID:
---------------------------
URL:localhost:9090/student/delete/1




