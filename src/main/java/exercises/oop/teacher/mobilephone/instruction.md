# Mobile Phone (Class + ArrayList)

Create a program that implements a simple mobile phone with the following capabilities.

## 1. Mobile Phone Class

Implement the master class **MobilePhone**, that holds the _ArrayList of Contacts_, with the

following attributes:

- Two fields, a `String` called `myNumber` and an `ArrayList` of type `Contact` called
  `myContacts`.
- A constructor that takes a `String` (the phone number) and initialises `myNumber` and
  instantiates `myContacts`. and add your number as the first contact name `Me`.
- And have at least seven methods, they are (their functions are in their names):
    - `addNewContact()`, hs one parameter of type `Contact` and returns a `boolean`. Returns
      `true` if the contact doesn't exists, or `false` if the contact already exists.
    - `updateContact()`, has two parameters of type `Contact` (the old contact that will be updated
      with the new contact) and returns a `boolean`. Return `true` if the contact exists and was
      updated successfully or `false` if the contact doesn't exist.
    - `removeContact()`, has one parameter of type `Contact` and returns a `boolean`. Returns
      `true` if the contact exists and was removed successfully, or `false` if the contact doesn't
      exists.
    - `findContact()`, has one parameter of type `Contact` and returns an `int`. The returned value
      is it's position in the `ArrayList`, it will either be `-1` (doesn't exists) or a value
      greater than or equal to `0` (does exists).
    - `findContact()`, same as above, only it has one parameter of type `String`.
    - `queryContact()`, has one parameter of type `String` and returns a `Contact`. Use the
      `String` to search for the name and then return the `Contact`. Return `null` otherwise.
    - `printContacts()`, has no parameters and doesn't return anything. Print the contacts in the
      following format:

```text
Contact List:
1. Me -> 888-888-1234
2. Bob -> 314-159-2655
3. Alice -> 161-803-3999
4. Tom -> 112-358-1313
5. Jane -> 234-711-1113
```

## 2. Contact Class

Implement the **Contact** class with the following attributes:

- Two fields, both `String`, one called `name` and the other `phoneNumber`.
- A constructor that takes two `String`s, and initializes `name` and `phoneNumber`.
- And have at least Three methods, they are:
    - `getName()`, getter for name.
    - `getPhoneNumber()`, getter for phoneNumber.
    - `createContact()`, has two parameters of type `String` (the persons name and phone number)
      and returns an instance of `Contact`. This method _belong to the class_.

### Tips

- In **MobilePhone**, use `findContact()` in the other methods (except `printContacts()`) to check
  if it exists before proceeding.
- Two `Contact` objects are **equal** if they have the same `name`.
- Be extremely careful about spaces in the printed message.

### Notes

- All fields are **private**.
- Feel free to add more method(s) if required.
- Constructors should be defined as **public**.
- All methods should be defined as **public** (except for the two `findContact()` methods which
  are **private**).
- Do not add a **main** method to the solution code.

### Example

Test code:
```java
class TestMobilePhone {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("888-888-1234");
        phone.addNewContact(Contact.createContact("Bob", "314-159-2655"));
        phone.addNewContact(Contact.createContact("Alice", "161-803-3999"));
        phone.printContacts();

        // When add contact with the same name. it shouldn't be added.
        System.out.println(phone.addNewContact(Contact.createContact("Bob","202-123-1234")));
        phone.printContacts();
        System.out.println(phone.findContact("Bob"));

        Contact c1 = new Contact("Lily", "434-404-4040");
        phone.addNewContact(c1);
        phone.printContacts();

        phone.removeContact(c1);
        phone.printContacts(); // Lily is removed

        phone.addNewContact(Contact.createContact("Tom", "112-358-1313"));
        phone.addNewContact(Contact.createContact("Jane", "234-711-1113"));
        Contact foundContact = phone.queryContact("Tom");
        Contact notFoundContact = phone.queryContact("Maya");
        System.out.println("foundContact = " + foundContact);
        System.out.println("notFoundContact = " + notFoundContact);

        Contact c2 = new Contact("Susan","234-711-1113");
        phone.addNewContact(c2);
        System.out.println("Before updated contact");
        phone.printContacts();

        phone.updateContact(c2, Contact.createContact("Sarah", "571-111-3425"));
        System.out.println("After updated contact");
        phone.printContacts();
    }
}
```

Output:
```text
============ 
Contact List:
1. Me -> 888-888-1234
2. Bob -> 314-159-2655
3. Alice -> 161-803-3999
============ 
false
============ 
Contact List:
1. Me -> 888-888-1234
2. Bob -> 314-159-2655
3. Alice -> 161-803-3999
============ 
1
============ 
Contact List:
1. Me -> 888-888-1234
2. Bob -> 314-159-2655
3. Alice -> 161-803-3999
4. Lily -> 434-404-4040
============ 
============ 
Contact List:
1. Me -> 888-888-1234
2. Bob -> 314-159-2655
3. Alice -> 161-803-3999
============ 
foundContact = Tom -> 112-358-1313
notFoundContact = null
Before updated contact
============ 
Contact List:
1. Me -> 888-888-1234
2. Bob -> 314-159-2655
3. Alice -> 161-803-3999
4. Tom -> 112-358-1313
5. Jane -> 234-711-1113
6. Susan -> 234-711-1113
============ 
After updated contact
============ 
Contact List:
1. Me -> 888-888-1234
2. Bob -> 314-159-2655
3. Alice -> 161-803-3999
4. Tom -> 112-358-1313
5. Jane -> 234-711-1113
6. Sarah -> 571-111-3425
============
```