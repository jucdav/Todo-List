package com.example.todo_app

import android.app.Application
import androidx.room.Room
import com.example.todo_app.db.TodoDB

class MainApplication : Application() {

    companion object{

        lateinit var todoDatabase : TodoDB
    }

    override fun onCreate() {
        super.onCreate()
        todoDatabase = Room.databaseBuilder(
            applicationContext,
            TodoDB :: class.java,
            TodoDB.Name
        ).build()
    }
}