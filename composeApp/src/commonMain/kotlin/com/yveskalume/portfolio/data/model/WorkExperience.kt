package com.yveskalume.portfolio.data.model

import org.jetbrains.compose.resources.DrawableResource

data class WorkExperience(
    val id: Int,
    val company: String,
    val position: String,
    val startDate: String,
    val endDate: String,
    val companyLogo: DrawableResource
)
