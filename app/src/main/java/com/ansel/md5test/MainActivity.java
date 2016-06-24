package com.ansel.md5test;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;

import static com.ansel.md5test.MD5Util.getFileMD5String;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        md5test();
    }

    private void md5test() {
        long begin = System.currentTimeMillis();
//
        File file = new File(Environment.getExternalStorageDirectory() + "/xxx");
        String md5 = null;
        try {
            md5 = getFileMD5String(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //      String md5 = getMD5String("a");

        long end = System.currentTimeMillis();
        System.out.println("md5:" + md5 + " time:" + ((end - begin) / 1000) + "s");
    }


}
