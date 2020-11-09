package com.example.draweractivity

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


private val url = "http://mobile-courses-server.herokuapp.com/"


val retrofit = Retrofit.Builder()
    .baseUrl(url)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()
val service = retrofit.create(Course.CoursesService::class.java)
val courseRequest = service.listCourses()


//------- BUG AF NEED HELP --------////


 /*
courseRequest.enqueue(object : Callback<List<Course>> {
    override fun onResponse(call: Call<List<Course>>, response: Response<List<Course>>) {
        val allCourse = response.body()
        if (allCourse != null) {
            info("HERE is ALL COURSES FROM HEROKU SERVER:")
            for (c in allCourse)
                info(" one course : ${c.title} : ${c.time} ")
        }
    }
    override fun onFailure(call: Call<List<Course>>, t: Throwable) {
        error("KO")

})*/