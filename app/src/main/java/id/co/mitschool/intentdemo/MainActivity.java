package id.co.mitschool.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private EditText etAddress;
    public static final String KEY_NAME = "name";
    public static final String KEY_ADDRESS = "address";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.et_name);
        etAddress = (EditText) findViewById(R.id.et_addrress);
    }

    public void submit(View view) {
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        User user = new User();
        user.setName(etName.getText().toString());
        user.setAddress(etAddress.getText().toString());
        intent.putExtra(KEY_NAME, etName.getText().toString());
        intent.putExtra(KEY_ADDRESS, etAddress.getText().toString());
        startActivity(intent);
    }
}
