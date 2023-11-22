### Get File Information

#### Objectives
Understand how to access a directory and retrive files from the directory.

#### Concepts
These concepts are the main used concepts in the project solution, kindly read the provided resources if any is new to you.

| Concepts                                          | Resources                                                                                                             |
|---------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| Accessing a file/directory                        | [Dev.Java ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)                                                       |
| File Handling in Java                             | [Edureka Java handling file ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)                                     |
| Understand File, FileReader,and  FileWriter class | [Artical File class in Java](https://www.codecademy.com/resources/docs/java/files)                                    |
| Write into a file                                 | [DigitalOcean Artical - Java File Handling](https://www.digitalocean.com/community/tutorials/java-filewriter-example) |



#### Problem
Print out a file's information (name, size, type, owner, created at, and path).


#### Implementation
Do the implementation of the `printFileInfo` method:
1. Instantiate an object from the `Path`, and uses `get` method from the class `Paths` and pass the file's path into the `get` Argument.
2. In the `printFileInfo` method, create a variables and then use the methods from class `Files` to get the file information.
3. Print out the file's name, size, type, owner, and created at.


```
public static void printFileInfo(String filePath) throws IOException {
        /* Do your code here, and apply the changes to the code below*/
        var fileName = "";
        var fileOwner = "";
        var fileType = "";
        var fileZie = "";
        var fileCreationTime = "";

        System.out.println("File Name: "+fileName);
        System.out.println("File Type: "+fileType);
        System.out.println("File Size: "+fileZie+" bytes");
        System.out.println("File Owner: "+fileOwner);
        System.out.println("File Creation Time: "+fileCreationTime);
        System.out.println("FIle path: "+path);
    }
```
