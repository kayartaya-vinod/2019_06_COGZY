### Assignment 1

1. Write a brief history of Java Programming Language
2. Explain Primitive types in Java
3. What are the different programming constructs in java? Explain with examples.

---

### Assignment 2

Implement the body for the following function:


````java
static boolean isValidDate(int year, int month, int day) { 
	// do stuff here
	return false; 
}
````

The function should check if the parameter values constitute a valid calendar date or not. Accordingly return true or false.


For example,


1) year=2018, month=13, day=1 is an invalid date as the possible values for month is 1 to 12.
2) year=2018, month=2, day=29 is an invalid date as the maximum days in February is 28 in the year 2018
3) year=2016, month=2, day=29 is a valid date.

Write a Java program to call the above function multiple times with different values.


---

### Assignment 3

Implement the body for the following function:

````java
static boolean isPrimeNumber(int num) { 
	// do stuff here
	return false; 
}
````

The function should check and return true only if the number passed as argument is a prime number.
  
Write a Java program to call the above function multiple times with different values.


---

### Assignment 4

Write a function called "sortThreeNumbers", which takes 3 distinct integers and prints them in ascending order.

````java
public void sortThreeNumbers(int a, int b, int c) { 
	// do stuff here
}

````
For example,

* sortThreeNumbers(2, 10, 1); // prints 1, 2, 10 
* sortThreeNumbers(20, 10, 1); // prints 1, 10, 20 
* sortThreeNumbers(2, 10, 100); // prints 2, 10, 100 and so on.


Write a Java program to call the above function multiple times with different values.

---

### Assignment 5

Write a function called "sumOfPrimes", that takes two integers as input and returns the sum of all the prime numbers between the same.

````java
public int sumOfPrimes(int from, int to) { 
	// do stuff here
	return 0; 
}
````

Write a Java program to call the above function multiple times with different values.


---

### Assignment 6

In mathematics, the Fibonacci numbers are the numbers in the following integer sequence, characterized by the fact that every number after the first two numbers is the sum of the two preceding ones:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Write a function called "fibonacci", that takes index as paramter and returns the fibonacci number at that index.

````java
public int fibonacci(int index) { 
	// do stuff here
	return 0; 
}
````

---

### Assignment 7

Write a Java program to print the following pattern:

````
*
**
***
****
*****
````

The number of rows should be based on the value of a variable "num", and the number of stars in a row is based on the row number itself.


---

### Assignment 8

In trignometry, the Sine of an angle is represented by the series below:

<img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/3d9689077ce39529e3198213901261ebcf48197d">


Write a Java function that accepts angle in degrees and returns the sine of the given angle.

Call the function in main, multiple times by supplying multiple values and verify the same.

PS:
* Divide the function into small reusable functions, if possible.
* Do not use builtin Java classes like `Math`
---

### Assignment 9


Implement the Java function listed below:

````java
public static void printCalendar(int month, int year) {
	/// do stuff here
}
````

The function should accept `month` and `year` and print the calendar for the same. If inputs are invalid, appropriate error message/s should be printed.

Sample output for the inputs (8, 2018):

````
Su Mo Tu We Th Fr Sa  
          1  2  3  4  
 5  6  7  8  9 10 11  
12 13 14 15 16 17 18  
19 20 21 22 23 24 25  
26 27 28 29 30 31  
````

PS: 
* Do not use any builtin Java classes like `Date` or `Calendar`
* Divide the function into small reusable functions, if possible.

---

### Assignment 10
Write a function called "sumOfEvensAndOdds", that takes an array of integers as input and returns another array of integers of length 2. The first element in the returned array is the sum of all even numbers in the input array, and the second element in the returned array is the sum of all odd numbers in the input array.

````java
public int[] sumOfEvensAndOdds(int []nums) { 
	// do stuff here
	return null;
}
````

For example,
 
````java
int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
int [] result = sumOfEvensAndOdds(nums);
// result should be equal to {30, 25}
````

Hint:

An arrays is created as shown below:

````java
int []arr = new int[2];
arr[0] = 12;
arr[1] = 100;
````

or

````java
int []arr = {12, 100}
````

Call the function in main, multiple times by supplying multiple values and verify the same.

---

### Assignment 11
Write a function called "reverseByWords", that takes a sentence (string) as an input, and returns another string. The return value must be a sentence in which the words in the original sentence appear in reverse order.

````java
public String reverseByWords(String sentence) { 
	// do stuff here
	return null; 
}
````


For example,

````java
String out = reverseByWords("my name is vinod and i live in bangalore");
// the variable "out" should be equal to "bangalore in live i and vinod is name my".
````

Call the function in main, multiple times by supplying multiple values and verify the same.

---
### Assignment 12


Write a function called "inWords" that takes a number between 1 and 99,99,99,999 and returns a String representing the input number in words.

````java
public String inWords(int num) { 
	// do stuff here
	return null; 
}

````
For example,

````java
inWords(12345);
// should return "twelve thousand three hundred forty five"
inWords(10203040);
// should return "one crore two lakh three thousand forty"
inWords(101);
// should return "one hundred one"
````


Call the function in main, multiple times by supplying multiple values and verify the same.

---
### Assignment 13

Implement the following function:

```java
public static void printAllCombinations(String word) {
	// do stuff here
}
```

The function should take a word (no spaces and special characters, only alpha numeric), and print all possible combinations of letters in the given word.

For example, for the input "win", the output should be:

```
[iwn, nwi, inw, wni, win, niw]
```

And for the input "vinod", the output should be:
```
[vidon, vonid, doniv, dovin, inodv, ivdon, vdnio, nivod, ovdin, ivodn, viodn, noidv, 
ondiv, dvoni, vidno, indvo, ivdno, nvodi, oindv, oivdn, idvon, dnovi, idnov, nvdoi, 
onidv, doinv, vndoi, voind, noivd, vdion, iovnd, ovidn, nvoid, idvno, ionvd, dvnoi, 
vnido, oidvn, vdoni, ndivo, vindo, novdi, idnvo, ndoiv, oidnv, dionv, vndio, iovdn, 
iondv, viond, ndvoi, odniv, odvin, diovn, nodiv, nviod, onvdi, vodni, invod, ovndi, 
vinod, dinov, vodin, divon, donvi, nvdio, ivnod, idonv, ovdni, dvion, nidov, ovnid, 
ondvi, niodv, idovn, ndvio, onvid, dvino, divno, vnoid, dnoiv, odivn, ndiov, vondi, 
nvido, dnivo, dinvo, dnvoi, odinv, dvoin, iodnv, nidvo, doivn, invdo, ovind, vdoin, 
iodvn, vnodi, oinvd, ndovi, vdino, ivndo, onivd, nivdo, oivnd, inovd, ivond, dnvio, 
odnvi, voidn, novid, dniov, dovni, vniod, nodvi, odvni, vdnoi, dvnio, indov, niovd]

```

Call the function in main, multiple times by supplying multiple values and verify the same.

---
### Assignment 14

Implement the following function:

```java
public static String generatePassword(int length) {
	// do stuff here
}
```

The function should return a random string, each time when called, of required length (function argument). The password consists of lower case and upper case alphabets, digits from 0 to 9, special characters ~!@#$%^&*



Hint: 

`Math.random()` returns a number between 0.0 and 1.0



---
### Assignment 15

Create classes `Circle` and `Cylinder` as shown in the *UML* diagram below:

![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_CircleCylinder.png "")


In the `main()` function of a Program class, create an array of `Circle` references with the initialization shown below:

````java
Circle[] circles = {
	new Cylinder(12.34),
	new Cylinder(12.34, 10.0),
	new Cylinder(12.34, 10.0, "blue")
};

````

Print the area of the circular region of each cylinder along with the volume of the same.


---
### Assignment 16

Create the classes `Person`, `Student`, and `Staff` as shown in the *UML* diagram below:

![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_PersonAndSubclasses.png "")



In the `main()` function of a Program class, create an array of `Person` references with the initialization shown below:

````java
Person[] people = {
	new Student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0),
	new Staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0), 
	new Staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0), 
	new Student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0),
	new Student("Kiran", "Vasco, Goa", "Reactjs", 2017, 12500.0)
};

````

Print the details of all `Person` objects (using the `toString()`).


---

### Assignment 17

Create the classes `Shape`, `Circle`, `Rectangle`, and `Square` as shown in the *UML* diagram below:


![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_ShapeAndSubclasses.png "")


The `toString` function of the above classes should return text as given below:

Classname|Sample return value from toString()
---|---
Shape|A Shape with color of xxx and filled/Not filled
Circle|A Circle with radius=xxx, which is a subclass of yyy (where yyy is the output of the toString() method from the superclass)
Rectangle|A Rectangle with width=xxx and length=zzz, which is a subclass of yyy (where yyy is the output of the toString() method from the superclass)
Square|A Square with side=xxx, which is a subclass of yyy (where yyy is the output of the toString() method from the superclass)

In the `main()` method of a Program class, create an array of 10 `Shape` references containing a mixture of `Circle`, `Rectangle` and `Square` objects of different dimensions. Using a loop, print the `perimeter` and `area` for all of them.


---

### Assignment 18

Write a Java application to accept integers in a loop. After each number is accepted, the user should be asked if he/she wishes to continue. If the user inputs "NO", then the loop should be stopped and following output should be displayed:

```
Number of inputs = X
Number of integer inputs = Y
Number of non-integer inputs = Z
Sum of all integer inputs = XX
The integer inputs = N1, N2, N3, ...
The non-integer inputs = ASD, SDF, DFG, ...
X, Y, Z, etc should be actual values, based on the inputs.
```

HINT: 

Use `java.util.Scanner` for accepting data from the user. 

```java
Scanner s = new Scanner(System.in);
String input = s.nextLine();
int n = s.nextInt();
double d = s.nextDouble();
// ... s
```

---

### Assignment 19

Write a function called "calendar" that takes a String representing year/month in YYYY-MM format and returns a two-dimensional array representing the calendar for the input month and year.


For example, if the input is "2018-03”, then the output is:

```
{
	{0, 0, 0, 0, 1, 2, 3},
	{4, 5, 6, 7, 8, 9, 10},
	{11, 12, 13, 14, 15, 16, 17}, 
	{18, 19, 20, 21, 22, 23, 24}, 
	{25, 26, 27, 28, 29, 30, 31}
}
```

For input "2018-02", the output should be:

```
{
	{0, 0, 0, 0, 1, 2, 3},
	{4, 5, 6, 7, 8, 9 10},
	{11, 12, 13, 14, 15, 16, 17}, 
	{18, 19, 20, 21, 22, 23, 24}, 
	{25, 26, 27, 28, 0, 0, 0}
}
```
The method should throw a custom exception **InvalidDateException**, in case if the input does not represent a valid year/month combination, and **InvalidInputException** in case if the input is not in the expected YYYY-MM format.



---

### Assignment 20

Interface *Movable* and its implementations *MovablePoint* and *MovableCircle*


Write two concrete classes - MovablePoint and MovableCircle - that implement the Movable interface.

![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_Movable.png "")

For the MovablePoint class, declare the instance variable x, y, xSpeed and ySpeed with package access as shown with '~' in the class diagram (i.e., classes in the same package can access these variables directly). For the MovableCircle class, use a MovablePoint to represent its center (which contains four variable x, y, xSpeed and ySpeed). In other words, the MovableCircle composes a MovablePoint, and its radius.


```java
public class MovablePoint implements Movable {
   // instance variables
   int x, y, xSpeed, ySpeed;     // package access
   
   // Constructor
   public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
      this.x = x;
      ......
   }
   ......
   
   // Implement abstract methods declared in the interface Movable
   @Override
   public void moveUp() {
      y -= ySpeed;   // y-axis pointing down for 2D graphics
   }
   ......
}
```


```java
public class MovableCircle implements Movable { // saved as "MovableCircle.java"
   // instance variables
   private MovablePoint center;   // can use center.x, center.y directly
                                  //  because they are package accessible
   private int radius;
   
   // Constructor
   public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
      // Call the MovablePoint's constructor to allocate the center instance.
      center = new MovablePoint(x, y, xSpeed, ySpeed);
      ......
   }
   ......
   
   // Implement abstract methods declared in the interface Movable
   @Override
   public void moveUp() {
      center.y -= center.ySpeed;
   }
   ......
}
```

Write a test program and try out these statements:

```java
Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
System.out.println(m1);
m1.moveLeft();
System.out.println(m1);
   
Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
System.out.println(m2);
m2.moveRight();
System.out.println(m2);
```

Write a new class called *MovableRectangle*, which composes two *MovablePoint* objects (representing the top-left and bottom-right corners) and implementing the *Movable* Interface. Make sure that the two points has the same speed.

![](http://www.ntu.edu.sg/home/ehchua/programming/java/images/ExerciseOOP_MovableRectangle.png "")


In the test program, add the following code to test the new implementation:

```java
 
Movable m3 = new MovableRectangle(1, 2, 3, 4, 25, 35);  // upcast
System.out.println(m3);
m3.moveUp();
System.out.println(m3);
```



---

### Assignment 21


Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string). Read the string from the command line.

For example, running the program as shown below should produce a similar output:

```
java Main Hello World
{d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
```

Each *character* is printed along with the *list of indexes* where that character appear.


---

### Assignment 22


Implement the `ContactsDao` interface using `HashMap` for the `PhonebookApp`.

Class: *com.slk.training.entity.Contact*

```java
public class Contact {

	private static int idCounter;

	private int id;
	private String firstname;
	private String lastname;
	private Gender gender = Gender.MALE;
	private String email;
	private String phone;
	private String address;
	private String city = "Bangalore";
	private String state = "Karnataka";
	private Integer pincode;
	private String country = "India";
	private Date birthDate;

	public Contact() {
		this.id = ++idCounter;
	}

	public Contact(String firstname, String lastname, String email, String phone, String city) {
		this.id = ++idCounter;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	// getters and setters

}
```

Interface *com.slk.training.dao.ContactsDao*

```java
public interface ContactsDao {
	// CRUD operations
	public void addContact(Contact contact) throws DaoException;
	public Contact getContact(int id) throws DaoException;
	public void updateContact(Contact contact) throws DaoException;
	public void deleteContact(int id) throws DaoException;

	// Queries
	public Contact getContactByEmail(String email) throws DaoException;
	public Contact getContactByPhone(String phone) throws DaoException;
	public List<Contact> getContactsByLastname(String lastname) throws DaoException;
	public List<Contact> getContactsByCity(String city) throws DaoException;
	public List<Contact> getContacts() throws DaoException;
	public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException;
}
```

Class *com.slk.training.dao.impl.ContactsDaoHashMapIpml*

```java
public class ContactsDaoHashMapIpml implements ContactsDao {

	private Map<Integer, Contact> map;

	public ContactsDaoHashMapIpml() {
		map = new HashMap<>();
	}

	// implement the methods from the ContactsDao interface 
	// that store/retrieve/modify the data stored in the variable 'map'

```

Note: 

* Get the latest version of *PhonebookApp.java* from <a href="https://github.com/kayartaya-vinod/2018_08_SLK_BOOTCAMP_JAVA/blob/master/JAVA_WORKSPACE/01%20Java%20Basics/src/com/slk/training/programs/PhonebookApp.java">here</a>
* Once you implement each method, test the same by running the `PhonebookApp` class

### Create a new implementation of the interface `ContactsDao` which stores/reads the data from a CSV file.

```java
public class ContactsDaoCsvIpml implements ContactsDao {
	private Map<Integer, Contact> map;
	private String filename = "contacts.csv";

	public ContactsDaoCsvIpml() {
		map = new HashMap<>();
		// populate the map from the CSV file, if the file exists
	}

	public void saveToCsv() {
		// For each Contact object stored in the map create a CSV line.
		// For example: "1,Vinod,Kumar,MALE,vinod@vinod.co,9731424784,,Bangalore,Karnataka,,India,1974-01-20"
		// Note two commas between phone and city (...,9731424784,,Bangalore,..). This is for pincode, which is null
		// Use FileWriter/PrintWriter to write the CSV line.

		// Make sure to create a header line and add to CSV file before any record.
		// In addContact/updateContact/deleteContact functions, add/update/delete contact objects in the map
		// and call this function to store (overwrite) the entire map into file.
	}

	// implement the methods from the ContactsDao interface 
	// that store/retrieve/modify the data stored in the variable 'map'

}
```

### JDBC implementation

Create a new database `assignment_22`, and create table `CONTACTS` with the following fields:

Column name|Data type
---|---
id|int (primary key, autoincrement)
first_name|varchar(50)
last_name|varchar(50)
gender|varchar(10)
email|varchar(250)
phone|varchar(50)
address|varchar(250)
city|varchar(50)
state|varchar(50)
pincode|Integer
country|varchar(50)
birth_date|Date


Create a class `ContactsDaoJdbcImpl` that implements `ContactsDao` interface

Each method of this class must use *JDBC* api to store/retrieve data from **CONTACTS** table in the H2 database.

For example, the `getContacts()` method should do the following:

```java
public List<Contact> getContacts() throws DaoExceptoion {
	String sql = "select * from contacts";
	List<Contct> list = new ArrayList<>();

	try(
		// Open Connection
		// Create PreparedStatement
		// Execute the query and get the ResultSet
	) {
		// Using a loop, for each record in the ResultSet, 
		// create a Contact object and add to the ArrayList
	}
	catch(Exception ex) {
		throw new DaoException(ex);
	}

	return list;
}
```

Another example:

The `addContact(Contact contact)` method should do the following:

```java
public void addContact(Contact contact) throws DaoException {
	// Do the necessary validations

	String sql = "insert into contacts (first_name, last_name, gender, email, phone, address, city, state, pincode, country, birth_date) values (?,?,?,?,?,?,?,?,?,?,?)";

	try(
		// Open Connection
		// Create PreparedStatement
	) {
		// set the PreparedStatement's parameters using the function's argument contact
		// For example, stmt.setString(1, contact.getFirstname()) and so on..

		// for stmt.setDate(pos, value), value should be of java.sql.Date and not java.util.Date
		// to convert, use this statment: new java.sql.Date(contact.getBirthDate().getTime())

		// execute the statement
	}
	catch(Exception ex) {
		throw new DaoException(ex);
	}

}
```

---

### Assignment 23

# Contact Details Management System

<a href="./Assignment23.pdf">Read this document</a>