# ☁️ Spring Boot Microservices Demo

A demonstration project showing how to build a **microservices architecture** using **Spring Boot** and **Spring Cloud**.

This project illustrates how multiple independent services can communicate and work together within a distributed system.

---

# 🧩 Architecture Overview

The project demonstrates common microservices components such as:

* **Service Registry** – registers and discovers services
* **API Gateway** – central entry point for requests
* **Config Server** – centralized configuration management
* **Independent Microservices** – services that communicate with each other

Microservice architecture allows systems to be built from small independent services that communicate over APIs. ([GitHub][1])

---

# 🏗 Project Structure

```
spring-boot-microservices-demo
│
├── config-server/        # Centralized configuration server
├── service-registry/     # Service discovery (Eureka)
├── api-gateway/          # Gateway / routing layer
│
├── service-a/            # Example microservice
├── service-b/            # Example microservice
│
└── pom.xml
```

---

# ⚙️ Technologies Used

* Java
* Spring Boot
* Spring Cloud
* Maven
* REST APIs
* Netflix OSS (Eureka / Hystrix / Ribbon)

Frameworks like **Eureka**, **Hystrix**, and **Ribbon** help manage service discovery, fault tolerance, and load balancing in distributed systems. ([GitHub][2])

---

# 🚀 Getting Started

## 1️⃣ Clone the repository

```bash
git clone https://github.com/b1342/spring-boot-microservices-demo.git
cd spring-boot-microservices-demo
```

---

## 2️⃣ Build the project

```bash
mvn clean install
```

---

## 3️⃣ Run the services

Start the services in the following order:

1. Config Server
2. Service Registry
3. API Gateway
4. Microservices

Example:

```bash
mvn spring-boot:run
```

---

# 🔗 Example Architecture Flow

```
Client
   │
   ▼
API Gateway
   │
   ▼
Service Registry (Eureka)
   │
   ├── Microservice A
   └── Microservice B
```

---

# ✨ Features

* Microservices architecture
* Service discovery
* API gateway routing
* Centralized configuration
* Independent service deployment

---

# 📚 Learning Goals

This project is useful for learning:

* Spring Boot microservices
* Spring Cloud ecosystem
* Service-to-service communication
* Distributed system architecture

---

# 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Open a Pull Request

---

# 📄 License

This project is open-source and available under the **MIT License**.

[1]: https://github.com/ali-bouali/springboot-3-micro-service-demo?utm_source=chatgpt.com "ali-bouali/springboot-3-micro-service-demo"
[2]: https://github.com/maurofokker/microservices-demo?utm_source=chatgpt.com "microservices demo using spring boot cloud"
