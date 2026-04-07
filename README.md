# 📚 API Aluno Professor

> API REST para gerenciamento de alunos e professores, desenvolvida com **Java 21** e **Spring Boot**.

---

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Tecnologias](#-tecnologias)
- [Arquitetura](#-arquitetura)
- [Pré-requisitos](#-pré-requisitos)
- [Como Executar](#-como-executar)
- [Endpoints](#-endpoints)
- [Testes no Insomnia](#-testes-no-insomnia)
- [Banco de Dados](#-banco-de-dados)
- [Autor](#-autor)

---

## 💡 Sobre o Projeto

Esta API fornece operações CRUD para o gerenciamento de **alunos** e **professores** em um ambiente educacional. O projeto foi construído seguindo boas práticas de desenvolvimento com Spring Boot, utilizando uma arquitetura em camadas bem definida e persistência de dados com PostgreSQL.

---

## 🛠️ Tecnologias

| Tecnologia | Versão | Finalidade |
|---|---|---|
| [Java](https://www.oracle.com/java/) | 21 | Linguagem principal |
| [Spring Boot](https://spring.io/projects/spring-boot) | 4.0.5 | Framework base da aplicação |
| [Spring Web](https://spring.io/projects/spring-framework) | — | Criação da API REST com Spring MVC |
| [Spring Data JPA](https://spring.io/projects/spring-data-jpa) | — | Abstração do acesso ao banco de dados |
| [Hibernate](https://hibernate.org/) | — | ORM (Object-Relational Mapping) |
| [PostgreSQL Driver](https://www.postgresql.org/) | — | Conexão JDBC/R2DBC com o banco PostgreSQL |
| [Lombok](https://projectlombok.org/) | — | Redução de código boilerplate (getters, setters, construtores) |
| [Maven](https://maven.apache.org/) | 3.9.9 | Gerenciamento de dependências e build |

---

## 🏗️ Arquitetura

O projeto segue o padrão de **arquitetura em camadas (Layered Architecture)**:

```
src/
└── main/
    └── java/
        └── com/example/api/
            ├── controller/    # Recebe e responde às requisições HTTP
            ├── service/       # Contém as regras de negócio
            ├── repository/    # Interface com o banco de dados (Spring Data JPA)
            └── model/         # Entidades mapeadas para o banco (Aluno, Professor)
```

**Fluxo de uma requisição:**

```
Cliente HTTP
    │
    ▼
Controller  →  Service  →  Repository  →  Banco de Dados (PostgreSQL)
    │              │
    │         (regras de
    │          negócio)
    ▼
Resposta JSON
```

---

## ✅ Pré-requisitos

Antes de iniciar, certifique-se de ter instalado em sua máquina:

- [Java 21+](https://www.oracle.com/java/technologies/downloads/)
- [Maven 3.8+](https://maven.apache.org/download.cgi)
- [PostgreSQL 14+](https://www.postgresql.org/download/)
- (Opcional) [DBeaver](https://dbeaver.io/) ou outro cliente SQL para visualizar o banco

---

## ▶️ Como Executar

### 1. Clone o repositório

```bash
git clone https://github.com/VictorDGadelha/api_aluno_professor.git
cd api_aluno_professor
```

### 2. Configure o banco de dados

Acesse o PostgreSQL e crie o banco:

```sql
CREATE DATABASE projeto_javap2;
```

### 3. Configure o `application.properties`

Edite o arquivo em `src/main/resources/application.properties` com suas credenciais:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/projeto_javap2
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 4. Execute a aplicação

```bash
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 📡 Endpoints

### 👨‍🎓 Aluno — `/alunos`

| Método | Rota | Descrição | Body (JSON) |
|--------|------|-----------|-------------|
| `POST` | `/alunos` | Criar aluno | `{ "nomeCompleto": "...", "email": "...", "cpf": "..." }` |
| `GET` | `/alunos` | Listar todos os alunos | — |
| `GET` | `/alunos/{id}` | Buscar aluno por ID | — |
| `PUT` | `/alunos/{id}` | Atualizar aluno | `{ "nomeCompleto": "...", "email": "...", "cpf": "..." }` |
| `DELETE` | `/alunos/{id}` | Deletar aluno | — |

**Exemplo de requisição — criar aluno:**

```http
POST /alunos
Content-Type: application/json

{
  "nomeCompleto": "João Silva",
  "email": "joao.silva@email.com",
  "cpf": "123.456.789-00"
}
```

**Exemplo de resposta:**

```json
{
  "id": 1,
  "nomeCompleto": "João Silva",
  "email": "joao.silva@email.com",
  "cpf": "123.456.789-00"
}
```

---

### 👨‍🏫 Professor — `/professores`

| Método | Rota | Descrição | Body (JSON) |
|--------|------|-----------|-------------|
| `POST` | `/professores` | Criar professor | `{ "nomeCompleto": "...", "email": "...", "cpf": "..." }` |
| `GET` | `/professores` | Listar todos os professores | — |
| `GET` | `/professores/{id}` | Buscar professor por ID | — |
| `PUT` | `/professores/{id}` | Atualizar professor | `{ "nomeCompleto": "...", "email": "...", "cpf": "..." }` |
| `DELETE` | `/professores/{id}` | Deletar professor | — |

**Exemplo de requisição — criar professor:**

```http
POST /professores
Content-Type: application/json

{
  "nomeCompleto": "Maria Oliveira",
  "email": "maria.oliveira@escola.com",
  "cpf": "987.654.321-00"
}
```
**Exemplo de resposta:**

```json
{
  "id": 1,
  "nomeCompleto": "Maria Oliveira",
  "email": "maria.oliveira@escola.com",
  "cpf": "987.654.321-00"
}
```

---

## 🧪 Testes no Insomnia

As requisições abaixo foram testadas utilizando o [Insomnia](https://insomnia.rest/).

### 👨‍🎓 Aluno

**Criar Aluno**
![Criar Aluno](assets/requisição_criarAluno.png)

**Listar Todos os Alunos**
![Listar Todos os Alunos](assets/requisição_listarTodosAlunos.png)

**Buscar Aluno por ID**
![Buscar Aluno por ID](assets/requisição_buscarAlunoPorId.png)

**Atualizar Aluno por ID**
![Atualizar Aluno por ID](assets/requisição_atualizarAlunoPorId.png)

**Deletar Aluno por ID**
![Deletar Aluno por ID](assets/requisição_deletarAlunoPorId.png)

### 👨‍🏫 Professor

**Criar Professor**
![Criar Professor](assets/requisição_criarProfessor.png)

**Listar Todos os Professores**
![Listar Todos os Professores](assets/requisição_listarTodosProfessores.png)

**Buscar Professor por ID**
![Buscar Professor por ID](assets/requisição_buscarProfessorPorId.png)

**Atualizar Professor por ID**
![Atualizar Professor por ID](assets/requisição_atualizarProfessorPorId.png)

**Deletar Professor por ID**
![Deletar Professor por ID](assets/requisição_deletarProfessorPorId.png)

---

## 🗄️ Banco de Dados

As tabelas são geradas automaticamente pelo Hibernate na primeira execução.

**Tabela `aluno`:**

![Tabela Aluno DBeaver](Tabela_aluno.png)

**Tabela `professor`:**

![Tabela Professor DBeaver](Tabela_professor.png)

---

## 👨‍💻 Autor

**Victor de Oliveira Gadelha**

[![GitHub](https://img.shields.io/badge/GitHub-VictorDGadelha-181717?style=flat&logo=github)](https://github.com/VictorDGadelha)

---

> Projeto desenvolvido para fins acadêmicos.
