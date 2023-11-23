### Get File Information

#### Objective
Understand how to access a directory and retrieve the files from the directory.

#### Concepts
These concepts are covered I/O in Java which it uses two main thing `File` class, and `Path` interface.

| Concepts                                          | Resources                                                                                                             |
|---------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| Accessing a file/directory                        | [Dev.Java ](https://dev.java/learn/java-io/)                                                       |
| File Handling in Java                             | [Edureka Java handling file ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)                                     |
| Understand File, FileReader,and  FileWriter class | [Artical File class in Java](https://www.codecademy.com/resources/docs/java/files)                                    |
| Write into a file                                 | [DigitalOcean Artical - Java File Handling](https://www.digitalocean.com/community/tutorials/java-filewriter-example) |



#### Problem
Print out files from existing directory.


#### Implementation
Do the implementation of the `printDirectoryFiles` method:
1. Instantiate an object from the `File`, and pass the path of the directory into the `File` constructor.
2. Create a `File` array and use the `listFiles` method from the `File` class to get the files from the directory.
3. Iterate over the `File` array and print out the files' names.

```
public static void printDirectoryFiles(String path) {
        /* Your code here */
    }

```