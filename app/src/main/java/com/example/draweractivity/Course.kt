package com.example.draweractivity

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class Course(val title: String, val time: Int) {
    interface CoursesService {
        @GET("/courses")
        fun listCourses(): retrofit2.Call<List<Course>>
    }
}

