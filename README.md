<h1 align="center">🔐 TestSecurity</h1>

Este projeto foi desenvolvido com o objetivo de estudar **Spring Security**, explorando conceitos de autenticação com JWT Token e autorização em aplicações Java.  
Foi implementado com **Java 17**, **Spring Boot**, **Flyway** para versionamento do banco de dados e **PostgreSQL** como banco relacional.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
    - Spring Web
    - Spring Data JPA
    - Spring Security
      - OAuth0
      - Token JWT
    - Validation
- **Flyway** - versionamento do banco de dados
- **PostgreSQL** - banco de dados
- **Lombok**
- **Maven** - gerenciador de dependências

---

## 📂 Estrutura do Projeto

```bash
├─ src/main/java/dev/danimota/testsecurity
    ├─ config 
    ├──── AuthConfig
    ├──── JWTUserData
    ├──── SecurityConfig
    ├──── SecurityFilter
    ├──── TokenConfig
    ├─ controller
    ├──── AuthCController
    ├──── TestController
    ├─ dto 
    ├──── request
    ├────── LoginRequest
    ├────── RegisterUserRequest
    ├──── response
    ├────── LoginResponse
    ├────── RegisterUserResponse
    ├─ entity
    ├──── User
    ├─ repository
    ├──── UserRepository
    ├─ TestsecurityApplication.java

```
---

## 🛠️ Pré-requisitos

Antes de rodar o projeto, você precisa ter instalado:

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/)
- [PostgreSQL](https://www.postgresql.org/download/)

---

## ⚙️ Configuração do Banco de Dados

- Crie o banco de dados no PostgreSQL:

```sql
CREATE DATABASE test_security;
```
- No arquivo `application.properties`, configure o acesso:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/test_security
spring.datasource.username=postgres
spring.datasource.password=suasenha

spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true

spring.flyway.enabled=true
```
---
## ▶️ Como Rodar o Projeto

- Via IntelliJ ou outra IDE de sua preferência
  1. Clone o repositório:
  ```bash
  
    git clone https://github.com/seu-usuario/testsecurity.git
   ```
  2. Abra o projeto no IntelliJ. 
  3. Execute o projeto 🚀
---
## 📌 Endpoints Principais

| Método | Endpoint         | Descrição                        | Protegido |
|--------|------------------|----------------------------------|-----------|
| POST   | `/auth/login`    | Autenticação e geração de token  | ❌        |
| POST   | `/auth/register` | Cadastro de novo usuário         | ❌        |
| GET    | `/test`          | Teste para autenticação do token | ✅        |
---
## 📝 Licença
- Este projeto foi criado para fins de estudo. 
- Sinta-se livre para utilizar como base para os seus aprendizados ou projetos pessoais.
---
## 👩‍💻 Autora

Desenvolvido por Daniela Mota em realização do Challenge: ForumHub ONE - Oracle Next Education + ALURA

📧 Email: danielamedeiromota@hotmail.com

[🔗 LinkedIn](https://www.linkedin.com/in/danielammota/)