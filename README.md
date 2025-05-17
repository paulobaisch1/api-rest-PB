# API - Spring Boot

API REST desenvolvida em **Spring Boot** para gerenciar usuários em memória, com suporte completo a operações Create, Read, Update e Delete (CRUD).  
Os dados são armazenados em um `Map<Long, User>`. Este é um projeto experimental, sem uso de banco de dados.

---

## ✅ Funcionalidades

- Criar usuário (`POST /users`)
- Listar usuários (`GET /users`)
- Atualizar usuário por Id (`PUT /users/{id}`)
- Remover usuário por Id (`DELETE /users/{id}`)

---

##  Como executar

1. Certifique-se de ter instalado:  
   - **Java 17+**  
   - **Maven**

2. Clone este repositório:  
   ```bash
   git clone https://github.com/paulobaisch1/api-rest-PB
Entre na pasta do projeto e execute:

bash
Copiar
Editar
mvn spring-boot:run


 Estrutura Geral do Projeto
 

src
├── main
│   ├── java
│   │   └── com.example.atvAPI
│   │       ├── model
│   │       │   └── User.java
│   │       ├── service
│   │       │   └── UserService.java
│   │       ├── controller
│   │       │   └── UserController.java
│   │       └── AtvApiApplication.java
│   └── resources
│       └── application.properties




🧪 Testes usando Postman
Os endpoints foram testados com o Postman. Exemplos de requisições:

🔹 Criar Usuário
POST /users

json
Copiar
Editar
{
  "nome": "Gustavo",
  "idade": 20
}
🔹 Listar Usuários
GET /users

🔹 Atualizar Usuário
PUT /users/1

json
Copiar
Editar
{
  "nome": "Paulo",
  "idade": 20
}
🔹 Deletar Usuário
DELETE /users/1

As Tecnologias utilizadas:
Java

Spring Boot

Maven

Postman
