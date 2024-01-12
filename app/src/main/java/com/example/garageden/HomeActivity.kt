package com.example.garageden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.garageden.auth.LoginActivity
import com.example.garageden.botmnavfragments.FiltersFragment
import com.example.garageden.botmnavfragments.HomeFragment
import com.example.garageden.botmnavfragments.ProfileFragment
import com.example.garageden.botmnavfragments.ServicesFragment
import com.example.garageden.databinding.ActivityHomeBinding
import com.example.garageden.drawerfragments.HelpSupportFragment
import com.example.garageden.drawerfragments.JobsFragment
import com.example.garageden.drawerfragments.NotificationFragment
import com.example.garageden.drawerfragments.SettingsFragment
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener{

   private lateinit var binding : ActivityHomeBinding
    private lateinit var fragmentManager: FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

          val toggle = ActionBarDrawerToggle(
              this,
              binding.drawerLayout,
              binding.toolbar,
              R.string.nav_open,
              R.string.nav_close
          )

        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        //Default Navigation bar Tab selected
        replaceFragment(HomeFragment())
        binding.navigationDrawer.setCheckedItem(R.id.nav_jobs)

        //set nav item selected listener

        binding.navigationDrawer.setNavigationItemSelectedListener(this)

        //on item listener for bottom nav, when user clicks menu, it opens its frag

        binding.bottomNavigation.setOnItemSelectedListener {item ->
               when(item.itemId){
                   R.id.homeFragment -> openFragment(HomeFragment())
                   R.id.profileFragment -> openFragment(ProfileFragment())
                   R.id.servicesFragment -> openFragment(ServicesFragment())
                   R.id.filtersFragment -> openFragment(FiltersFragment())
               }
            true
        }
        //add opening fragment when you open app first frag will be Home Fragment

        fragmentManager = supportFragmentManager
        openFragment(HomeFragment())

    }

    //Use replace() to replace an existing fragment in a container with an instance of a new fragment class that you provide.
    //Calling replace() is equivalent to calling remove() with a fragment in a container and adding a new fragment to that same container.
    private fun replaceFragment(fragment: Fragment) {
         supportFragmentManager
             .beginTransaction()
             .replace(R.id.fragment_container, fragment)
             .commit()
    }

    //assign items to respective fragments
    //when acts as a switch case
    //item id will take id in nav_drawer

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_jobs -> openFragment(JobsFragment())
            R.id.nav_helpsup -> openFragment(HelpSupportFragment())
            R.id.nav_settings -> openFragment(SettingsFragment())
            R.id.nav_notification -> openFragment(NotificationFragment())
            R.id.nav_logout -> {
                logout()
                return true
            }
        }

        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun logout() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()

    }

    //if nav drawer is open and click back button, drawer will close
    //else is drawer closed press back button, it should exit


    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressedDispatcher.onBackPressed()
        }
    }

        //instead of writing the same code again and again, use the method openFragment
        //use fragmentTrans and frag manager that will help replace fragments in fragment_container
        //which is frame layout
        //commit means finalizing the changes

    private fun openFragment(fragment: Fragment){
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }

}