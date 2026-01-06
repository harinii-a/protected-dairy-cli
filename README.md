# Personal Diary CLI (Java)

A simple **command-line based personal diary application** built using **Java**.  
This project focuses on **backend fundamentals** such as authentication flow, secure password handling, file-based persistence, and clean separation of concerns.

---

## 🚀 Features

- Password-protected access
- Hashed password authentication
- Add diary entries with automatic date
- View all diary entries
- File-based persistence (no database)
- Clean and modular code structure

---

## 🔐 Authentication Flow

1. On first run, the user sets a password
2. The password is **hashed** and stored locally
3. On subsequent runs:
   - User enters password
   - Entered password is hashed
   - Hash is compared for verification
4. Diary access is granted only after successful login

> Plain-text passwords are never stored.

---


## ▶️ How to Run

1. Clone the repository
2. Open the project in IntelliJ (or any Java IDE)
3. Run `DairyApp.java`
4. Set a password on first run
5. Start adding and viewing diary entries

---

## 📌 Notes

- No frameworks (plain Java)
- No database (intentionally avoided to focus on logic)
- Can be extended to:
  - Database storage
  - Encryption
  - Spring Boot REST API
  - JWT-based authentication

