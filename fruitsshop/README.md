<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNIpvMrNHbqDsOI3lSQCsIu-PEYa1O1weLuA&usqp=CAU" alt="image coming" width="1200" height ="100"/> <br>

# Lab_8

## Task

Write code for UML diagram from lab 2<br>
My lab 2 task:<br>

- **Fruit shop.** Implement the hierarchy of fruits present in the store. Search for citrus fruits and berries that ripen in summer. Print the result sorted by fruit color
Implement the ability to sort the found fruit by another type of parameter (optional, implemented as a separate method)
The implementation of sorting should provide the ability to sort both in descending and ascending order
### Class diagram:

<a href="https://drive.google.com/file/d/1YVd56iuDgkppQ48XoEcpEXYJo6nriDio/view?usp=sharing">
<img src="https://softlist.com.ua/upload/resize_cache/iblock/abc/219_219_140cd750bba9870f18aada2478b24840a/drawio.jpg" alt="link to diagram">
<p><figcaption> UML Diagram link </figcaption></p>
</a>

## Requirements

- Java code convention.
- Classes had to be properly divided into packages.
- Minimal working with the console.
- Code must contain only classes from the class diagram.
- Class attributes and methods should have the same visibility as in class diagram.
- Use the built-in sorting methods available in Java to sort.
- Sorting should be implemented in a separate method.
- Only one static method is allowed in code - `main`.
- Implementing element comparison and sorting should use lambda expressions.
- `Lombok` annotations should be used instead of writing setters and getters.
- Convert a project so that its assembly can be performed using maven.
- Also connect the following plugins to pom.xml:
- - Jacoco 
- - FindBugs
- - PMD
- - Checkstyle
### To run the program:

- Clone repo branch:**` git clone -b lab8 href`**
- Enter the repo folder
- Run **`mvn compile`**
- Run **`mvn package`**  
- Run **`java -cp target\fruitsshop-1.0-SNAPSHOT.jar ua.lviv.iot.fruitsshop.App`**


To check code errors:
- `mvn checkstyle:check`
- `mvn findbugs:gui`
- `mvn pmd:pmd`
<a href="https://github.com/Pashtetollo/Lab8/pull/1">
<img src="https://static.wikia.nocookie.net/bakemonogatari1645/images/b/b9/Shinobu.png/revision/latest/top-crop/width/360/height/450?cb=20161221045011" alt="image coming"/> <br>
<figcaption> <b> Go back to Pull request <b> </figcaption>
</a>
