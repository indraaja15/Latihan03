package id.ac.poliban.dts.indra.latihan03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //kenalkan view ke obejct di source kita
        EditText etUsername = findViewById(R.id.etUsername );
        EditText etPassword = findViewById(R.id.etPassword );
        Button btLogin = findViewById(R.id.btLogin) ;
        Button btClear = findViewById(R.id.btClear) ;

        btClear.setOnClickListener(v -> {
           //mengosongkan EditText
           etUsername.setText("");
           etPassword.setText("");
           //meletakan cursor
            etUsername.requestFocus();
        }) ;

        btLogin.setOnClickListener(v -> {
            //mengosongkan EditText
            etUsername.setText("");
            etPassword.setText("");
            //meletakan cursor
            etPassword.requestFocus();
            Toast.makeText(this, "You have logged", Toast.LENGTH_SHORT).show();
        });
    }
}
