## Design pattern

<div style="display: flex; justify-content: center; align-items: center;">
  <img alt="gabriel-Java" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
</div>

- Here I wish to put some examples of designs using Java.

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