# Car Project

## Description
Java application developed to practice the concepts of `static`, `final`, class variables, instance variables, and object-oriented programming principles.

---

## Objective
The goal of this project is to understand how `static` and `final` work in Java by creating a Car class and observing their behavior with multiple objects.

---

## Exercise Statement
Create a class called `Car` with the following attributes:

- `brand`: static final
- `model`: static
- `power`: final

Also implement:
- A static method `brake()`
- A non-static method `accelerate()`

Finally, demonstrate their behavior from the main method.

---

## Features
- Use of static attributes
- Use of final attributes
- Difference between class and instance variables
- Static and non-static methods
- Behavior analysis with multiple objects

---

## Technologies
- Java
- IntelliJ IDEA
- Git
- GitHub

---

## How to Run

1. Clone the repository:
2. Open the project in IntelliJ IDEA.
3. Run the Main class.

---

## Demo Output

Car c1 = new Car("A3", 120);  
Car c2 = new Car("Q2", 85);

Car.brake()  
Car is braking

c1.accelerate()  
Car is accelerating

c2.accelerate()  
Car is accelerating

## Reflection – static vs final

### Which attribute can be initialized in the constructor?
- `power` → it can be initialized because it is `final` but not `static`

### Which attribute cannot be modified?
- `brand` → because it is `static final` and behaves as a constant

### Which attribute affects all instances?
- `model` → because it is `static`, shared between all objects

---

## Key Concepts Learned

- `static` belongs to the class, not to the object
- `final` allows only one assignment
- `static final` creates constants
- Instance variables belong to each object
- Changes in static variables affect all instances

---

## Conclusion

This project demonstrates how `static` and `final` influence memory 
behavior in Java and how they affect the relationship between classes and objects.
