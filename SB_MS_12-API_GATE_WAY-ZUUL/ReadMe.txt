Run SB_MS_01-R_D-Server-Eureka-Cfg  project as Spring Boot Application and check Eureka server console at below url.
http://localhost:8761

follow ReadMe.txt of : SB_MS_03-MS01-BankPaymentService

Run this project as Spring Boot Application refresh the Eureka server console
Check service instance is updated with this microservice or not and test the service in using below url:
http://localhost:8990/orders/start 
and check response message by calling service again and again.

Run SB_MS_12-API_GATE_WAY-ZUUL as Spring Boot Application and check Eureka server console
and test the GATE-Way Server at below url:
http://localhost:9222/Tushar-api/orders/start/