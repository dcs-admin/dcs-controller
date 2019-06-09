# dcs-controller
dcs-controller would be controller service for all GUI components

# How to deploy  

## Make Infrastructure ready with following

01. Zookeper Service Start:
```
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```

02.Kafka Server Start
```
bin\windows\kafka-server-start.bat config\server.properties
```

03. DCS Controller(Discovery Server)
```
java -jar dcs-controller-0.0.1-SNAPSHOT.jar
```

04.DCS API Gateway
```
java -jar dcs-api-gateway-0.0.1-SNAPSHOT.jar
```

05. DCS Client
```
java -jar -Dserver.port=9999  dcs-client-0.0.1-SNAPSHOT.jar
```

## How can Test this from Browser

01. DCS-Controller WEB UI

```
  http://localhost:8000/
```

02. DCS-API-Gateway WEB UI

Case1:
```
  http://anji-pc:8001/DCSCLIENT1/run-load-job/devi1 
  
  >> Above request start loading data from kafka server on topic devi1 with group devi1, You can find the logs on console
  
  Following commands will be useful while checking the messages on kafka Topic
  
 Windows Commands
  ----------------
  bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic topic --from-beginning
 
  bin\windows\kafka-consumer-groups.bat --bootstrap-server localhost:9092 --list

  bin\windows\kafka-consumer-groups.bat --bootstrap-server localhost:9092 --group topic --describe
```  
Case2:
```
  http://anji-pc:8001/dcsclient1/run-extract-job/devi1/dummy2

  >> Above request can directly routs to specific microservice requesterd with DCS controller 
  
  Check the data availability on postgres
```
