# ToDoList

API para gerenciar tarefas (CRUD)

## Tecnologias:
- Spring Boot
- Spring MVC
- Spring Data JPA
- SpringDoc OpenAPI 3
- MySQL

## Práticas adotadas:
- SOLID, DRY
- API REST
- Consulta com Spring Data JPA
- Injeção de dependências
- Tratamento de resposta de erro
- Geração automática do Swagger com a OpenAPI 3

## Como executar:
1. Clonar o repositório git
2. Construir o projeto:
    ```bash
   ./gradlew build
3. Executar a aplicação
   ```bash
   ./gradlew bootRun
   
## API Endpoints
Para fazer as requisições HTTP abaixo, foi utilizada a ferramento postman
1. http://localhost:8080/todos/createToDo
    ```json
    {
        "nome": "ToDo 1",
        "descricao": "teste",
        "prioridade": "1"
    }
