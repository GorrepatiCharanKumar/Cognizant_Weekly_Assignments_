Read Me First
The following was discovered as part of building this project:

The original package name 'com.cognizant.orm-learn' is invalid and this project uses 'com.cognizant.orm_learn' instead.
Getting Started
Reference Documentation
For further reference, please consider the following sections:

Official Apache Maven documentation
Spring Boot Maven Plugin Reference Guide
Create an OCI image
Spring Boot DevTools
Spring Data JPA
Guides
The following guides illustrate how to use some features concretely:

Accessing Data with JPA
Accessing data with MySQL
Maven Parent overrides
Due to Maven's design, elements are inherited from the parent POM to the project POM. While most of the inheritance is fine, it also inherits unwanted elements like <license> and <developers> from the parent. To prevent this, the project POM contains empty overrides for these elements. If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.