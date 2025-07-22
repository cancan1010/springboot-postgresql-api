# Spring Boot PostgreSQL REST API (Docker + Swagger)

Bu proje, Spring Boot, PostgreSQL ve Docker teknolojileriyle oluşturulmuş basit bir CRUD REST API uygulamasıdır. Swagger arayüzüyle birlikte gelir ve kolay test imkanı sunar.

---

## 🚀 Kullanılan Teknolojiler
- Java 17
- Spring Boot 3
- PostgreSQL 14
- Docker & Docker Compose
- Swagger UI (springdoc-openapi)

---

## ⚙️ Kurulum

Projenin çalışması için Docker ve Docker Compose kurulu olmalıdır.

```bash
git clone https://github.com/kullaniciadi/springboot-postgresql-api.git
cd springboot-postgresql-api
docker-compose up --build
```

---

## 🔌 API Uç Noktaları

### ➤ GET Tüm Kişiler
```
GET /api/person
```

### ➤ POST Yeni Kişi Oluştur
```
POST /api/person
Content-Type: application/json
```
```json
{
  "name": "Caner",
  "email": "caner@example.com"
}
```

---

## 📘 Swagger UI
Swagger arayüzü ile API'leri görsel olarak test edebilirsiniz:
🔗 `http://localhost:8080/swagger-ui.html`

---

## 🗂️ Proje Yapısı (Özet)
```bash
src/main/java/com/caneraysan/demo
├── controller          # REST API uç noktaları
├── model               # Entity sınıfları
├── repository          # JPA interface'leri
├── service             # İş mantığı katmanı
└── DemoApplication.java
```

---

## 🛠️ Geliştiren
**Caner Aysan** – [LinkedIn](https://linkedin.com/in/caner-aysan/) – [Medium](https://caneraysan.medium.com)

---

## 🪪 Lisans
MIT Lisansı altında sunulmuştur.

---
