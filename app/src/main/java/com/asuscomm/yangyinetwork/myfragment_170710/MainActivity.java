package com.asuscomm.yangyinetwork.myfragment_170710;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindString;
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
        Log.d(TAG, "onCreate: ");

        ButterKnife.bind(this);
        Log.d(TAG, "onCreate: helloMessage="+Strings.getInstance().helloMessage);
        // 여기서 쓰고싶은데, static으로 해야되잖아
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    
    @OnClick(R.id.helloBtn)
    public void helloBtnClicked(View view) {
        Log.d(TAG, "helloBtnClicked: ");
    } 
}
