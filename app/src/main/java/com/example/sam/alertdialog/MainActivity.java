package com.example.sam.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textshow;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnc,btne,btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textshow=(TextView)findViewById(R.id.textView);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btn0=(Button)findViewById(R.id.button11);
        btnc=(Button)findViewById(R.id.button10);
        btne=(Button)findViewById(R.id.button12);
        btnExit=(Button)findViewById(R.id.button13);

        btn1.setOnClickListener(myListener);
        btn2.setOnClickListener(myListener);
        btn3.setOnClickListener(myListener);
        btn4.setOnClickListener(myListener);
        btn5.setOnClickListener(myListener);
        btn6.setOnClickListener(myListener);
        btn7.setOnClickListener(myListener);
        btn8.setOnClickListener(myListener);
        btn9.setOnClickListener(myListener);
        btn0.setOnClickListener(myListener);
        btnc.setOnClickListener(myListener);
        btne.setOnClickListener(myListener);
        btnExit.setOnClickListener(myListener);
    }

    private Button.OnClickListener myListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            Button btn=(Button)findViewById(v.getId());
            if(btn.getText().toString().equals("C")){
                textshow.setText("");
            }else if(btn.getText().toString().equals("Enter")) {

                if (textshow.getText().toString().equals("123456789")) {
                    Toast toast = Toast.makeText(MainActivity.this, "密碼輸入正確", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "密碼輸入錯誤", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                textshow.setText("");
            }else if(btn.getText().toString().equals("Exit")){
                AlertDialog.Builder ee=new AlertDialog.Builder(MainActivity.this);
                ee.setTitle("確認視窗");
                ee.setIcon(R.mipmap.ic_launcher);
                ee.setMessage("確定要結束嗎?");
                ee.setPositiveButton("確定",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialoginterface,int i){
                        finish();
                    }
                });
                ee.setNegativeButton("取消",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialoginterface,int i){

                    }
                });
                ee.show();
            }else{
                textshow.setText(textshow.getText().toString()+btn.getText().toString());
            }

        }
    };
}
