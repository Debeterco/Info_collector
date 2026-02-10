# Industrial Data Collector – Java

## 📌 Project Overview

**Industrial Data Collector** is a simple Java-based application designed to simulate an **industrial monitoring system**.  
The project focuses on **data collection, processing, and validation**, following basic concepts used in industrial automation environments.

The system simulates temperature readings from an industrial sensor and validates whether the values are within a predefined safe range.

---

## 🎯 Objectives

- Simulate industrial sensor data collection  
- Process temperature values  
- Validate data against safety thresholds  
- Display system status in real time  

---

## ⚙️ How It Works

1. The system runs in **5 reading cycles**
2. In each cycle:
   - A random temperature value is generated
   - The value is validated against a minimum and maximum limit
   - The system reports whether the operation is safe
3. A **2-second delay** is applied between cycles to simulate real-time monitoring

---

## 🧪 Sensor Simulation

- **Sensor name:** OVEN  
- **Temperature range (simulated):** 10°C to 100°C  
- **Safe operating range:** 20°C to 80°C  

---

## ✅ Validation Logic

- If the temperature is **within the safe range**, the system reports:

        NORMAL OPERATION <<

- If the temperature is **outside the safe range**, the system reports:

        OUT OF THE SECURITY LEVEL <<


---

## 🛠️ Technologies Used

- Java
- `java.util.Random` for sensor simulation
- `java.util.Locale` for numeric formatting

---

## ▶️ How to Run

1. Clone the repository:
 ```bash
 git clone https://github.com/your-username/your-repository.git

    Compile the program:

javac application/Main.java

Run the application:

    java application.Main

📂 Project Structure

application/
 └── Main.java