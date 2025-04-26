package com.cliffgor.notesapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotesApiApplication

fun main(args: Array<String>) {
    runApplication<NotesApiApplication>(*args)
}
