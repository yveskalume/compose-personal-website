package com.yveskalume.portfolio.data.datasource

import com.yveskalume.portfolio.data.model.Testimonial
import yveskalume.composeapp.generated.resources.Res
import yveskalume.composeapp.generated.resources.ericampire
import yveskalume.composeapp.generated.resources.rolandbeni
import yveskalume.composeapp.generated.resources.shekinahtshiokufila

object TestimonialDataSource {

    val testimonials: List<Testimonial> = listOf(
        Testimonial(
            id = 1,
            name = "Eric Ampire",
            title = "Mobile Enginer at BRP & Google Developer Expert for Android",
            image = Res.drawable.ericampire,
            quote = "Probably the talented Android developer I work with, aware of " +
                    "the enemy of excellence, always ready to learn new things."
        ),
        Testimonial(
            id = 2,
            name = "Roland Beni",
            title = "Lead Web Developer at Zx Connect",
            image = Res.drawable.rolandbeni,
            quote = "For me Yves Kalume is a mobile developer with very high adaptability and learning skills; a perfect person to work with!"
        ),
        Testimonial(
            id = 3,
            name = "Shekinah Tshiokufila",
            title = "Senior Software Engineer",
            image = Res.drawable.shekinahtshiokufila,
            quote = "Yves Kalume is passionate about what he does and that's what makes his work exceptional." +
                    " In a constant quest for excellence, he produces impeccable, meticulous work." +
                    " Working with him is a pleasure, because he knows how to understand feedback and " +
                    "he knows how to bring constructive ideas to the table to move the work forward."
        ),

    )
}