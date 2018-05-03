package tw.edu.ncut.a3a417074.s3a417074_76_82_finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btStart,btEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btStart = findViewById(R.id.btStart);
        btEnd = findViewById(R.id.btEnd);

        btStart.setOnClickListener(this);
        btEnd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btStart :
                Intent intent = new Intent(MainActivity.this,ConnectActivity.class);
                startActivity(intent);
                break;
            case R.id.btEnd :
                finish();
                break;
        }
    }
}
