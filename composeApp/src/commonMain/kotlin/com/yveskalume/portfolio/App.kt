package com.yveskalume.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yveskalume.portfolio.theme.AppTheme
import org.jetbrains.compose.resources.painterResource
import yveskalume.composeapp.generated.resources.Res
import yveskalume.composeapp.generated.resources.yveskalume

@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal fun App() = AppTheme {
    val windowInfo = LocalWindowInfo.current
    val density = LocalDensity.current

    val screenWidth = with(density) { windowInfo.containerSize.width.dp }
    val screenHeight = with(density) { windowInfo.containerSize.height.dp }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsPadding(WindowInsets.safeDrawing)
                .padding(horizontal = 24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().height(screenHeight),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.padding(bottom = 16.dp)) {
                    Text(
                        modifier = Modifier.align(Alignment.Start),
                        text = "Software",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontSize = 100.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        modifier = Modifier.align(Alignment.Start),
                        text = "Engineer",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontSize = 100.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }

                Image(
                    painter = painterResource(Res.drawable.yveskalume),
                    contentDescription = "Yves Kalume Picture",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                        .size(400.dp).clip(CircleShape),
                    contentScale = ContentScale.Crop,
                )

                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
                    Text(
                        text = "Yves",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontSize = 100.sp,
                            fontWeight = FontWeight.Bold
                        ),
                    )
                    Text(
                        text = "Kalume",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontSize = 100.sp,
                            fontWeight = FontWeight.Bold
                        ),
                    )
                }
            }

            Card(
                modifier = Modifier.fillMaxWidth().padding(32.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        "About Me",
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        "Yves Kalume is a Software Engineer specialized in building exceptional mobile experiences for the Android Platform. " +
                                "With a Bachelor Degree in Computer Science and also recognized as a Google Developer Expert for Android, Yves is an adept of continuous learning and knowledge sharing. He is actively contributing to the Android community through open source projects," +
                                " content creation, public speaking, and mentoring.",
                        modifier = Modifier.padding(top = 16.dp),
                    )
                }
            }
        }
    }
}

internal expect fun openUrl(url: String?)