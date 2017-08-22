package onairm.com.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.onairm.baselibrary.camera.CameraHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CameraHelper.Builder builder = new CameraHelper.ActBuilder(this,false,false);
        CameraHelper cameraHelper = new CameraHelper(builder) {
            @Override
            public void uploadSuccess(USCEntity uscEntity) {

            }
        };
    }
}
