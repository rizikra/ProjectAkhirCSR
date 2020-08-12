package com.rizik.training.projectig.utils;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rizik.training.projectig.Likes.LikesActivity;
import com.rizik.training.projectig.Home.MainActivity;
import com.rizik.training.projectig.Profile.ProfileActivity;
import com.rizik.training.projectig.R;
import com.rizik.training.projectig.Search.SearchActivity;
import com.rizik.training.projectig.Share.ShareActivity;

import androidx.annotation.NonNull;

public class BottomNavigationHelper {
    private static final String TAG = "BottomNavigationHelper";

    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_house:
                        Intent intentHome = new Intent(context, MainActivity.class); //ACTIVITY_NUM = 0
                        context.startActivity(intentHome);
                        break;

                    case R.id.ic_search:
                        Intent intentSearch = new Intent(context, SearchActivity.class); //ACTIVITY_NUM = 1
                        context.startActivity(intentSearch);
                        break;

                    case R.id.ic_add:
                        Intent intentShare = new Intent(context, ShareActivity.class); //ACTIVITY_NUM = 2
                        context.startActivity(intentShare);
                        break;

                    case R.id.ic_notification:
                        Intent intentLikes = new Intent(context, LikesActivity.class); //ACTIVITY_NUM = 3
                        context.startActivity(intentLikes);
                        break;

                    case R.id.ic_profile:
                        Intent intentProfile = new Intent(context, ProfileActivity.class); //ACTIVITY_NUM = 4
                        context.startActivity(intentProfile);
                        break;
                }

                return false;
            }
        });
    }
}
