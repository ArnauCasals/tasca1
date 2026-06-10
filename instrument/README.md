# Musical Instruments

## Description
Java application developed to practice inheritance, polymorphism, abstract classes, class loading, and initialization blocks.

## Exercise Statement
Create an abstract class called `Instrument` with the attributes `name` and `price`, and an abstract method `play()`.

Create the following subclasses:
- WindInstrument
- StringInstrument
- PercussionInstrument

Each subclass implements its own version of the `play()` method.

## Features
- Abstract class `Instrument`
- Inheritance with subclasses
- Polymorphism using `play()`
- Static block demonstration
- Initialization block demonstration

## Technologies
- Java
- IntelliJ IDEA
- Git
- GitHub

## Installation and Execution

1. Clone the repository:
2. Open the project in IntelliJ IDEA.
3. Run the Main class.

## Demo Output

```text
🔵 Instrument class loaded (STATIC) 
🟢 Initialization block 
🟡 Constructor Instrument 
🟢 Initialization block 
🟡 Constructor Instrument 
🟢 Initialization block 
🟡 Constructor Instrument  

A wind instrument is playing 
A string instrument is playing 
A percussion instrument is playing 
```

## Technical Decisions 

An abstract class was used to define common properties for all instruments. 
Subclasses extend this class and implement their own behavior through method overriding, 
demonstrating polymorphism and runtime method dispatch.




