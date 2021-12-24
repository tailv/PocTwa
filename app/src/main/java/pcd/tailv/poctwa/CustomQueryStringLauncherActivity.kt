package pcd.tailv.poctwa

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.androidbrowserhelper.trusted.LauncherActivity

class CustomQueryStringLauncherActivity : LauncherActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "CustomQueryStringLauncherActivity", Toast.LENGTH_LONG).show()
        Log.d("CustomQueryStringLauncherActivity", "onCreate")
    }

    override fun getLaunchingUrl(): Uri {
        // Get the original launch Url.
        val uri = super.getLaunchingUrl()

        // Get the value we want to use for the parameter value
        val customParameterValue = "start_recording"

        // Append the extra parameter to the launch Url
        return uri
            .buildUpon()
            .appendQueryParameter("my_parameter", customParameterValue)
            .build()
    }
}