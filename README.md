## Design pattern

<div style="display: flex; justify-content: center; align-items: center;">
  <img alt="gabriel-Java" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
</div>

- Here I wish to put some examples of designs using Java.
- Soon I'm going to implement unit tests for each example.

## Factory

Factory is a pattern that allows to create objects dynamically. 
It allows you to create objects through an interface or abstract class, hiding the details of concrete implementations.

It follows a few principles, that can be summarized as:
- Factory is open to extension, but closed to modification
- Factory is used to create objects that are related to each other

## Singleton

The Singleton pattern is a design pattern that ensures that a class has only one instance, and provides a global point of access to it.
It helps us with managing resources, such as databases, network connections, or other shared objects. 

** But remember, that it's not a good idea to use a Singleton for a global variable.


## Proxy

Proxy is a structural design pattern that provides a surrogate or placeholder for another object to control access to it.
It forbid the access to the original object, and instead, it provides a new interface to it. 
Following the principle "Prefer interfaces to classes". We can control the management of requisitions to applications,
and decide if we want to do something before or after the main function.


## Wrapper

Wrapper is an intermediate class that allows us to hide the complexity of a class from the user.
It allows us to create a new class that has the same interface as the original class, but with a different implementation.
The example I used is the PortugueseToEnglishMessageAdapter that translates a message from English to Portuguese,
where the final result is sending a Portuguese message.

## Facade

Facade is a design pattern that provides a simplified interface to a complex system by grouping together a set of interfaces from different subsystems.
The developer doesn't need to know the details of the complex system, but can use the facade to access it through a simple interface.
The example is the execution of SQL queries, from a sql file. Simplifying the usage for developers.
And a good idea would be to have comments into the class, explaining the usage.

## Decorator

Decorator is a structural design pattern that allows us to add new behavior to an object dynamically.
The example I used is the Coffee with milk and sugar. 
This example is like a cascade of classes, we add one after the other and so on. And the result of method getPrice()
is the sum of all classes in the stack.

## Strategy 

Strategy is a design pattern that allows us to define a family of algorithms, encapsulate each one, and make them interchangeable.
It's important to remember that each of them is a different implementation of the same interface.
And for new implementations, we just need to create a new class that implements the interface and add it to the map (in our case).

## Observer

Observer is a design pattern that allows us to define a subscription mechanism to notify multiple objects
about any events that happen to the object they're observing.
This case is an example like chats in whatsApp, where all users into a chat need to receive the message.
The event is the message.
The users are the observers.

## Template Method

Template Method is a design pattern that defines the program skeleton of an algorithm in the superclass 
but lets subclasses override specific steps of the algorithm without changing its structure.
It keeps the algorithm structure, but allows subclasses to change the implementation of some steps.
In my example, the structure of calculating the salary is always the same, 
however the percentage of which discount is different.

## Visitor 

This Pattern is a way to separate an algorithm from an object structure on which it operates.
It allows us to add new operations to an object structure without modifying it. And we follow the principle Single Responsibility.
My example show us a sending of a message about insurance, depending on the registered client.