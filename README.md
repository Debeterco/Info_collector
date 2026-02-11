# Info Collector

## 📌 Project Overview

**Info Collector** is a Java application that simulates an industrial monitoring system.  
The project follows a simple object-oriented structure and demonstrates how sensor data can be collected, processed, and validated in an automation context.

The system simulates temperature readings from an industrial sensor and validates them against predefined safety limits.

---

## 🎯 Objectives

- Simulate industrial sensor data collection  
- Apply validation rules to sensor readings  
- Structure the project using Object-Oriented Programming  
- Separate responsibilities between application logic and domain entities  

---

## 🏗️ Project Structure

Info_collector/
│
├── application/
│ └── Main.java
│
├── entities/
│ ├── Sensor.java
│ └── Reader.java
│
└── README.md


### 📦 application
Contains the entry point of the program (`Main.java`), responsible for:
- Controlling execution cycles
- Calling sensor reading methods
- Triggering validation logic

### 📦 entities
Contains the domain classes:

- **Sensor.java**
  - Represents a sensor entity
  - Stores sensor data and limits
  - Encapsulates validation logic

- **Reader.java**
  - Responsible for simulating sensor data generation
  - Uses random values to mimic real industrial readings

---

## ⚙️ How It Works

1. The system runs multiple reading cycles.
2. A simulated temperature value is generated.
3. The value is validated against a minimum and maximum threshold.
4. The system prints whether the operation is within safe limits.
5. A delay simulates real-time monitoring behavior.

---

## 🧪 Sensor Configuration

- **Sensor Type:** OVEN  
- **Simulated Range:** 10°C to 100°C  
- **Safe Operating Range:** 20°C to 80°C  

---

## ✅ Validation Rule

A reading is considered safe if:

minimum <= value <= maximum


If the value is outside this range, the system reports an alert condition.

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- `java.util.Random`
- `java.lang.Thread`

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Debeterco/Info_collector.git

    Navigate to the project directory:

cd Info_collector

Compile the project:

javac application/Main.java entities/*.java

Run:

    java application.Main

🚀 Possible Improvements

    Add support for multiple sensor types

    Implement logging system (file-based)

    Introduce real hardware integration (ESP32 / Arduino)

    Add exception handling for invalid readings

    Create a simple dashboard interface

📄 License

This project is licensed under the MIT License.