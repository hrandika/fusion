package com.hrandika.spring.school.utils

import com.hrandika.spring.school.modules.school.School
import com.hrandika.spring.school.modules.school.SchoolRepository
import com.hrandika.spring.school.modules.student.Student
import com.hrandika.spring.school.modules.student.StudentRepository
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class DummyData(val studentRepository: StudentRepository, val schoolRepository: SchoolRepository) {

    @PostConstruct
    fun initialData() {
        var school1 = School(name = "School1")
        schoolRepository.save(school1)

        var randika = Student(firstName = "Randika", lastName = "Hapugoda", school = school1)
        studentRepository.save(randika)
    }

}