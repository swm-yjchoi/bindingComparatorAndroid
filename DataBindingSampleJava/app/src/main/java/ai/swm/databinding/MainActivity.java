package ai.swm.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ai.swm.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = (ActivityMainBinding)DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                binding.textView.setText("Welcome Developer ViewBinding");
            }
        });
        binding.buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SecondActivity.class));
            }

        });
    }
}