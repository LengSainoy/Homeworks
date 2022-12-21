
# Class and Object Homework

## 1. Offer Task:
1. Create a custom class named Offer 
   - Attributes: 
     - location, 
     - companyName, 
     - jobTitle, 
     - salary, 
     - hasBenefit, 
     - hasPTO, 
     - isWFH, 
     - isFullTime

   - Actions:
     - setInfo(): sets all the instance variables
     - toString(): returns the full info of the Offer Object

2. Create a class named MyOffers with `main()`. In this class do the following
   - Create 7 objects of Offer 
     - Create an array of Offers named myOffers and store all 7 objects of offers 
     - Create an ArrayList of Offer named fullTimeOffers and add all the offer objects. 
       - Write a program that can remove the offer objects that are not full-time
     - Create an ArrayList of Offer named localOffers and add all the offer objects.
       - Write a program that can remove all the offers that are not from local
     - Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
       - Write a program that can remove all the offers that does not have benefit and does not have PTO
     - Create an ArrayList of Offer named SDET Offers and add all the offer objects.
       - Write a program that can remove all the offers that are not for SDET
     - Create an ArrayList of Offer named offersWith100K and add all the offer objects.
       - Write a program that can remove all the offers that are offering less than 100K salary

## 2. BankAccount Task:
1. Attributes: 
  - accountHolder, 
  - accountNumber, 
  - balance
	                
2. Actions: 
  - setInfo(): sets the accountHolder and accountNumber attributes
  - toString(): to return string like so
```text
Account holder: <name of account holder>
Account number: <account number>
Account balance: <remaining balance in the account>
```
	
- checkBalance(): displays the available balance
- deposit(): increases the balance by the given amount
- withdraw(): decreases the balance by the given amount

## 3. Pizza Task:
1. **Attributes**: `size`, `numberofCheeseTopping`, `numberOfPepperoniTopping`
2. Add a **constructor** that can set all the fields
3. **Actions**:
- calcCost(): returns the totalCost of the pizza
- toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated 
  by calcCost()

> Note: 
> Pizza cost is determined by:
> * S: $10 + $2 per topping
> * M: $12 + $2 per topping
> * L: $14 + $2 per topping

## 4. Scrum Task:
1. create a class called `Tester`
   1. With following Attributes: `name`, `employeeID`, `JobTitle`, `Salary`
   2. Add A constructor that can set all the fields
   3. Actions: `smokeTesting()`,  `creatingTicket()`, `dailyStandUp()`, `toString()`

2. create a class called `Developer`
   1. Attributes: `name`, `employeeID`, `JobTitle`, `Salary`     
   2. Add A constructor that can set all the fields
   3. Actions: `coding()`, `unitTesting()`, `fixingBug()`, `toString()`

3. create a class called `ScrumTeam`
   1. Attributes: String `PO`, `BA`, `SM`;
	```java
	ArrayList<Tester> testersList = new ArrayList<>();
	ArrayList<Developer> devopsList = new ArrayList<>();
	int daysOfSprint;
	```
   2. Add A constructor that can set the fileds PO, BA, and SM
   3. Actions:         
      - addTester(Tester tester): adds the given tester to the testers ArrayList 
      - addTesters(Tester[] testers): adds the given testers to the testers ArrayList 
      - addDeveloper(Developer developer): adds the given developer to the developers ArrayList 
      - addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList 
      - removeTester(long employeeID): removes the given tester from the testers ArrayList 
      - removeDeveloper(long employeeID): removes the developer from the developers ArrayList 
      - toString(): prints number of tester,& developers,  PO name, SM name, BA name

4. create a class called MyScrumTeam:
   1. create an array of Testers and add the testers from your group
   2. create an array of developers add the developers from your group
   3. create an object of ScrumTeam and store the testers & developers above to the scrum team

---

# Encapsulations 
## Task A:
1. Create an `Employee` Class: with variables - `name`, `gender`, `age`, `salary`
2. Add this logic to validate the setter of private fields 
   1. `name` can not be _empty_ 
   2. `gender` can not anything other than `female` or `male` 
   3. `age` can not be less than `16`, and greater than `90` 
   4. `salary` can not be _zero_ or _negative_

### Tips:
- All fields must be _private_

## Task B:
1. Create a class named `Circle`: with 
   1. _private_ variables - `radius`
   2. _public_ variable - `pi`
2. Encapsulate all the private fields
   1. radius of the circle can not be zero or negative
3. Add a constructor that can set the `radius` of `circle` when circle object is created
4. Methods: `calcArea()`, `calcPerimeter()`, `toString()`

## Task C:
1. Create a class named Student:
   1. private variables: `name`, `age`, `gender`, `grade`, `schoolName`
2. Encapsulate all the fields (at least encapsulate two fields manually)
   * Requirements:
     1. `age` should not be set less than 5 or greater than 90
     2. `gender` should not be set to any character other than: `M` and `F`
     3. `grade` should not be set to any characters other than: `A`, `B`, `C`, `D`, and `F`
3. Add a constructor that can set all the fields when the object is created (requirements of fields in the above 
   must be applied)
4. Methods: `study()`, `toString()`

# Inheritance
## Car Task:

1. Create a class called `Car`
   2. Instance variables: `make`, `model`, `year`, `price`, `color`, `miles`
   3. Add a constructor to set all the fields
   4. Instance methods: `start()`, `drive()`, `toString()`

2. Create the following sub classes of Car:
   1. class `Toyota` with extra methods: `reliable()`
   2. class `BMW` with extra methods: `breaksDown()`, `racing()`
   3. class `Tesla` with extra methods: `autoPilot()`

## CaptalOne Task:
1. Create a class named `Person`:
   1. Variables: `name`, `age`, `gender`
   2. Encapsulate all the fields
   3. Add a constructor to set all the fields
   4. Methods: `eat()`, `drink()`, `sleep()`, `toString()`

2. Create a sub class of `Person` named `Employee`:
   1. Extra variables: `employeeId`, `jobTitle`, `salary` 
   2. Encapsulate all the fields 
   3. Add a constructor to set all the fields 
   4. Methods: `work()`, `toString()`

3. Create a sub class of Employee named Tester
   1. Override the work method 
   2. Extra methods: `createTicket()`

4. Create a sub class of Employee named Developer
   1. Override the work method 
   2. Extra methods: `fixingBugs()`

5. Create a sub class of Employee named Teacher
   1. Override the work method 

6. Create a sub class of Person named Student
   1. Extra variables: `studentId`, `fieldOfStudy`
   2. Encapsulate all the fields
   3. Add a constructor to set all the fields
   4. Encapsulate all the fields
   5. Methods: `study()`

7. Create a class named `CaptalOne`:
   1. Create objects of `Tester`, `Developer`, `Teacher`, `Student`
   2. Test all the functions of each objects
   3. Analyze the relationships between the classes 

