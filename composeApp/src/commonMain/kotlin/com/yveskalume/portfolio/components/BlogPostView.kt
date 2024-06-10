package com.yveskalume.portfolio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BlogPostView(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .clickable {}
            .padding(14.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.fillMaxHeight()
                    .background(Color.Red)
                    .width(4.dp)
            )
            Text("1 Jan 2023", style = MaterialTheme.typography.labelMedium)
        }
        Text("Lorem ipsum", style = MaterialTheme.typography.titleMedium)
        Text(
            "Yves Kalume is a Software Engineer specialized in building exceptional mobile experiences for the Android Platform. " +
                    "With a Bachelor Degree in Computer Science and also recognized as a Google Developer Expert for Android, Yves is an adept of continuous learning and knowledge sharing. He is actively contributing to the Android community through open source projects," +
                    " content creation, public speaking, and mentoring.",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Read More >",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary
        )
    }
}