package jp.suntech.s21022.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_view = findViewById(R.id.bt_view);
        CustomerListener eye = new CustomerListener();
        bt_view.setOnClickListener(eye);
        
        Button bt_l_clear = findViewById(R.id.bt_liveclear);
        bt_l_clear.setOnClickListener(eye);

        Button bt_n_clear = findViewById(R.id.bt_nameclear);
        bt_n_clear.setOnClickListener(eye);
    }
    
    private class CustomerListener implements View.OnClickListener{
            

        @Override
        public void onClick(View view) {
            EditText inName = findViewById(R.id.putName);
            EditText inLive = findViewById(R.id.putLive);
            TextView out = findViewById(R.id.tvOutput);

            int id = view.getId();
            switch (id){
                case R.id.bt_view:  //表示
                    String inNameStr = inName.getText().toString();
                    String inLiveStr = inLive.getText().toString();
                    out.setText(inNameStr + "にお住いの" + inLiveStr + "さん、こんにちは！」");
                    
            }
        }
    }
}