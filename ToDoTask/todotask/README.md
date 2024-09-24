# ToDoList

API para gerenciar tarefas (CRUD)

## Tecnologias:
- Spring Boot
- Spring MVC
- Spring Data JPA
- SpringDoc OpenAPI 3
- MySQL

## Pr�ticas adotadas:
- SOLID, DRY
- API REST
- Consulta com Spring Data JPA
- Inje��o de depend�ncias
- Tratamento de resposta de erro
- Gera��o autom�tica do Swagger com a OpenAPI 3

## Como executar:
1. Clonar o reposit�rio git
2. Construir o projeto:
    ```bash
   ./gradlew build
3. Executar a aplica��o
   ```bash
   ./gradlew bootRun
   
## API Endpoints
Para fazer as requisi��es HTTP abaixo, foi utilizada a ferramento postman
1. http://localhost:8080/todos/createToDo
    ```json
    {
        "nome": "ToDo 1",
        "descricao": "teste",
        "prioridade": "1"
    }
