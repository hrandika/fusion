package com.hrandika.spring.school.modules.student

import com.hrandika.spring.school.modules.school.School
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.rest.core.config.Projection

@Projection(name = "school", types = [Student::class])
interface StudentSchoolProjection {
    fun getFirstName(): String
    fun getSchool(): School
}

@Projection(name = "full-name", types = [Student::class])
interface StudentFullNameProjection {

    fun getFirstName(): String
    fun getLastName(): String

    @Value("#{target.firstName + ' ' + target.lastName}")
    fun getFullName(): String
}