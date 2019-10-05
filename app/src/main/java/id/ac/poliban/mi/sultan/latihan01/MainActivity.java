package id.ac.poliban.mi.sultan.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAndi = findViewById(R.id.btAndi);
        Button btSari = findViewById(R.id.btSari);
        Button btVita = findViewById(R.id.btVita);
        Button btJunai = findViewById(R.id.btJunai);

        btAndi.setOnClickListener(this);
        btSari.setOnClickListener(this);
        btVita.setOnClickListener(this);
        btJunai.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btAndi :
                Toast.makeText(this, "Hai Andi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btSari :
                Toast.makeText(this, "Hai Sari", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btVita:
                Toast.makeText(this, "Hai Vita", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btJunai:
                Toast.makeText(this, "Hai Junai", Toast.LENGTH_SHORT).show();
                break;



        }
    }
}
