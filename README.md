# spark-ormlite-example
example demonstrate writing web services in quick way using sparkjava nad ormlite

# Before Starting
Change db detail and Graphs.java model with respect to your database.

# Commands
````
$mvn compile && mvn exec:java
````

Once started console logs will look like as below:

````
[Thread-1] INFO org.eclipse.jetty.util.log - Logging initialized @2691ms
[Thread-1] INFO spark.webserver.JettySparkServer - == Spark has ignited ...
[Thread-1] INFO spark.webserver.JettySparkServer - >> Listening on 0.0.0.0:4567
[Thread-1] INFO org.eclipse.jetty.server.Server - jetty-9.3.2.v20150730
[Thread-1] INFO org.eclipse.jetty.server.ServerConnector - Started ServerConnector@2a616ee{HTTP/1.1,[http/1.1]}{0.0.0.0:4567}
[Thread-1] INFO org.eclipse.jetty.server.Server - Started @2850ms
````

Launch browser with http://localhost:4567/users/{id}

# Advantage
I wrote this in few minutes, no need of hibernate/spring configuration files, they are complex by nature.

# Reference
https://www.boxuk.com/insight/blog-posts/creating-rest-api-quickly-using-pure-java
