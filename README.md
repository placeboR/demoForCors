## CORS Demo


Cross-origin resource sharing (CORS) is a mechanism that allows restricted resources on a web page to be requested from another domain outside the domain from which the first resource was served.

In this demo, a request from http://localhost:9000 is accepted and handled by http://localhost:8080. 

To verify the code, type
```
java -jar demoForCors-0.0.1-SNAPSHOT.jar --server.port=8080
```
to start SpringBoot application on port 8080.

Then, use
```
java -jar demoForCors-0.0.1-SNAPSHOT.jar --server.port=9000
```
to start another application on port 9000.

From the index of 9000, we can see the fetched data from 8080.
