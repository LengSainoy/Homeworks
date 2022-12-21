# ArrayList Homework

1. Write a program that can verify if a password is a strong password.
   Characteristics of strong passwords are: 1.1 Password must be at least have 8
   characters long, and should not contain space 1.2 PassWord should at least
   contain one upper case letter 1.3 PassWord should at least contain one lower
   case letter 1.4 Password should at least contain one special characters 1.5
   Password should at least contain a digit

2. ReplaceAll Task:

- Create a method named replaceAll that passes three
  parameters: integer array, integer oldElement, integer newElement. The method
  replaces all the element of the array that matching with the given old
  element with the given new element, and returns the new array.

  ```text
  var arr = {10, 10, 20, 30, 40, 30, 30, 30};

  replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}
  ```

- Create the same functions for double arrays, char arrays, and String
  arrays

3. Remove all the element that has letter 'J' from the list.

```text
input:
{"Java", "Python", "JavaScript", "C#", "C++", "Javabean", "IntelliJ"}

output:
{"Python", "C#", "C++"}
```

4. In the list below remove all the that's not a palindrome

```text
{"Anna", "Racecar", "Level", "Eye", "Java", "Python", "TechCircle"}

{"Anna", "Racecar", "Level", "Eye"}
```

5. Tasks

- Create an Array of string called countries
- Write a program that can remove all the country names that have length of 10 or greater

6. Write a program that can return the nth largest number from an arraylist. Constraints: n <= arr.size()

```text
findNThLargest({ 1, 2, 3, 4, 5, 6, 7, 7 ,8, 8}, 5) ==> 4
findNThLargest({ 10, 20, 3, 11, 4, 5, 11,}, 2) ==> 11
findNThLargest({ -3, 0, 11, 4, -5, 11, 0}, 4) ==> -3
```

7. Write a program that can find the maximum, minimum and average number from
   an arrayList of integers

8. Create a class named RemoveElements:
  - Create a method that passes two
    parameters: an integer array and an integer index. the method removes the
    element at the given index of the array and returns the new array
    ```text
    Ex: int[]
    arr = {10,20,30,40} removeElement(arr, 2) ==> {10, 20, 40}
    ```

  - Create a method that passes two parameters: a double array and an
    integer index. the method removes the element at the given index of the array
    and returns the new array

  - Create a method that passes two parameters: a char array and an integer
    index. the method removes the element at the given index of the array and
    returns the new array

  - Create a method that passes two parameters: a String array and an
    integer index. the method removes the element at the given index of the array
    and returns the new array

9. write a program that find the unique names from an arraylist of string

```text
input:
[Liam,Olivia,Emma,Sophia,James,Henry,Olivia,Emma,Sophia,James,Henry]

output =
[Liam,Olivia,Emma,Sophia,James,Henry]
```

10. write a program that can remove the digits and letters from an array list
    of characters Arraylist ==>

```text
input:
[1,3,a,&,d,4,2,1,d,4,0,6,7,7,f,d,w,r,3,4,!,@]
    
output: 
&,!,@
```

11. Write a program that can sort and Arraylist of integer ascending order

12. Write a program to get unique character set from a string.

```text
input:
String str = "aaaaabbbccccdeeeefaab"; 

output : 
[a,b,c,d,e,f]
```

13. Write a program to reverse an arraylist
 	