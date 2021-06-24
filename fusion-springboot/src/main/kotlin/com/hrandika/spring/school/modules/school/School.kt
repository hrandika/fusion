package com.hrandika.spring.school.modules.school

import com.hrandika.spring.school.modules.student.Student
import java.util.*
import javax.persistence.*

@Entity
data class School(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID? = null,

    var name: String,

    @OneToMany(mappedBy = "school")
    var students: List<Student> = mutableListOf()
)