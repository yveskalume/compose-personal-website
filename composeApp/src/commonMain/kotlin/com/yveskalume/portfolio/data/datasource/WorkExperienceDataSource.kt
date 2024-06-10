package com.yveskalume.portfolio.data.datasource

import com.yveskalume.portfolio.data.model.WorkExperience
import yveskalume.composeapp.generated.resources.Res
import yveskalume.composeapp.generated.resources.droidcon
import yveskalume.composeapp.generated.resources.mychurch
import yveskalume.composeapp.generated.resources.saganize
import yveskalume.composeapp.generated.resources.zx_connect

object WorkExperienceDataSource {

    val workExperiences = listOf(
        WorkExperience(
            id = 1,
            company = "Mychurch App",
            companyLogo = Res.drawable.mychurch,
            position = "Android Developer",
            startDate = "2023",
            endDate = "Present",
        ),
        WorkExperience(
            id = 2,
            company = "Droidcon Academy",
            companyLogo = Res.drawable.droidcon,
            position = "Android Course Instructor",
            startDate = "2023",
            endDate = "Present",
        ),
        WorkExperience(
            id = 3,
            company = "Saganize",
            companyLogo = Res.drawable.saganize,
            position = "Android Developer",
            startDate = "2023",
            endDate = "2023",
        ),
        WorkExperience(
            id = 4,
            company = "Zx connect",
            companyLogo = Res.drawable.zx_connect,
            position = "Android Developer",
            startDate = "2020",
            endDate = "2023",
        ),
    )
}