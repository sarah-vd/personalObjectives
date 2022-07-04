package com.objectives.todo.shared

import com.objectives.todo.shared.db.ToDoDatabase
import com.objectives.todo.shared.repository.ToDoRepositoryIos
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

fun createRespository(): ToDoRepositoryIos {
    val driver = NativeSqliteDriver(ToDoDatabase.Schema, "ToDoDatabase.db")
    val database = ToDoDatabase(driver)
    return ToDoRepositoryIos(database)
}