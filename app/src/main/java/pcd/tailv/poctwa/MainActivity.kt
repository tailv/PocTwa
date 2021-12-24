package pcd.tailv.poctwa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pcd.tailv.poctwa.databinding.ActivityMainBinding


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
            val intent = Intent(this, CustomQueryStringLauncherActivity::class.java).apply {
                data = Uri.parse(getString(R.string.launchUrl))
            }
            startActivity(intent)
        }
    }
}