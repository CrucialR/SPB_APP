//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.rim.icisapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Image_View extends Activity {
    private File sdRoot;
    private String dir;
    private String fileName;
    private ImageView image_view;
    private String path;

    public Image_View() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(1);
        this.getWindow().addFlags(128);
        this.setContentView(2130968611);
        this.sdRoot = Environment.getExternalStorageDirectory();
        this.dir = "DCIM/Data_Collection";
        this.fileName = "IMG_" + (new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date()).toString() + "2.jpg";
        this.image_view = (ImageView)this.findViewById(2131492975);
        Intent img = this.getIntent();
        this.path = img.getStringExtra("ImgURI");
        this.image_view.setImageURI(Uri.fromFile(new File(this.path)));
    }
}
