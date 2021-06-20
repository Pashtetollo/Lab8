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

This work is devoted to working with files and write operations, and is also based on laboratory 8

For the implemented class hierarchy in the 8th laboratory, the list of objects present in the manager should be written to a CSV file.
Suppose that CrocodileManager is implemented in Lab 8, which contains a list of objects derived from the Crocodile class. For each class derived from Crocodile and in the Crocodile class itself, two methods should be implemented:

public String getHeaders () {…} - returns a string of attributes present in this class, separated by a comma
public String toCSV () {...} - returns the value of the attributes (field values) of this object, separated by commas

The implementation of the toCSV method in child classes should also call this method from the parent class. Fields declared in the parent class must be converted to a comma-separated tape in the parent class.

To implement a file entry, you must implement a separate Writer class (for example, CrocodileWriter), which will contain the public void writeToFile (List <Crocodile> crocodiles) method. The call of this method should be implemented from tests
The code must match the code convention
The code should be checked with FindBugs, PMD and Spotbugs plug-ins, and bug fixes
The code must be populated into the repository as a separate pull request (not a separate folder)
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
