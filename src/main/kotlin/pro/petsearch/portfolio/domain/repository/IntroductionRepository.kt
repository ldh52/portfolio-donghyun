package pro.petsearch.portfolio.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import pro.petsearch.portfolio.domain.entity.Introduction

interface IntroductionRepository : JpaRepository<Introduction, Long>