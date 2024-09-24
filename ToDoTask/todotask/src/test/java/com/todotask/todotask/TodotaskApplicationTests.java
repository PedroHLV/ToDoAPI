package com.todotask.todotask;

import com.todotask.todotask.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodotaskApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSuccess() {
		var todo = new Todo("todo 1", "desc todo 1", false, 1);

		webTestClient.post().uri("/todos/createToDo")
				.bodyValue(todo).exchange().expectStatus().isOk().expectBody().jsonPath("$").isArray().jsonPath("$.length()").isEqualTo(1);
	}

	@Test
	void testCreateTodoFailure() {
		webTestClient.post().uri("/todos/createToDo").bodyValue(new Todo("", "", false, 1)).exchange().expectStatus().isBadRequest();
	}

	@Test
	void testGetListTodoSuccess() {
		webTestClient.get().uri("/todos/listToDo").exchange().expectStatus().isOk();
	}

	@Test
	void testUpdateListTodoSuccess() {
		webTestClient.put().uri("/todos/updateToDo").bodyValue(new Todo("ToDo 3", "Desc ToDo 3", true, 0)).exchange().expectStatus().isOk();
	}

	@Test
	void testUpdateListTodoFailure() {
		webTestClient.put().uri("/todos/updateToDo").bodyValue(new Todo("", "", true, 0)).exchange().expectStatus().isBadRequest();
	}

	@Test
	void testDeleteTodoSuccess() {
		Long id = 1L;
		webTestClient.delete().uri("/todos/deleteTodo/{id}", id).exchange().expectStatus().isOk();
	}
}
