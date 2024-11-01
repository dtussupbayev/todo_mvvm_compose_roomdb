package com.example.todo_mvvm_compose_roomdb.data.todo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Todo::class],
    version = 1,
    exportSchema = true
)
abstract class TodoDatabase: RoomDatabase() {
    abstract val dao: TodoDao
}