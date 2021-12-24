package pcd.tailv.poctwa;

import android.net.Uri;

import com.google.androidbrowserhelper.trusted.LauncherActivity;

public class CustomQueryStringLauncherActivity extends LauncherActivity {

    @Override
    protected Uri getLaunchingUrl() {
        // Get the original launch Url.
        Uri uri = super.getLaunchingUrl();

        // Get the value we want to use for the parameter value
        String customParameterValue = "start_recording";

        // Append the extra parameter to the launch Url
        return uri
                .buildUpon()
                .appendQueryParameter("my_parameter", customParameterValue)
                .build();
    }
}