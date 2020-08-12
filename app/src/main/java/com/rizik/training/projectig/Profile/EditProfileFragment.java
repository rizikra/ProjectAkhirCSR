package com.rizik.training.projectig.Profile;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.rizik.training.projectig.R;
import com.rizik.training.projectig.utils.UniversalImageLoader;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EditProfileFragment extends Fragment {
    private static final String TAG = "EditProfileFragment";
    private ImageView mProfilePhoto;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_editprofile, container,false);
            mProfilePhoto = (ImageView) view.findViewById(R.id.profile_photo);
            setProfileImage();

            //BackArrow for navigating back to ProfileActivity
        ImageView backArrow = (ImageView) view.findViewById(R.id.bacArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: navigating back to ProfileActivity");
                getActivity().finish();
            }
        });

            return view;
    }
    private void  setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile image.");
        String imgURL = "www.freepngimg.com/thumb/android/31133-3-android-image.png";
        UniversalImageLoader.setImage(imgURL, mProfilePhoto, null, "https://");
    }
}