package id.co.mitschool.intentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String name = getIntent().getStringExtra(MainActivity.KEY_NAME);
        String alamat = getIntent().getStringExtra(MainActivity.KEY_ADDRESS);
        TextView tvHome = (TextView) findViewById(R.id.tv_home);
        tvHome.setText("Selamat datang : " + name + " \n "
                + "saya tahu alamatmu di : " + alamat);
    }
}
