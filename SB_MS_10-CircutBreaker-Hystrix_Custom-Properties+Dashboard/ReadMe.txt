Run this project as Spring Boot Application
and Test the controller 5-10 times using URL : http://localhost:8081/home
and Observe the logs.

for 1st 5 REQUEST, output came from  fallback method after actual method (Closed Circuit)
for 6th REQUEST until next 10 second, output direct came from OPEN Circuit FallBack method

simultaneously check circuit breaker dashboard using:  http://localhost:8081/hystrix 
put http://localhost:8081/actuator/hystrix.stream in 1st input and click "Monitor Stream"