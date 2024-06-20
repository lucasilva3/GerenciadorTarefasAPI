# API Gerenciar Tarefas (Projeto de Estudo)

Este é um projeto de API RESTful para o gerenciamento de tarefas utilizando Spring Boot e JPA (Hibernate).

## Funcionalidades

- **Cadastrar Tarefas:** Salvar novas tarefas com título, descrição, status, data de previsão de término, data de início e data de entrega.
- **Listar tarefas:** Listar todas as tarefas cadastradas.
- **Deletar todas as tarefas:** Remove todas as tarefas cadastradas.
- **Buscar tarefa:** Busca uma tarefa específica pelo ID informado.
- **Deletar tarefa ID:** Deleta uma tarefa específica pelo ID informado.
- **Atualizar tarefa ID:** Atualiza dados da tarefa específica pelo ID informado.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.3.0
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Estrutura do Projeto

- **Controller:** Responsável por receber e gerenciar as requisições HTTP.
- **Service:** Contém a lógica de negócios da aplicação.
- **Repository:** Interface para comunicação com o banco de dados.
- **Entity:** Representação das tabelas do banco de dados.

## Endpoints da API

### Listar Tarefas

- **URL:** `/tarefas/listagem`
- **Método:** `GET`
- **Descrição:** Retorna uma lista de todas as tarefas cadastradas.

### Cadastrar Tarefa

- **URL:** `/tarefas/salvar`
- **Método:** `POST`
- **Descrição:** Cadastra uma nova tarefa.
- **Corpo da Requisição:**
  ```json
  {
      "titulo": "Tarefa 1",
      "descricao": "Descrição da Tarefa 1",
      "status": "NAO_INICIADO",
      "previsao_termino": "2024-06-20T10:00:00",
      "inicio_tarefa": "2024-06-19T08:00:00",
      "entrega_tarefa": "2024-06-20T09:30:00"
  }
  ```

### Buscar Tarefa Específica

- **URL:** `/tarefas/buscar/3`
- **Método:** `GET`
- **Descrição:** Buscar tarefa específica

### Deletar Tarefas

- **URL:** `/tarefas/deletarTudo`
- **Método:** `DELETE`
- **Descrição:** Deleta todas as tarefas existentes no banco de dados

### Deletar Tarefa Específica

- **URL:** `/tarefas/deletar/2`
- **Método:** `DELETE`
- **Descrição:** Deleta uma tarefa específica do banco de dados

### Atualizar Tarefa Específica

- **URL:** `/tarefas/atualizar/7`
- **Método:** `PUT`
- **Descrição:** Atualiza uma tarefa específica do banco de dados

## Como Usar

1. Clone este repositório: `git clone https://github.com/lucasilva3/GerenciadorTarefasAPI.git`
2. Importe o projeto em sua IDE preferida.
3. Configure as propriedades do banco de dados MySQL no arquivo `application.properties`.
4. Execute a aplicação Spring Boot.
5. Acesse os endpoints descritos acima usando um cliente REST (por exemplo, Postman).

## Contribuindo

Este é um projeto de estudo e contribuições são bem-vindas!

## Autor

Lucas - [Github](https://github.com/lucasilva3)
