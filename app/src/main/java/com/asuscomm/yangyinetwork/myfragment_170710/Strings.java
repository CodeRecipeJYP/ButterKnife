package com.asuscomm.yangyinetwork.myfragment_170710;

import android.content.Context;
import android.content.res.Resources;

import butterknife.BindString;
import butterknife.ButterKnife;

/**
 * Created by jaeyoung on 7/10/17.
 */

public class Strings {
    private static Strings sInstance;
    @BindString(R.string.hello_message) String helloMessage;
    // static 안쓰고 저기서 쓸방법있을까

    public static Strings getInstance() {
        if (sInstance == null) {
            sInstance = new Strings();
            new Strings_ViewBinding(sInstance, GlobalApplication.getInstance());
        }
        return sInstance;
    }
    // 우리앱에 Strings에
}
