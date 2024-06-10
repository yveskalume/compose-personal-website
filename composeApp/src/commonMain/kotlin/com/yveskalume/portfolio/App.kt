package com.yveskalume.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yveskalume.portfolio.components.BlogPostView
import com.yveskalume.portfolio.components.TestimonialView
import com.yveskalume.portfolio.components.WorkExperienceView
import com.yveskalume.portfolio.data.datasource.TestimonialDataSource
import com.yveskalume.portfolio.data.datasource.WorkExperienceDataSource
import com.yveskalume.portfolio.theme.AppTheme
import org.jetbrains.compose.resources.painterResource
import yveskalume.composeapp.generated.resources.Res
import yveskalume.composeapp.generated.resources.yveskalume

@Composable
internal fun App() = AppTheme {

    val testimonials = remember {
        TestimonialDataSource.testimonials
    }
    val workExperiences = remember {
        WorkExperienceDataSource.workExperiences
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .windowInsetsPadding(WindowInsets.safeDrawing)
            .padding(horizontal = 24.dp)
            .verticalScroll(rememberScrollState()),
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(Res.drawable.yveskalume),
            contentDescription = "Yves Kalume Picture",
            modifier = Modifier
                .size(150.dp).clip(CircleShape),
            contentScale = ContentScale.Crop,
        )
        Text(
            text = "Software Engineer, Building Mobile Apps",
            style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 100.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 100.sp,
            ),
            modifier = Modifier.fillMaxWidth(0.6f)
        )
        Text(
            "Yves Kalume is a Software Engineer specialized in building exceptional mobile experiences for the Android Platform. " +
                    "With a Bachelor Degree in Computer Science and also recognized as a Google Developer Expert for Android, Yves is an adept of continuous learning and knowledge sharing. He is actively contributing to the Android community through open source projects," +
                    " content creation, public speaking, and mentoring.",
            modifier = Modifier.padding(top = 16.dp).fillMaxWidth(0.6f),
        )


        Row(modifier = Modifier.fillMaxWidth().padding(40.dp)) {
            Column(
                modifier = Modifier.weight(0.6f).padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    "Latest Blog Posts",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(horizontal = 14.dp)
                )
                BlogPostView()
                BlogPostView()
            }
            OutlinedCard(
                modifier = Modifier.weight(0.3f),
                content = {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Text("Work", style = MaterialTheme.typography.titleLarge)

                        workExperiences.forEach { workExperience ->
                            key(workExperience.id) {
                                WorkExperienceView(
                                    workExperience = workExperience,
                                )
                            }
                        }

                        Button(
                            modifier = Modifier.fillMaxWidth(),
                            onClick = {

                            },
                            content = {
                                Text("Contact Me")
                            }
                        )
                    }
                }
            )
            Spacer(modifier = Modifier.weight(0.1f))
        }

        Text("Testimonials", style = MaterialTheme.typography.titleLarge)
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding(top = 30.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(testimonials, key = { testimonial -> testimonial.id }) { testimonial ->
                TestimonialView(
                    authorName = testimonial.name,
                    authorImage = testimonial.image,
                    authorTitle = testimonial.title,
                    quote = testimonial.quote
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))
    }
}

internal expect fun openUrl(url: String?)