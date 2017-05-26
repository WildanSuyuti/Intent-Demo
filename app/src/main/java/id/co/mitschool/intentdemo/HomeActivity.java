package id.co.mitschool.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    public final int REQUEST_CODE = 1;
    public static final int RESULT_CODE = 5;
    private TextView tvHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvHome = (TextView) findViewById(R.id.tv_home);
    }

    public void goMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_CODE) {
                User user = data.getParcelableExtra(MainActivity.KEY_USER);
                tvHome.setText(user.info());
            }
        }
    }
}
