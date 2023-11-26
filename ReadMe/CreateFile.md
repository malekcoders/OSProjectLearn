## Create a File

#### Objectives
Understand the `File` class and `Path` interface in Java, and how to use them to create a file.

#### Concept
These concepts are the main used concepts in the project solution, kindly read the provided resources if any is new to you.

| Concepts                                          | Resources                                                                                                            |
|---------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| Accessing a file/directory                        | [Dev.Java](https://dev.java/learn/java-io/)                                                       |
| File Handling in Java                             | [Edureka Java handling file ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)                                    |
| Understand File, FileReader,and  FileWriter class | [Artical File class in Java](https://www.codecademy.com/resources/docs/java/files)                                   |


#### Problem
Create a file in the project directory.


#### Implementation
Do the implementation in the main method of the `CreateFile` class:
1. Initialize an object from the `Path` class, and use `get()` method from the `Paths` class and pass the file's path, into the `get` argument. 
2. Call the `createFile()` method from the `Files` class, and then pass the path object that you have created.

```
public static void main(String[] args) throws IOException{
        /* You Code Here */
}
```
