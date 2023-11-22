### Write into a text file

#### Objectives
Understand how to write into a file using Java I/O API.

#### Concepts
These concepts are focus on Java I/O API, and how to use it to write into a file.

| Concepts                                          | Resources                                                                                                            |
|---------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| Accessing a file/directory                        | [Dev.Java ](https://dev.java/learn/java-io/)                                                       |
| File Handling in Java                             | [Edureka Java handling file ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)                                    |
| Understand File, FileReader,and  FileWriter class | [Artical File class in Java](https://www.codecademy.com/resources/docs/java/files)                                   |
| Write into a file                                 | [DigitalOcean Artical - Java File Handling](https://www.digitalocean.com/community/tutorials/java-filewriter-example) |



#### Problem
Write into an existing file.


#### Implementation
Do the implementation of the `writeFile` method:
1. Instantiate an object from the `FileOutputStream`, and pass the path of the file into the argument.
2. convert the content string into bytes array.
3. Use the `write` method from the `FileOutputStream` object to write the content into the file.
4. (Optional) Call the flush() method, to ensure that the content is written into the file.
5. Call the close() method to close the file output stream.
6. In the main method call the `writeFile` method and pass the file path and the content to be written into the file.

```
public static void writeFile(String filePath, String content) throws FileNotFoundException {
        /* Your code here */

    }


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
