package pro.petsearch.portfolio.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import pro.petsearch.portfolio.domain.entity.Project

interface ProjectRepository : JpaRepository<Project, Long> {

    fun findAllByIsActive(isActive: Boolean): List<Project>

}