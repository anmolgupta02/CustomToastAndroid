package com.example.gradletoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {

        switch (view.getId()) {

            case R.id.errorBtn:
                Toasty.error(this, "This is an Error Message", Toast.LENGTH_SHORT).show();
                break;

            case R.id.successBtn:
                Toasty.success(this, "This is a Success Message", Toast.LENGTH_SHORT).show();
                break;

            case R.id.warningBtn:
                Toasty.warning(this, "This is a Warning Message", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoBtn:
                Toasty.info(this, "This is an information Message", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imgBtn:
                Toasty.normal(this, "This is a Upload Message", Toast.LENGTH_SHORT, ContextCompat.getDrawable(this, R.drawable.ic_cloud)).show();
                break;

        }

    }
}
