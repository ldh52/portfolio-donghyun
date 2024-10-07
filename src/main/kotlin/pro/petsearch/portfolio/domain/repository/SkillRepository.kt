package pro.petsearch.portfolio.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import pro.petsearch.portfolio.domain.constant.SkillType
import pro.petsearch.portfolio.domain.entity.Skill
import java.util.*

interface SkillRepository : JpaRepository<Skill, Long> {

    // select * from skill where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Skill>

    // select * from skill where lower(name) = lower(:name) and skill_type = :type
    fun findByNameIgnoreCaseAndType(name: String, type: SkillType): Optional<Skill>

}