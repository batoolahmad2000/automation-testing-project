# Automation Testing Project – EYOUTH

## Selenium + TestNG + Page Object Model (POM)

This project automates the required functionalities on the EYOUTH website using:

- Selenium WebDriver
- Java
- TestNG
- Maven
- Page Object Model (POM)
- Explicit Waits
- Assertions
- Allure Report (Optional Bonus)

---

# Project Description

The project covers automation testing for the EYOUTH platform including:

- Search functionality
- Course details page
- Registration page
- Login scenarios
- End-to-End course subscription flow
- Social media links validation
- Course cards UI validation

---

# Implemented Test Cases

## Test Case #1
### Search with valid keyword

- Search using:
  كيف تنضم إلى البنك
- Verify page title contains:
  البنك

---

## Test Case #2
### Open course details

- Open all courses
- Select any course
- Verify course details page opens
- Verify section:
  حول الدورة التدريبية

---

## Test Case #3
### Open registration page

- Click:
  انضم لنا
- Verify URL contains:
  /register

---

## Test Case #4
### Register with empty username field

- Fill all fields except username
- Click Create
- Verify validation message appears

---

## Test Case #5
### Login with invalid credentials

- Enter invalid email/password
- Verify error message appears

---

## Test Case #6
### Login with empty fields

- Leave fields empty
- Click Login
- Verify required validation messages

---

## Test Case #7
### End-to-End Scenario

- Login with valid credentials
- Open all courses
- Subscribe to any course
- Verify selected course added successfully

---

## Test Case #8
### Verify Facebook link

- Open Facebook icon
- Verify URL contains:
  facebook.com

---

## Test Case #9
### Verify LinkedIn link

- Open LinkedIn icon
- Verify URL contains:
  linkedin.com

---

## Test Case #10
### Verify YouTube link

- Open YouTube icon
- Verify URL contains:
  youtube.com

---

## Test Case #11
### Verify Course Card UI

Verify one course card contains:

- Course Image
- Course Title
- Instructor Name
- Subscribe Button

---

# Project Structure

```text
src
├── main ├── java
│               ├── pages
│               └── utilities
│         
│
│── test
      ├── java
      │    ├── base
      │    ├── tests
      │    
      │
      └── resources
           ├── config.properties
           └── testng.xml
