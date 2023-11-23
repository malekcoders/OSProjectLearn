## Create a File

#### Objectives
Understand the File class and Path interface in Java, and how to use them to create a file.

#### Concept
These concepts are the main used concepts in the project solution, kindly read the provided resources if any is new to you.

| Concepts                                          | Resources                                                                                                             |
|---------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| Accessing a file/directory                        | [Dev.Java ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)                                                       |
| File Handling in Java                             | [Edureka Java handling file ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)                                     |
| Understand File, FileReader,and  FileWriter class | [Artical File class in Java](https://www.codecademy.com/resources/docs/java/files)                                    |
| Write into a file                                 | [DigitalOcean Artical - Java File Handling](https://www.digitalocean.com/community/tutorials/java-filewriter-example) |



#### Problem
Write a program that create a text file inside a directory.


#### Implementation
Do the implementation of the `createFile` method:
1. Instantiate an object from the `Path`, and uses `get` method from the class `Paths` and pass the file's path into the `get` Argument.
2. Call the 
3. Close the file stream, by using the `close` method of the FileWriter class.
4. In the main method, call the `createFile` method.

```
public static void createFile(String fileName) throws IOException {
    /* Your code here */
}
```
