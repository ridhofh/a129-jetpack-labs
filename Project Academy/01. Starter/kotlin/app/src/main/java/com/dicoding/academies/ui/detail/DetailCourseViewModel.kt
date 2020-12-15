package com.dicoding.academies.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.ModuleEntity
import com.dicoding.academies.utils.DataDummy

class DetailCourseViewModel : ViewModel() {
    private lateinit var courseId: String

    fun selectedCourse(courseId: String){
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity{
        lateinit var course: CourseEntity
        val courseEntities = DataDummy.generateDummyCourses()
        for (courseEntity in courseEntities ) {
            if (courseEntity.courseId == courseId){
                course = courseEntity
            }
        }
        return course
    }

    fun getModules() : List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}