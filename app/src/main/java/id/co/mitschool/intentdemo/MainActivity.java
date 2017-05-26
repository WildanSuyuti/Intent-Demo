package id.co.mitschool.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private EditText etAddress;
    public static final String KEY_USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.et_name);
        etAddress = (EditText) findViewById(R.id.et_addrress);
    }

    public void submit(View view) {
        User user = new User();
        user.setName(etName.getText().toString());
        user.setAddress(etAddress.getText().toString());
        user.setEmail("em.wildan.es@gmail.com");
        user.setGender("Laki-laki");

        Intent intent = new Intent();
        setResult(HomeActivity.RESULT_CODE, intent);
        intent.putExtra(KEY_USER, user);
        finish();
    }
}
