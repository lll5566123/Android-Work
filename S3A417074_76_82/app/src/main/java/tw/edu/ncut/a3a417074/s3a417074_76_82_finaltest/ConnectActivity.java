package tw.edu.ncut.a3a417074.s3a417074_76_82_finaltest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ConnectActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btConnect_master,btConnect_find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        btConnect_master = findViewById(R.id.btConnect_master);
        btConnect_find = findViewById(R.id.btConnect_find);

        btConnect_master.setOnClickListener(this);
        btConnect_find.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btConnect_master :
                Intent intent = new Intent(ConnectActivity.this,GameActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btConnect_find :
                break;
        }
    }
}
