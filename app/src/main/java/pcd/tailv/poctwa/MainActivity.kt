package pcd.tailv.poctwa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.androidbrowserhelper.trusted.LauncherActivity
import pcd.tailv.poctwa.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(this, "MainActivity is running!", Toast.LENGTH_LONG).show()
        Log.d("MainActivity", "onCreate")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setup()


    }

    private fun setup() {
        binding.btnLaunchPwa.setOnClickListener {
            val intent = Intent(this, CustomQueryStringLauncherActivity::class.java).apply {
                data = Uri.parse(getString(R.string.launchUrl))
            }
            startActivity(intent)
        }
    }
}