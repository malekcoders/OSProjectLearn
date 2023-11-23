### Write into a text file

#### Objective
Understand how to append data into an existing file using **Java I/O API**.

#### Concepts
These concepts are focus on **Java I/O API**, and how to use it to add a data into an existing file, and with help of `FileOutputStream` class.

| Concepts                                          | Resources                                                                                                            |
|---------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| Accessing a file/directory                        | [Dev.Java ](https://dev.java/learn/java-io/)                                                       |
| File Handling in Java                             | [Edureka Java handling file ](https://www.youtube.com/watch?v=SslMi6ptwH8&t=364s)                                    |
| Understand File, FileReader,and  FileWriter class | [Artical File class in Java](https://www.codecademy.com/resources/docs/java/files)                                   |
| Write into a file                                 | [DigitalOcean Artical - Java File Handling](https://www.digitalocean.com/community/tutorials/java-filewriter-example) |



#### Problem
Write into an existing file.


#### Implementation
Do the implementation of the `appendFile` method:
1. Instantiate an object from the `FileOutputStream`.
2. On the first argument of the `FileOutputStream` constructor pass the file path, and on the second argument pass `true` to enable the append option.
3. convert the content string into bytes array.
3. Use the `write` method from the `FileOutputStream` object to append the content into the existing file.
4. (Optional) Call the `flush()` method, to ensure that the content is written into the file.
5. Call the `close()` method to close the file output stream.
6. In the main method call the `appendFile(filePath, content)` method and pass the file path and the content to be written into the file.

```
public static void appendFile(String filePath, String content) throws FileNotFoundException {
        /* Your code here */
    }
```