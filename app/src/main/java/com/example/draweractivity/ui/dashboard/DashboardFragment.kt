package com.example.draweractivity.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.draweractivity.AndVersion
import com.example.draweractivity.AndVersionAdapter
import com.example.draweractivity.R
import com.example.draweractivity.ui.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.android.synthetic.main.fragment_home.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            text_dashboard.text = it
        })
        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        andVersionRecyclerView.layoutManager = LinearLayoutManager(this.context)
        andVersionRecyclerView.adapter = AndVersionAdapter(items)


    }




    val items = arrayOf(
        AndVersion("R"),
        AndVersion("E"),
        AndVersion("C"),
        AndVersion("Y"),
        AndVersion("C"),
        AndVersion("L"),
        AndVersion("E"),
        AndVersion("R"),
        AndVersion("    "),
        AndVersion("V"),
        AndVersion("I"),
        AndVersion("E"),
        AndVersion("W"),
        AndVersion("!"),
        AndVersion("!"),

        AndVersion("How bad is it?"),

        AndVersion("We don't know"),

        AndVersion("That's bad"),

        AndVersion("We have to hurry"),

        AndVersion("Lollipop"),
        AndVersion("    "),
        AndVersion("    "),
        AndVersion("    "),
        AndVersion("    "),





        )
}