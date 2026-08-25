#  🎓 DreamBridge
Universities face challenges in managing student course enrollment, prioritizing course registration for high-demand classes, and maintaining records for quick retrieval. DreamBridge is a University Course Enrollment System (UCES) designed to address these challenges using appropriate data structures and algorithms for efficient enrollment management.

**Demo Link:** 

## Introduction

DreamBridge is a Java-based University Course Enrollment System developed to manage student registration and course enrollment efficiently. The system applies data structures and algorithms to manage student queues, prioritize registrations, store completed enrollment records, and perform efficient searching and sorting operations.

The system was developed using object-oriented programming principles and custom data structure implementations to demonstrate the practical application of data structures and algorithms in a real-world university environment.

## System Features

### Functional Features

The system provides the following functional features:

- Self-Students Registration
- Priority Handling
- Student Enrollment
-	Review Enrolled Students
- Review Registered Students
- Sort Registered Students Alphabetically

### Non-Functional Features

The system supports:

- **Efficiency**: Uses Doubly Linked List, Priority Queue, Hash Table, Quick Sort, and Binary Search to perform registration, enrollment, searching, and sorting efficiently.

- **Scalability**: Doubly Linked List supports increasing numbers of students, while the Hash Table can be optimized to handle larger enrollment records.

- **Reliability**: Prevents duplicate student registrations and enrollments and maintains accurate and consistent student records.

- **Usability**: Provides a simple and user-friendly UI/UX with clear menus, organized forms, buttons, input validation, and informative error messages.

- **Maintainability**: Uses Object-Oriented Programming (OOP) concepts such as encapsulation, inheritance, and polymorphism. Three-Layer Architecture separates system responsibilities, making the system easier to develop, test, and maintain.

- **Security**: Uses username and password authentication to prevent unauthorized access and protect student information.

- **Persistence**: Stores student, enrollment, and registration records permanently using text files, allowing data to be loaded when the system restarts.

- **Performance**: Uses appropriate Data Structures and Algorithms (DSA), including Doubly Linked List, Priority Queue, Hash Table, Quick Sort, and Binary Search, to provide faster response times and smooth system operation.


## Data Structures



| Requirement                     | Data Structure / Algorithm             | Reason                                            |
| ------------------------------- | -------------------------------------- | ------------------------------------------------- |
| Self Student Registration       | Doubly LinkedList                      | Efficient insertion at end and removal from front |
| High-Demand Course Registration | Priority Queue                         | Processes high-priority students first            |
| Completed Enrollment Records    | Hash Table                             | Fast student lookup                               |
| Search Student by ID            | Binary Search                          | O(log n) search after sorting                     |
| Sort Students                   | Quick Sort                             | Stable and efficient O(n log n)                   |

## System Design

## System Results

