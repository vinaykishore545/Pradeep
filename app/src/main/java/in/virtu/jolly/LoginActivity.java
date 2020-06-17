package in.virtu.jolly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button ba=findViewById(R.id.but);
        final TextView ww=findViewById(R.id.bottom);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                        Intent i=new Intent(LoginActivity.this,RegisterActivity.class);
                        startActivity(i);

                        //the current activity will get finished.
                    }
                }, 900);

                YoYo.with(Techniques.Tada)
                        .duration(700)
                        .playOn(findViewById(R.id.editest123));

            }
        });

        EditText ed=findViewById(R.id.email);
        ed.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {
                ww.setVisibility(View.VISIBLE);
                return false;
            }
        });
    }
}
