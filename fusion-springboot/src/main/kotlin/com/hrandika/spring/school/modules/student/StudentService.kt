package com.hrandika.spring.school.modules.student

import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentService(val studentRepository: StudentRepository) {

    fun save(student: Student): Student {
        student.email = student.email?.replace("@hotmail.com", "@gmail.com", true)
        return this.studentRepository.save(student)
    }

    fun getAllStudents(): MutableIterable<Student> {
        return this.studentRepository.findAll()
    }

    fun deleteOneById(id: String) {
        return this.studentRepository.deleteById(UUID.fromString(id))
    }


}