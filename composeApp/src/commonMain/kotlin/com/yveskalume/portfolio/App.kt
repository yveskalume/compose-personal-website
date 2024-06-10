package com.yveskalume.portfolio

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yveskalume.portfolio.components.Testimonial
import com.yveskalume.portfolio.theme.AppTheme
import org.jetbrains.compose.resources.painterResource
import yveskalume.composeapp.generated.resources.Res
import yveskalume.composeapp.generated.resources.droidcon
import yveskalume.composeapp.generated.resources.ericampire
import yveskalume.composeapp.generated.resources.mychurch
import yveskalume.composeapp.generated.resources.saganize
import yveskalume.composeapp.generated.resources.yveskalume
import yveskalume.composeapp.generated.resources.zx_connect

@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal fun App() = AppTheme {
    val windowInfo = LocalWindowInfo.current
    val density = LocalDensity.current

    val screenWidth = with(density) { windowInfo.containerSize.width.dp }
    val screenHeight = with(density) { windowInfo.containerSize.height.dp }

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
                .size(100.dp).clip(CircleShape),
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
            Column(modifier = Modifier.weight(0.6f).padding(horizontal = 16.dp)) {
                Text(
                    "Last Blog Posts",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(horizontal = 14.dp)
                )
                Column(
                    modifier = Modifier
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
                }
            }
            OutlinedCard(
                modifier = Modifier.weight(0.3f),
                content = {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Text("Work", style = MaterialTheme.typography.titleLarge)

                        Row(modifier = Modifier.height(IntrinsicSize.Min)) {
                            Surface(
                                shape = CircleShape,
                                modifier = Modifier.size(40.dp),
                                border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
                            ) {
                                Image(
                                    painter = painterResource(Res.drawable.mychurch),
                                    contentDescription = "MyChurch App",
                                    modifier = Modifier.fillMaxSize().padding(4.dp)
                                        .clip(CircleShape),
                                )
                            }
                            Spacer(Modifier.width(8.dp))
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("MyChurch App", style = MaterialTheme.typography.labelLarge)
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        "Android Developer",
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                    Text(
                                        "2023-Present",
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                }
                            }
                        }

                        Row(modifier = Modifier.height(IntrinsicSize.Min)) {
                            Surface(
                                shape = CircleShape,
                                modifier = Modifier.size(40.dp),
                                border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
                            ) {
                                Image(
                                    painter = painterResource(Res.drawable.droidcon),
                                    contentDescription = "Droidcon Academy",
                                    modifier = Modifier.fillMaxSize().padding(4.dp)
                                        .clip(CircleShape),
                                )
                            }
                            Spacer(Modifier.width(8.dp))
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    "Droidcon Academy",
                                    style = MaterialTheme.typography.labelLarge
                                )
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        "Android Course Instructor",
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                    Text(
                                        "2023-Present",
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                }
                            }
                        }

                        Row(modifier = Modifier.height(IntrinsicSize.Min)) {
                            Surface(
                                shape = CircleShape,
                                modifier = Modifier.size(40.dp),
                                border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
                            ) {
                                Image(
                                    painter = painterResource(Res.drawable.saganize),
                                    contentDescription = "Saganize",
                                    modifier = Modifier.fillMaxSize().padding(4.dp)
                                        .clip(CircleShape),
                                )
                            }
                            Spacer(Modifier.width(8.dp))
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("Saganize", style = MaterialTheme.typography.labelLarge)
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        "Android Developer",
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                    Text("2023-2023", style = MaterialTheme.typography.labelMedium)
                                }
                            }
                        }

                        Row(modifier = Modifier.height(IntrinsicSize.Min)) {
                            Surface(
                                shape = CircleShape,
                                modifier = Modifier.size(40.dp),
                                border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
                            ) {
                                Image(
                                    painter = painterResource(Res.drawable.zx_connect),
                                    contentDescription = "Zx connect",
                                    modifier = Modifier.fillMaxSize().padding(4.dp)
                                        .clip(CircleShape),
                                )
                            }
                            Spacer(Modifier.width(8.dp))
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("Zx connect", style = MaterialTheme.typography.labelLarge)
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        "Android Developer",
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                    Text("2020-2023", style = MaterialTheme.typography.labelMedium)
                                }
                            }
                        }
                    }
                }
            )
            Spacer(modifier = Modifier.weight(0.1f))
        }

        Text("Testimonials")
        LazyRow {
            item {
                Testimonial(
                    authorName = "Eric Ampire",
                    authorImage = Res.drawable.ericampire,
                    authorTitle = "Mobile Enginer at BRP & Google Developer Expert for Android",
                    quote = "Probably the talented Android developer I work with, aware of " +
                            "the enemy of excellence, always ready to learn new things."
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))
    }
}

internal expect fun openUrl(url: String?)