package com.hrandika.spring.school.modules.student

import com.hrandika.spring.school.modules.school.School
import java.util.*
import javax.persistence.*

@Entity
data class Student(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID? = null,

    var firstName: String? = null,
    var lastName: String? = null,
    var email: String? = null,

    @ManyToOne
    var school: School? = null
)