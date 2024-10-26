package com.example.todo_mvvm_compose_roomdb.data.todo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    val title: String,
    val description: String?,
    val isCompleted: Boolean,
    @PrimaryKey val id: Int? = null
    )
