package com.ismailhakkiaydin.customalertdialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MessageBox {

    public  static final int OK = 1;
    public  static final int CANCEL = 2;
    public static final int OK_CANCEL = 3;

    private static DialogInterface.OnClickListener p = null, n=null;
    public static void setPositiveListener(DialogInterface.OnClickListener listener){
        p=listener;
    }

    public static void setNegativeListener(DialogInterface.OnClickListener listener){
        n=listener;
    }

    public static void Show(Context context, String title, String prompt, int Button){
        AlertDialog.Builder wnd = new AlertDialog.Builder(context);
        wnd.setTitle(title);
        wnd.setMessage(prompt);
        wnd.setIcon(R.drawable.ic_launcher_background);

        switch (Button){
            case MessageBox.OK:
                wnd.setPositiveButton("Ok",p);
                break;
            case MessageBox.CANCEL:
                wnd.setNegativeButton("Cancel",n);
                break;
            case MessageBox.OK_CANCEL:
                wnd.setPositiveButton("Ok",p);
                wnd.setNegativeButton("Cancel",n);
                break;
        }
        wnd.show();
    }

}
