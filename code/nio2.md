## Comparing old and new way of coding using new apis introduced in java8

Problem statement 1: How would you read a text file ? Check [this](./src/com/laxmikant/java8/nio2/ReadFile.java) for use of new Files.readAllLines which removes lots of boilerplate  code from java7 approach.

Problem statement 2: Given a text file, skip the first line, change to upper-case and collect in a list. Check [this](./src/com/laxmikant/java8/nio2/ReadFile.java) for use of new Files.lines api which gives you stream out of file and Paths.get api to to locate a file in a file system.

Problem statement 3: How would you find the list of files in a directory.? Check [this](./src/com/laxmikant/java8/nio2/ReadFile.java) for use of new Files.list api which gives you stream of entries present in a directory.

 
 
