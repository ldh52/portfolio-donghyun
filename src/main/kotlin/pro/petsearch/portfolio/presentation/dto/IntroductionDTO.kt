package pro.petsearch.portfolio.presentation.dto

import pro.petsearch.portfolio.domain.entity.Introduction

data class IntroductionDTO(
    val content: String
) {
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}