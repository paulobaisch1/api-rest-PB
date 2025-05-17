# API de Usuários - Spring Boot

 API REST  desenvolvida no **Spring Boot** para gerenciar usuários em memória, com suporte completo a operações Create, Read, Update, Delete). Os dados são armazenados em um `Map<Long, User>`. Não há implementação de Banco de Dados.

## ✅ Funcionalidades

- Cria usuário (`POST /users`)
- Listar usuários (`GET /users`)
- Atualizar usuário por Id (`PUT /users/{id}`)
- Remover usuário por Id (`DELETE /users/{id}`)

## 🚀 Como executar

1. Certificar-se de obter o **Java 17+** e **Maven** instalados.
2. Clonar este repositório:
   ```bash
   git clone https://github.com/paulobaisch1/api-rest-PB
   ```

---

## 📦 Estrutura do Projeto

```
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
```

---

## 🧪 Testes usando Postman

Os endpoints da API foram **testados com o Postman**, garantindo funcionamento adequado. Contém abaixo exemplos de requisições:

### 🔹 Cria Usuário
**POST** `/users`  
```json
{
  "nome": "Gustavo",
  "idade": 20
}
```

### 🔹 Listar Usuários
**GET** `/users`

### 🔹 Atualizar Usuário
**PUT** `/users/1`  
```json
{
  "nome": "Paulo",
  "idade": 20
}
```

### 🔹 Deletar Usuário
**DELETE** `/users/1`

## 🛠 Tecnologias utilizadas

- Java
- Spring Boot
- Maven
- Postman 

