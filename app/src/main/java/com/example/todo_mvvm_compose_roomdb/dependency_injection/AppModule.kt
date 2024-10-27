package com.example.todo_mvvm_compose_roomdb.dependency_injection

import android.app.Application
import androidx.room.Room
import com.example.todo_mvvm_compose_roomdb.data.todo.TodoDatabase
import com.example.todo_mvvm_compose_roomdb.data.todo.TodoRepository
import com.example.todo_mvvm_compose_roomdb.data.todo.TodoRepositoryImplementation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideTodoDatabase(application: Application): TodoDatabase{
        return Room.databaseBuilder(
            application,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository{
        return TodoRepositoryImplementation(db.dao)
    }
}