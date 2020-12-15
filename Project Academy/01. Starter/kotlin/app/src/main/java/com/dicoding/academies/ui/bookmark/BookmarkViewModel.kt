package com.dicoding.academies.ui.bookmark

import androidx.lifecycle.ViewModel
import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBoorkmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}