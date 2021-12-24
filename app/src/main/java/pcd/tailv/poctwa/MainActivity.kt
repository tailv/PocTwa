package pcd.tailv.poctwa

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.androidbrowserhelper.trusted.LauncherActivity
import pcd.tailv.poctwa.databinding.ActivityMainBinding
import com.google.androidbrowserhelper.trusted.TwaLauncher




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setup()
    }

    private fun setup() {
        binding.btnLaunchPwa.setOnClickListener {
            val intent = Intent(this, LauncherActivity::class.java).apply {
                action = Intent.ACTION_VIEW
            }
            startActivity(intent)
        }
    }
}