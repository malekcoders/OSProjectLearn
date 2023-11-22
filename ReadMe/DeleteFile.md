### Move/Rename File

#### Objectives
Understand how to Rename/Move a file in Java using I/O API.

> Rename and Move are the same operation, the difference is that when you move a file you are changing the path of the file.
#### Concepts
The following table list the concepts and resources that you can use to learn more about them.
It will explain the Java File System, and how to use the Path interface to work with files and directories.

| Concepts                                          | Resources                                                                                                            |
|---------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| Accessing a file/directory                        | [Dev.Java ](https://dev.java/learn/java-io/)                                                       |
| File Handling in Java                             | [Edureka Java handling file ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)                                    |
| Understand File, FileReader,and  FileWriter class | [Artical File class in Java](https://www.codecademy.com/resources/docs/java/files)                                   |
| Write into a file                                 | [DigitalOcean Artical - Java File Handling](https://www.digitalocean.com/community/tutorials/java-filewriter-example) |



#### Problem
Rename/Move an existing file using Java I/O API.

#### Implementation
Do the implementation of the `moveFile` method:
1. Call the `move`method from the `Files` class
2. And pass the file path and the new file path.
3. In the main method call the `moveFile` method.

```
public static void moveFile(String filePath, String newFileName) throws IOException {
        /* Your code here */
    }
```