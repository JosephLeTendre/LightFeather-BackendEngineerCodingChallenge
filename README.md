# LightFeather-BackendEngineerCodingChallenge
Project for LightFeather application

# Instructions
The only thing needed to run this application is an application like Postman to test the API. This could also be done on the local host for GET commands

# Completed parts: 
   -GET/api/supervisors
   
      -This returns the list stored in the SupervisorService class, which is a subset of the file from AWWS.
      
      -The returned list is formateed as “jurisdiction - lastName, firstName”.
      
      -Numeric jurisdications are excluded.
      
   -POST/api/submit
   
      -This works only on a local level, and allows a user to input new Supervisors into the local list. These inputs can be displayed with a GET command
      
      -The submitted data is printed to the console.
      
# Uncompleted
  -GET/api/supervisors
     -The GET command does not format the file from AWS in a neat fasion, and does not remove numeric “jurisdiction.
  -POST/api/submit
     -Post does not post to the AWS link.
     -Post does not return an error for missing parameters
  -Docker
     -I'm uncertain if the docker was setup correctly, I ran the commands as said in the github, with the files setup similarly, but was not able to run anything on Docker
     
# Closing Thoughts
  -This was my first time looking into the Spring Book framework and using Docker. I was not able to complete all the tasks, but in the limited amount of time I was    given and while starting from scratch I think I made some good progress. This was overall a good learning experiences and a fun project to work on for a couple of hours.
