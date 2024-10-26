package com.example.todo_mvvm_compose_roomdb.data.todo

import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    suspend fun insertTodo(todo: Todo)

    suspend fun deleteTodo(todo: Todo)

    suspend fun getTodoById(id: Int): Todo?

    suspend fun getTodos(): Flow<List<Todo>>
}