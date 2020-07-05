# Java_Logger

Logging messages can help developers to debug. 

In this example there are two main files:

1. [App.java](/src/main/java/org/moita/): simple method which divides two numbers.

2. [log4j2.xml](/src/main/resources/): configuration file containing parameters for logging messages.

## Notes about logging

**Loggers** are responsible for capturing events (LogRecords) and passing them to the appropriate Appender (handler).
**Appenders** are responsible for recording log events to a destination.
**Layouts** (Formatters) are responsible for determine how the data looks when it appears in a log entry.

When your application makes a logging call, the Logger records the event in a LogRecord and forwards it to the appropriate Appender. The Appender then formats the record using a Layout before sending it a destination such as the console, a file, or another application. 

### Frameworks
There are a few frameworks for logging and each one of them has its own levels.

* Log4J
* Java Logging API
* Logback
* Tinylog

### Level
Enabling logging at a given level also enables logging at all higher levels.

| Log4J | Java Logging API |
| ------------- | ------------- |
| FATAL | SEVERE |
| ERROR | WARNING|
| WARN  | INFO  |
| INFO  | CONFIG  |
| DEBUG | FINE  |
| TRACE | FINER  |
| X | FINEST  |
