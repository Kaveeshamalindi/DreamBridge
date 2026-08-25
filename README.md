#  🎓 DreamBridge

## Introduction

<p align="justify"> DreamBridge is a Java-based University Course Enrollment System developed to manage <B>student registration</B> and <B>course enrollment</B> efficiently. The system applies <B>data structures and algorithms</B> to manage <B>student queues, prioritize registrations, store completed enrollment records, and perform efficient searching and sorting operations.</B> </p>

<p align="justify"> The system was developed using <B>object-oriented programming principles</B> and custom data structure implementations to demonstrate the practical <B>application of data structures and algorithms</B> in a real-world university environment. </p>

**Demo Link:** 

---

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

---

### Technologies Used

This project was developed using the following technologies:

| **Technology / Concept**                 | **Purpose**                                                                |
| ---------------------------------------- | -------------------------------------------------------------------------- |
| **Java**                                 | Main programming language used to develop the system                       |
| **NetBeans IDE**                         | Development environment used for coding, testing, and debugging            |
| **Java Swing**                           | Used to develop the graphical user interface (GUI)                         |
| **OOP**                                  | Provides a structured and modular approach to software development         |
| **File Handling**                        | Used for permanent storage and retrieval of student and enrollment records |
| **Exception Handling**                   | Used to handle errors and invalid user inputs efficiently                  |
| **Custom Data Structures**               | Used for efficient data management and processing                          |

---

## System Design

---

## Data Structures and Algorithms Used

| Requirement                     | Data Structure / Algorithm             | Reason                                            |
| ------------------------------- | -------------------------------------- | ------------------------------------------------- |
| Self Student Registration       | Doubly LinkedList                      | Efficient insertion at end and removal from front |
| High-Demand Course Registration | Priority Queue                         | Processes high-priority students first            |
| Completed Enrollment Records    | Hash Table                             | Fast student lookup                               |
| Search Student by ID            | Binary Search                          | O(log n) search after sorting                     |
| Sort Students                   | Quick Sort                             | Stable and efficient O(n log n)                   |

---

### Data Structures & Algorithms Selection and Justification

#### Doubly Linked List
- Used to store student registration records.
- Suitable for dynamic data where records can be added or removed.
- Supports forward and backward traversal.
- Provides flexible insertion and deletion without shifting existing records.

#### Priority Queue
- Used to manage high-demand course registration.
- Students are prioritized according to Senior → Junior → Fresher.
- Students with equal priority are processed according to arrival order.
- Implemented using a sorted array for efficient priority management.

#### Hash Table
- Used to store and retrieve enrolled student records.
- Student ID is used as the unique key.
- Provides fast searching compared with sequential searching in a linked list.
- Average search time is O(1).

#### Binary Search
- Used to search students by Student ID.
- Requires the student records to be sorted first.
- Repeatedly divides the search range into two parts.
- Provides efficient searching with O(log n) time complexity.

#### Quick Sort
- Used to sort student records by Student ID or student name.
- Uses a pivot and partitioning approach.
- Supports efficient sorting of large datasets.
- Average time complexity is O(n log n).

---

## System Results

---

## Reflection on Limitations

The system meets all the main project requirements. However,

- Student records are stored in text files instead of a database.
- Text files are less suitable for large amounts of data, security, and scalability.
- The Hash Table has a fixed size of 50 records.
- If more than 50 records are required, the source code must be modified manually.
- Therefore, developer support may be needed when the system grows.

---

## Improvements

- Replace text-file storage with a relational database such as MySQL.
- Use cloud databases such as AWS, Microsoft Azure, or Google Cloud for better scalability and security.
- Implement dynamic resizing for the Hash Table so its capacity increases automatically.
- Add account lockout after several unsuccessful login attempts.
- Implement role-based authentication for students and administrators.
- Store usernames and passwords securely using appropriate authentication methods.
- Add SMS or email notifications for enrollment confirmations using APIs.
- Generate student and course reports in PDF or Excel format.
- Convert the desktop system into a web application using:

| **Technology**  | **Purpose**                                 |
| --------------- | ------------------------------------------- |
| **Spring Boot** | Backend development                         |
| **React.js**    | Frontend development                        |
| **MySQL**       | Database management                         |
| **REST APIs**   | Communication between frontend and backend  |
| **JWT**         | Authentication and authorization            |
| **Docker**      | Application containerization and deployment |
| **AWS / Azure** | Cloud hosting and deployment                |


---

## Conclusion

 <p align="justify"> DreamBridge successfully manages student registration, priority handling, searching, sorting, and enrollment records. The system uses a Doubly Linked List, Priority Queue, Hash Table, Binary Search, and Quick Sort to improve data management and performance. Testing showed that the main functions work correctly. Overall, the project achieved its main objectives and provides an efficient solution for managing university course enrollment. </p>

