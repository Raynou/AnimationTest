package com.example.animationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ImageView image;
    Animation test1, test2, test3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.txt);
        image = (ImageView)findViewById(R.id.image);

        test1 = AnimationUtils.loadAnimation(this, R.anim.test1); //Esta no fue utilizada en el vídeo que te mandé pero es una animación de traslación
        test2 = AnimationUtils.loadAnimation(this, R.anim.test2); //Para rotar
        test3 = AnimationUtils.loadAnimation(this, R.anim.test3); //Para desaparecer o aparecer (fade o alpha)

        text.setAnimation(test3); //Le mando a mi TextView la animación fade
        image.setAnimation(test2); //Le mando a mi ImageView la animación rotate

        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();
        //Cambio en el código java jos jos jos
    }
}
