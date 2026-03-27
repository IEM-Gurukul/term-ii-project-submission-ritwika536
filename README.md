[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Online Online Quiz Engine Using Factory Pattern for Question Types

---

## Problem Statement (max 150 words)
Many quiz systems are designed in a rigid way where adding new types of questions requires modifying existing code, making the system difficult to maintain and extend. Educational platforms often require quizzes with different formats such as multiple-choice, true/false, and short-answer questions. Without a flexible design, managing these variations becomes complex and leads to code duplication. The proposed Online Quiz Engine addresses this problem by using Object-Oriented Programming principles and the Factory Design Pattern to dynamically create different types of questions. The system allows quizzes to contain multiple question formats while maintaining a clean and scalable structure. By using abstraction, inheritance, and polymorphism, the engine can process different question types uniformly. Exception handling ensures reliability during user interaction, while collections manage quiz questions dynamically. This approach creates a flexible, maintainable, and extensible quiz system suitable for educational applications.

---

## Target User
1.  Students taking online quizzes for learning or assessment
2. Teachers or instructors creating quizzes
3.  Educational platforms or training systems


---

## Core Features

- Create quizzes containing multiple types of questions
- Support different question formats (MCQ, True/False, Short Answer)
- Dynamically create question objects using the Factory Pattern 

---

## OOP Concepts Used

- Abstraction:An abstract class Question will define common attributes and methods such as displayQuestion() and checkAnswer(), hiding the specific implementation details of each question type.
- Inheritance:Different question types such as MCQQuestion, TrueFalseQuestion, and ShortAnswerQuestion will inherit from the abstract Question class and extend its behavior.
- Polymorphism:The method checkAnswer() will be overridden in each subclass so that each question type evaluates answers differently while being handled uniformly by the quiz engine.
- Exception Handling:Exception handling will manage issues such as invalid question types, incorrect answer formats, or invalid option selections using try-catch blocks and custom exceptions.
- Collections / Threads:The system will use ArrayList<Question> to store quiz questions dynamically. Optionally, threads can be implemented to support quiz timers or countdown features.

---

## Proposed Architecture Description
The system will follow a layered architecture consisting of a User Interface layer, a Business Logic layer, and a Data Management layer. The UI layer handles user interaction, displaying questions and collecting answers through a console interface. The Business Logic layer, implemented by the Quiz Engine, manages quiz execution, answer evaluation, and score calculation. The Data layer stores and retrieves questions using collections. A Question Factory is used to create different question objects dynamically based on the requested type, ensuring loose coupling and easy extensibility. This architecture keeps the system modular, maintainable, and scalable.

---

## How to Run
Clone the repository from GitHub.
Open the project folder in a terminal or command prompt.
Compile the Java files using javac src/*.java.
Run the program using java -cp src Main.
The quiz will start in the console and you can answer the questions.

---

## Git Discipline Notes
Minimum 10 meaningful commits required.
