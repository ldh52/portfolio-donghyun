package pro.petsearch.portfolio.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import pro.petsearch.portfolio.domain.entity.Achievement

interface AchievementRepository : JpaRepository<Achievement, Long>