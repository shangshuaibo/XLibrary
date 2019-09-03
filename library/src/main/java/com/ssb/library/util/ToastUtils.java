package com.ssb.library.util;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Toast工具类
 */
public class ToastUtils {

    private ToastUtils() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 长时间居中弹框
     *
     * @param str
     */
    public static void showMessageCenter(Context context, String str) {
        Toast toast = Toast.makeText(context, str, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        int textview_id = Resources.getSystem().getIdentifier("message", "id", "android");
        ((TextView) toast.getView().findViewById(textview_id)).setGravity(Gravity.CENTER);
        toast.show();
    }

}
