package com.example.giaodienfigma_chonmaudienthoai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Manhinh2 extends AppCompatActivity {
    int anInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);

        ImageView sanpham=findViewById(R.id.imageView_sanpham);
        ImageView xanhnhat=findViewById(R.id.imageViewxanhnhat);
        ImageView maudo=findViewById(R.id.imageViewdo);
        ImageView den=findViewById(R.id.imageViewden);
        ImageView xanhdam=findViewById(R.id.imageViewxanhdaam);
        Button btnXong=findViewById(R.id.button_Xong);

        xanhnhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sanpham.setImageResource(R.drawable.vs_bac);
                anInt= R.drawable.vs_bac;
            }
        });

        maudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sanpham.setImageResource(R.drawable.vs_red);
                anInt= R.drawable.vs_red;
            }
        });

        den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sanpham.setImageResource(R.drawable.vs_black);
                anInt= R.drawable.vs_black;
            }
        });

        xanhdam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sanpham.setImageResource(R.drawable.vs_xanh);
                anInt= R.drawable.vs_xanh;
            }
        });

        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("index",anInt);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}