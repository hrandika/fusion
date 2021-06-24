package com.hrandika.spring.school.modules.school

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface SchoolRepository : PagingAndSortingRepository<School, UUID>