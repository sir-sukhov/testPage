1. Clone the project
2. Package with maven
3. Run the test:

```
user@laptop:~/Projects/getatlas/target > java -jar testPage-1.0-SNAPSHOT.jar https://google.com/ 'Google'
Checking if https://google.com/ contains substring 'Google'
Success!!!
user@laptop:~/Projects/getatlas/target > java -jar testPage-1.0-SNAPSHOT.jar https://google.com/ 'Yahoo!!!'
Checking if https://google.com/ contains substring 'Yahoo!!!'
Failure!!!
```