# NATURA - Android Login and Welcome Application

## Student Information

**Name:** Tejashree DL  
**USN:** 25MCAR0124

---

## Project Title

NATURA - Android Login and Welcome Application

---

## Aim

To develop a modern Android application with a professional nature-inspired Login Page and Welcome Page. The application accepts the username entered by the user on the Login Page and dynamically displays the same username on the Welcome Page after successful login.

---

## Objective

- To design a professional Android Login Page.
- To create a nature-inspired user interface.
- To accept username and password from the user.
- To validate the username input.
- To navigate from the Login Page to the Welcome Page.
- To pass the username between activities using Intent.
- To display the username dynamically on the Welcome Page.
- To implement a Logout option that returns the user to the Login Page.

---

## Application Description

NATURA is an Android application developed using Kotlin and XML in Android Studio.

The application uses a dark emerald nature-inspired theme with a forest background, rounded input fields, and a glass-style Login Card.

The application consists of two main screens:

1. Login Page
2. Welcome Page

The user enters their username and password on the Login Page. When the Login button is clicked, the username is passed to the Welcome Page using an Intent.

For example:

```text
Username entered: Tejashree

After Login:

Welcome, Tejashree

```


## Technologies Used

- Android Studio
- Kotlin
- XML
- Fragments
- Android Debugger

---

## Application Flow

                Login Page
                    |
                    |
          Enter Username
          Enter Password
                    |
                    v
               LOGIN
                    |
                    |
          Username passed
           using Intent
                    |
                    v
               Welcome Page
                    |
                    |
          Welcome, [Username]
                    |
                    v
                 LOGOUT
                    |
                    v
                Login Page



## Project Structure

```text
LoginPage2/
│
├── app/
│   │
│   ├── manifests/
│   │   └── AndroidManifest.xml
│   │
│   ├── java/
│   │   └── com.example.loginpage/
│   │       ├── MainActivity.kt
│   │       └── WelcomeActivity.kt
│   │
│   └── res/
│       │
│       ├── drawable/
│       │   ├── glass_card.xml
│       │   ├── input_background.xml
│       │   └── natura_background.jpg
│       │
│       ├── layout/
│       │   ├── activity_main.xml
│       │   └── activity_welcome.xml
│       │
│       ├── mipmap/
│       │   └── Application icons
│       │
│       ├── values/
│       │   ├── colors.xml
│       │   ├── strings.xml
│       │   └── themes.xml
│       │
│       └── xml/
│           └── Backup and data extraction configuration
│
├── gradle/
│   ├── libs.versions.toml
│   └── wrapper/
│
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
└── README.md

```


## Test Cases

Test Case 1: Login Page Display

Test Case ID: TC01

Input: Launch the application.

Expected Output: The NATURA Login Page should be displayed with the username and password fields.

Actual Output: Login Page is displayed successfully.

Status: Passed

Screenshot:

<img width="1366" height="720" alt="Screenshot 2026-08-14 125851" src="https://github.com/user-attachments/assets/4459f6a0-c4ca-486f-8c93-d820499463f5" />

Test Case 2: Username Validation

Test Case ID: TC02

Input: Click the Login button without entering a username.

Expected Output: The application should display a message asking the user to enter their username.

Actual Output: "Please enter your username" message is displayed.

Status: Passed

Screenshot:
<img width="718" height="1600" alt="WhatsApp Image 2026-08-15 at 12 16 27 AM" src="https://github.com/user-attachments/assets/58d1ccbd-687c-427d-84cd-dac6445e3b85" />

Test Case 3: Dynamic Username Display

Test Case ID: TC03

Input: Enter username as "Tejashree" and click Login.

Expected Output: The Welcome Page should display "Welcome, Tejashree".

Actual Output: The Welcome Page displays the entered username successfully.

Status: Passed

Screenshot:
<img width="1361" height="715" alt="Screenshot 2026-08-14 235803" src="https://github.com/user-attachments/assets/086d0912-6733-41c9-8e91-630ffdd4bc94" />

## Result

The NATURA Android Login and Welcome application was successfully developed.

The application provides a professional nature-inspired Login Page where the user can enter their username and password. After login, the username is dynamically displayed on the Welcome Page.

The Logout functionality successfully returns the user to the Login Page and clears the previous activity from the back stack.

## Conclusion

The project successfully demonstrates the development of a functional Android application using Kotlin and XML. It combines user input, validation, activity navigation, Intent-based data transfer, dynamic content, and logout functionality with a professional nature-inspired user interface.
