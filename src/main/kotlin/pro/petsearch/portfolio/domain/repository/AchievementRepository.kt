package pro.petsearch.portfolio.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import pro.petsearch.portfolio.domain.entity.Achievement

interface AchievementRepository : JpaRepository<Achievement, Long> {

    // select * from achievement where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Achievement>

}