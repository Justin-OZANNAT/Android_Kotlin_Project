package com.example.draweractivity.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.draweractivity.AndVersion
import com.example.draweractivity.AndVersionAdapter
import com.example.draweractivity.MainActivity
import com.example.draweractivity.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import org.jetbrains.anko.toast

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)





    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        andVersionRecyclerView.layoutManager = LinearLayoutManager(this.context)
//        andVersionRecyclerView.adapter = AndVersionAdapter(items)
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        button1.setOnClickListener() {
            //buttonToSettings()
            button1.isSelected = !button1.isSelected
            customView.setBackgroundResource(R.color.blue)
            //showBlue(this)
        }

        button2.setOnClickListener {
            button2.isSelected = !button2.isSelected
            customView.setBackgroundResource(R.color.color_primary_dark)
//            showRed()
        }


        button3.setOnClickListener {
            button3.isSelected = !button3.isSelected
            customView.setBackgroundResource(R.color.vert)
            //showGreen(this)
        }

        button4.setOnClickListener {
            button4.isSelected = !button4.isSelected
            customView.setBackgroundResource(R.color.white)
            //showWhite(this)
        }
    }




}