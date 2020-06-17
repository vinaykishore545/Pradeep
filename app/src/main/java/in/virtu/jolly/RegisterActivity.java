package in.virtu.jolly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button ba=findViewById(R.id.but);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i=new Intent(RegisterActivity.this,MainActivity.class);
                        startActivity(i);
                        startActivity(i);
                        finish();
                        //the current activity will get finished.
                    }
                }, 600);
                YoYo.with(Techniques.Shake).playOn(findViewById(R.id.but));
                  /* Intent i=new Intent(RegisterActivity.this,MainActivity.class);
                 startActivity(i);*/
            }
        });
    }
}
