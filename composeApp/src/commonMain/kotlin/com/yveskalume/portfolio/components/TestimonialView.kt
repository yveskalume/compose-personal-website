package com.yveskalume.portfolio.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun TestimonialView(
    modifier: Modifier = Modifier,
    authorName: String,
    authorTitle: String,
    authorImage: DrawableResource,
    quote: String
) {
    OutlinedCard(
        modifier = modifier.size(600.dp, 250.dp),
        content = {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Surface(
                    modifier = Modifier.size(60.dp),
                    shape = CircleShape,
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
                ) {
                    Image(
                        painter = painterResource(authorImage),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize().padding(8.dp)
                            .clip(CircleShape),
                    )
                }
                Text(
                    authorName,
                    style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.SemiBold)
                )
                Text(
                    authorTitle,
                    style = MaterialTheme.typography.labelMedium
                )
                Text(
                    quote,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    )
}