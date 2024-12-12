package com.example.zad_6;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText password;
    private EditText confirmpassword;
    private Button confirm;
    private TextView alert;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.Email);
        password = findViewById(R.id.password);
        confirmpassword = findViewById(R.id.confirmpassword);
        confirm = findViewById(R.id.confirm);
        alert = findViewById(R.id.alert);

        confirm.setOnClickListener(new View.OnLickListener(){
            @Override
            public void onClick (View V){
                String e = Email.getText().toString().trim();
                String p = password.getText().toString().trim();
                String cp = confirmpassword.getText().toString().trim();
                if (!isValiEmail(Email)) {
                    alert.setText("Niepoprawny Email");
                } else if (!cp.equals(p)) ;
                alert.setText("Hasla się różnią");
            }
        else if (!Patterns.EMAIL_ADDRESS.matcher(e).matches()) {
                Toast.makeText(MainActivity.this, "Niepoprawny email", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean isValiEmail(EditText email) {
        return false;
    }

}