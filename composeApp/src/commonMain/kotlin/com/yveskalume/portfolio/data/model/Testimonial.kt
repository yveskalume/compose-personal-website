package com.yveskalume.portfolio.data.model

import org.jetbrains.compose.resources.DrawableResource

data class Testimonial(
    val id: Int,
    val name: String,
    val title: String,
    val quote: String,
    val image: DrawableResource
)
