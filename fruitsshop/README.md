<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNIpvMrNHbqDsOI3lSQCsIu-PEYa1O1weLuA&usqp=CAU" alt="image coming" width="1200" height ="100"/> <br>


### Class diagram:

<a href="https://drive.google.com/file/d/1YVd56iuDgkppQ48XoEcpEXYJo6nriDio/view?usp=sharing">
<img src="https://softlist.com.ua/upload/resize_cache/iblock/abc/219_219_140cd750bba9870f18aada2478b24840a/drawio.jpg" alt="link to diagram">
<p><figcaption> UML Diagram link </figcaption></p>
</a>

# Lab9
## Task

Create a REST service for one of the classes created in the previous laboratory work.<br>

## Requirements

- Service should have implemented CRUD operations.
- GET request without id in url-request should return the list of all available objects.
- The controller and RestApplication class code must be placed in separate packages.
- Saving class objects should be done in a Map object.
- The code should be checked using Findbugs / checkstyle / pmd plugins.

### To run the program:

- Clone repo:`git clone -b lab9 <url>`
- Enter the repo folder via `cd` command
- Change branch to Lab_9:`git checkout lab9`
- Run `mvn compile`
- Run `mvn package`
- Run `java -jar target\fruitsshop-1.0-SNAPSHOT.jar`

To check code errors:
- `mvn checkstyle:check`
- `mvn findbugs:gui`
- `mvn pmd:pmd`

<a href="https://github.com/Pashtetollo/Lab8/pull/2">
<img src="https://i0.wp.com/www.wishlovequotes.com/wp-content/uploads/2020/09/have-a-good-day-meme-1.jpg" alt="image coming" width="300" height ="300"/> <br>
<figcaption> <b> Go to lab9 branch </b> </figcaption>
</a>