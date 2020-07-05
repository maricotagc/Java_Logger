# Java_Logger

Logging messages can help developers to debug. Logged messages will be forwarded to a variety of destinations like consoles, files, OS logs, etc.

In this example there are two main files:

1. [App.java](/src/main/java/org/moita/): simple method which divides two numbers.

2. [log4j2.xml](/src/main/resources/): contains parameters for logging messages.

## Notes about logging

### Frameworks
There are a few frameworks for logging and each one of them has its own levels.

* Log4J
* Java Logging API
* Logback
* Tinylog

### Level
Enabling logging at a given level also enables logging at all higher levels.

Levels available in  (framework):

* FATAL 
* ERROR 
* WARN 
* INFO 
* DEBUG 
* TRACE

### Appenders
