package com.example.todo_app.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todo_app.Todo

@Database(entities = [Todo :: class], version = 1)
@TypeConverters(Converter :: class)
abstract class TodoDB : RoomDatabase() {

    companion object{
        const val Name = "Todo_DB"
    }

    abstract fun todoDao(): TodoDao
}