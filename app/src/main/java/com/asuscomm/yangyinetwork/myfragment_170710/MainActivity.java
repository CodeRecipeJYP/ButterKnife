package com.asuscomm.yangyinetwork.myfragment_170710;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {
    private final String TAG = "jaeyoung/"+getClass().getSimpleName();
    @BindView(R.id.helloBtn) TextView helloBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    
    @OnClick(R.id.helloBtn)
    public void helloBtnClicked(View view) {
        Log.d(TAG, "helloBtnClicked: ");
    } 
}
