package com.dicoding.academies.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.ModuleEntity
import com.dicoding.academies.data.source.AcademyRepository
import com.dicoding.academies.utils.DataDummy

class DetailCourseViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String){
        this.courseId = courseId
    }

    fun getCourse(): LiveData<CourseEntity> = academyRepository.getCourseWithModules(courseId)

    fun getModules() : LiveData<List<ModuleEntity>> = academyRepository.getAllModulesByCourse(courseId)
}