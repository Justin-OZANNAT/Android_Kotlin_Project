package com.example.draweractivity

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.preference.PreferenceManager
import androidx.recyclerview.widget.LinearLayoutManager
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*


class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)



        /*PreferenceManager.setDefaultValues(this, R.xml.fragment_settings, false)
        var defaultSharedPref = PreferenceManager.getDefaultSharedPreferences(this)
        defaultSharedPref.getBoolean(getString(R.string.pref_sound), true)
        var sharedPref = getPreferences(Context.MODE_PRIVATE)
        var editor: SharedPreferences.Editor = sharedPref.edit()
        editor.putInt("5", 5)
        var userName: String by DelegatesExt.preference(this, PREF_NAME, "Justin")
        userName = "Justin"*/

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


    }



    companion object {
        const val PREF_NAME = "John"
    }

    //Debut du code du recycler view



    @SuppressLint("ResourceType")
    fun buttonToSettings() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Couleurs")
        builder.setMessage("Choisissez une couleur")
        builder.show()
    }


    fun showRed(v: MainActivity){
        toast("Rouge")
    }
    fun showWhite(v: MainActivity){
        toast("Blanc")
    }
    fun showBlue(v: MainActivity){
        toast("Bleu")
    }
    fun showGreen(v: MainActivity){
        toast("Vert")
    }



}