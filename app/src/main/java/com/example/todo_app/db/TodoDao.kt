package com.example.todo_app.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.todo_app.Todo

@Dao
interface TodoDao {

    @Query("SELECT * FROM Todo ORDER BY createAt DESC")
    fun getAllTodo() : LiveData<List<Todo>>

    @Insert
    fun addTodo(todo : Todo)

    @Query("DELETE FROM Todo where id = :id")
    fun deleteTodo(id : Int)
}