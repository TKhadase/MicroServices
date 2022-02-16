To trace each request in zipkin server, start zipkin server jar using below command in directory where jar is kept.
cmd> java -jar zipkin-server-2.23.16-exec.jar

Run below project as Spring Boot Application
1) SB_MS_11-MS03-Distributed_logging_Tracing-Zipkin_Slueth
2) SB_MS_11-MS02-Distributed_logging_Tracing-Zipkin_Slueth
3) SB_MS_11-MS01-Distributed_logging_Tracing-Zipkin_Slueth

give GET request to below url using browser/postman tool
http://localhost:8081/home

now open zipkin server console using below url:
http://localhost:9411/zipkin

In console, Click RUN QUERY button, and select any request request and click SHOW button
here traceId, SpanID can be found and track in logs for microserivice communication flow tracing 