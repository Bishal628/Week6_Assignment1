package com.bishal.softuser.model

val listStudent = mutableListOf<Student>()

class Database {
    fun appendStudent(student: Student){
        listStudent.add(student)
    }

    fun returnStudent(): MutableList<Student>{
        return listStudent
    }

    fun deleteStudent(student: Student){
        listStudent.remove(student)
    }
}