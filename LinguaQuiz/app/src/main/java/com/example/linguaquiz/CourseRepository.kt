package com.example.linguaquiz

object CourseRepository {

    @JvmStatic
    fun getAllCourses(): List<StaticCourse> {
        return getAllStaticCourses()
    }

    fun getAllStaticCourses(): List<StaticCourse> {
        return frenchBeginnerCourses + 
               frenchIntermediateCourses + 
               frenchAdvancedCourses + 
               englishBeginnerCourses + 
               englishIntermediateCourses + 
               englishAdvancedCourses
    }
}
