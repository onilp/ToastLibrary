package com.example.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void getToast(Context c, String message){
        Toast.makeText(c,message, Toast.LENGTH_LONG).show();
    }
}
