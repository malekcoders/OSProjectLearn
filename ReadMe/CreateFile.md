## Create a File

#### Objective

Understand the `File` and `Path` classes in Java, and how to use them to create a file.

#### Concepts

These concepts are the main used concepts in the project solution, kindly read the provided resources if any is new to you.


| Concepts                                          | Resources                                                                                |
| ------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| Accessing a file/directory                        | [Java Documenation of I/O Classes](https://dev.java/learn/java-io/)                      |
| File Handling in Java                             | [Edureka - File Handling in Java ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)   |
| Understand File, FileReader,and  FileWriter class | [CodeAcademy - File Documenation ](https://www.codecademy.com/resources/docs/java/files) |

#### Problem

Create a file in the project directory.

#### Implementation

Do the implementation in the main method of the `CreateFile` class:

1. Initialize a variable with `Path` data type , and assign it `Paths.get(/* file path*/)`.
2. Call the `createFile()` method from the `Files` class, and then pass the path variable that you just created.

```java
 public static void main(String[] args) throws IOException{
        /* You Code Here */
}
```

> You can use either `Path` or `File` class to create a file, but `Path` class is more recommended by dev.java.