package com.dicoding.academies.ui.bookmark

import androidx.lifecycle.ViewModel
import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.source.AcademyRepository
import com.dicoding.academies.utils.DataDummy

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmark(): List<CourseEntity> = academyRepository.getBookmarkedCourses()
}