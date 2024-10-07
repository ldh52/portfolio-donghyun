package pro.petsearch.portfolio.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import pro.petsearch.portfolio.domain.entity.HttpInterface
import java.time.LocalDateTime

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long> {

    fun countAllByCreatedDateTimeBetween(start: LocalDateTime, end: LocalDateTime): Long

}