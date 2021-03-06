package com.hrandika.spring.school.modules.student

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface StudentRepository : PagingAndSortingRepository<Student, UUID>