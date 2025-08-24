# REST Client Demo

This project demonstrates **inter-service communication** in a **Spring Boot microservices architecture** using the new **Spring 6 HTTP Interface (@GetExchange)**.  Instead of using `RestTemplate` or `WebClient`, the **Order Service** calls the **Inventory Service** in a **clean, declarative style** similar to Feign Clients.
The **Order Service** communicates with the **Inventory Service** to check product availability before placing an order.  If the product is available, the order is placed successfully; otherwise, the service returns a message with the missing SKU code.


## ✨ Features
- ✅ Two microservices: **Order Service** and **Inventory Service**  
- ✅ Inter-service communication using **Spring 6 HTTP Interface (@GetExchange)**  
- ✅ Real-time **stock availability check** before placing an order  
- ✅ Role-based architecture (Controller → Service → Repository)  
- ✅ Built with **Spring Boot 3 & Java 17**  
- ✅ Easily testable with **Postman**
  
## Services
- **Inventory Service**: Manages product stock.
- **Order Service**: Places orders and checks inventory using REST Client (`@GetExchange`).

---
## ⚙️ Tech Stack
- **Java 17**
- **Spring Boot 3.x**
- **Spring 6 HTTP Interface (@GetExchange)**
- **Spring Data JPA (for DB operations)**
- **PostgreSQL / MySQL (configurable)**
- **Maven**

---

## How to Run
1. Start the **Inventory Service** (`localhost:8082`).
2. Start the **Order Service** (`localhost:8081`).
3. Order Service will call Inventory Service using `@GetExchange`.

---

## Testing with Postman

### Place an Order
- **Method:** `POST`  
- **URL:**  
````

[http://localhost:8081/api/order]

````
- **Body (JSON):**
```json
{
  "skuCode": "iphone_13",
  "price": 1200,
  "quantity": 2
}
````

---

✅ If `iphone_13` is available in **Inventory Service**, response will be:
`Order Placed Successfully`

❌ If not available, response will be:
`Product with SkuCode iphone_13 is not in stock`

