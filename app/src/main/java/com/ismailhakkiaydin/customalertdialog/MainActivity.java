package com.ismailhakkiaydin.customalertdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);

        LayoutInflater li = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View design = li.inflate(R.layout.custom_alert_design,null);

        TextView txtTitle =  (TextView) ((LinearLayout)design).findViewById(R.id.textView);
        TextView txtMessage = design.findViewById(R.id.textView2);

        txtTitle.setText("Information");
        txtMessage.setText("File Downloading...");

        dlg.setView(design);

        dlg.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        dlg.show();


        MessageBox.Show(MainActivity.this, "CSD", "Are you sure deleting this file?",MessageBox.OK_CANCEL);

    }
}
