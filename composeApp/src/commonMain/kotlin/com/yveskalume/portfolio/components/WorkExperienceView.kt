package com.yveskalume.portfolio.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.yveskalume.portfolio.data.model.WorkExperience
import org.jetbrains.compose.resources.painterResource

@Composable
fun WorkExperienceView(
    workExperience: WorkExperience,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.height(IntrinsicSize.Min)) {
        Surface(
            shape = CircleShape,
            modifier = Modifier.size(40.dp),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
        ) {
            Image(
                painter = painterResource(workExperience.companyLogo),
                contentDescription = workExperience.company,
                modifier = Modifier.fillMaxSize().padding(4.dp)
                    .clip(CircleShape),
            )
        }
        Spacer(Modifier.width(8.dp))
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(workExperience.company, style = MaterialTheme.typography.labelLarge)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    workExperience.position,
                    style = MaterialTheme.typography.labelMedium
                )
                Text(
                    "${workExperience.startDate}-${workExperience.endDate}",
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }
    }
}