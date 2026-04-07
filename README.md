# 📚 API Aluno Professor

API REST desenvolvida com Spring Boot para gerenciamento de alunos e professores.

---

## 🚀 Tecnologias utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven

---

## 📌 Funcionalidades

### 👨‍🏫 Professor

* Criar professor
* Listar professores
* Buscar professor por ID
* Deletar professor

### 👨‍🎓 Aluno

* Criar aluno
* Listar alunos
* Buscar aluno por ID
* Deletar aluno

---

## 🧠 Arquitetura do Projeto

O projeto segue o padrão de camadas:

* **Controller** → recebe requisições HTTP
* **Service** → regras de negócio
* **Repository** → acesso ao banco de dados
* **Model** → entidades do sistema

---

## ▶️ Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/VictorDGadelha/api_aluno_professor.git
```

2. Configure o banco PostgreSQL:

* Criar banco: `projeto_javap2`

3. Configure o `application.properties`

4. Execute a aplicação:

```bash
mvn spring-boot:run
```

---

## 📡 Endpoints

### 👨‍🎓 Aluno

| Método | Rota              | Descrição          |
| ------ | ----------------- | ------------------ |
| POST   | /alunos           | Criar aluno        |
| GET    | /alunos           | Listar todos       |
| GET    | /alunos/{id}      | Buscar por ID      |
| PUT    | /alunos/{id}      | Atualizar aluno    |
| DELETE | /alunos/{id}      | Deletar            |

### 👨‍🏫 Professor

| Método | Rota              | Descrição          |
| ------ | ----------------- | ------------------ |
| POST   | /professores      | Criar professor    |
| GET    | /professores      | Listar todos       |
| GET    | /professores/{id} | Buscar por ID      |
| PUT    | /professores/{id} | Atualizar professor|
| DELETE | /professores/{id} | Deletar            |

---

## 🧪 Testes no Insomnia

(Coloque aqui prints das requisições funcionando)

---

## 🗄️ Banco de Dados

<img width="1912" height="953" alt="Tabela Professor DBeaver" src="https://github.com/user-attachments/assets/b60fa552-7fd4-4149-9667-908524131e06" />
<img width="1909" height="990" alt="Tabela Alunos DBeaver" src="https://github.com/user-attachments/assets/eea717a3-482f-4459-890d-ef0c99500fa7" />

---

## 👨‍💻 Autor

Victor Gadelha
