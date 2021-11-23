package ai.swm.databinding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import ai.swm.databinding.adapter.MovieAdapter;
import ai.swm.databinding.databinding.ActivitySecondBinding;
import ai.swm.databinding.model.MovieModelView;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = (ActivitySecondBinding)DataBindingUtil.setContentView(this, R.layout.activity_second);
        initRecyclerView();
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<MovieModelView> listMovie = new ArrayList<MovieModelView>();
        listMovie.add(
                new MovieModelView(
                        "My Spy",
                        "A hardened CIA operative finds himself at the mercy of a precocious 9-year-old girl, having been sent undercover to surveil her family.",
                        "2020-02-27",
                        6.8
                )
        );
        listMovie.add(
                new MovieModelView(
                        "Like a Boss",
                        "Two female friends with very different ideals decide to start a beauty company together. One is more practical, while the other wants to earn her fortune and live a lavish lifestyle.",
                        "2020-01-09",
                        6.7
                )
        );
        listMovie.add(
                new MovieModelView(
                        "Ad Astra",
                        "The near future, a time when both hope and hardships drive humanity to look to the stars and beyond. While a mysterious phenomenon menaces to destroy life on planet Earth, astronaut Roy McBride undertakes a mission across the immensity of space and its many perils to uncover the truth about a lost expedition that decades before boldly faced emptiness and silence in search of the unknown.\"",
                        "2019-09-17",
                        6.0
                )
        );
        listMovie.add(
                new MovieModelView(
                        "Trolls World Tour",
                        "Queen Poppy and Branch make a surprising discovery — there are other Troll worlds beyond their own, and their distinct differences create big clashes between these various tribes. When a mysterious threat puts all of the Trolls across the land in danger, Poppy, Branch, and their band of friends must embark on an epic quest to create harmony among the feuding Trolls to unite them against certain doom.",
                        "2020-03-20",
                        7.7
                )
        );

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(new MovieAdapter(listMovie));
    }
}
