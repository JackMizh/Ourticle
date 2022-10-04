package com.example.ourticle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class FavActivity extends AppCompatActivity {

    private boolean isClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);

        Window window = this.getWindow();

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.blue_primary));

        View vMusic = (View) findViewById(R.id.vMusic);
        View vFilm = (View) findViewById(R.id.vFilm);
        View vGame = (View) findViewById(R.id.vGame);
        View vTravel  = (View) findViewById(R.id.vTravel);
        View vSport = (View) findViewById(R.id.vSport);
        View vFood = (View) findViewById(R.id.vFood);

        ImageView ivMusic = (ImageView) findViewById(R.id.ivMusic);
        ImageView ivFilm = (ImageView) findViewById(R.id.ivFilm);
        ImageView ivGame = (ImageView) findViewById(R.id.ivGame);
        ImageView ivTravel = (ImageView) findViewById(R.id.ivTravel);
        ImageView ivSport = (ImageView) findViewById(R.id.ivSport);
        ImageView ivFood = (ImageView) findViewById(R.id.ivFood);

        TextView tvMusic = (TextView) findViewById(R.id.tvMusic);
        TextView tvFilm = (TextView) findViewById(R.id.tvFilm);
        TextView tvGame = (TextView) findViewById(R.id.tvGame);
        TextView tvTravel = (TextView) findViewById(R.id.tvTravel);
        TextView tvSport = (TextView) findViewById(R.id.tvSport);
        TextView tvFood = (TextView) findViewById(R.id.tvFood);

        ImageButton ibFav = (ImageButton) findViewById(R.id.ibFav);

        vMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick){
                    vMusic.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_white));
                    ivMusic.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_music));
                    tvMusic.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.blue_primary));
                    isClick = false;
                } else {
                    vMusic.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_clicked));
                    ivMusic.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_music_clicked));
                    tvMusic.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.white));
                    isClick = true;
                }
            }
        });

        vFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick){
                    vFilm.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_white));
                    ivFilm.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_film));
                    tvFilm.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.blue_primary));
                    isClick = false;
                } else {
                    vFilm.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_clicked));
                    ivFilm.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_film_clicked));
                    tvFilm.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.white));
                    isClick = true;
                }
            }
        });

        vGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick){
                    vGame.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_white));
                    ivGame.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_game));
                    tvGame.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.blue_primary));
                    isClick = false;
                } else {
                    vGame.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_clicked));
                    ivGame.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_game_clicked));
                    tvGame.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.white));
                    isClick = true;
                }
            }
        });

        vTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick){
                    vTravel.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_white));
                    ivTravel.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_travel));
                    tvTravel.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.blue_primary));
                    isClick = false;
                } else{
                    vTravel.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_clicked));
                    ivTravel.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_travel_clicked));
                    tvTravel.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.white));
                    isClick = true;
                }
            }
        });

        vSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick){
                    vSport.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_white));
                    ivSport.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_sport));
                    tvSport.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.blue_primary));
                    isClick = false;
                } else {
                    vSport.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_clicked));
                    ivSport.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_sport_clicked));
                    tvSport.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.white));
                    isClick = true;
                }
            }
        });

        vFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick){
                    vFood.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_white));
                    ivFood.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_food));
                    tvFood.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.blue_primary));
                    isClick = false;
                } else{
                    vFood.setBackground(ContextCompat.getDrawable(FavActivity.this, R.drawable.bg_fav_clicked));
                    ivFood.setImageDrawable(ContextCompat.getDrawable(FavActivity.this, R.drawable.ic_food_clicked));
                    tvFood.setTextColor(ContextCompat.getColor(FavActivity.this, R.color.white));
                    isClick = true;
                }
            }
        });

        ibFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
            }
        });

    }
}