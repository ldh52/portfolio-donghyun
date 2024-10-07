package pro.petsearch.portfolio.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import pro.petsearch.portfolio.domain.entity.Link

interface LinkRepository : JpaRepository<Link, Long> {

    // select * from link where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Link>

}