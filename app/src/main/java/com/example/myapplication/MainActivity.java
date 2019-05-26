package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

//    //オブジェクト
//    private Button   btnSend;
//    private TextView textInput;
//    private TextView textOutput;

    EditText inputMessage;
    Button sendMessage;
    LinearLayout messageLog;
//    TextView UserMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //レイアウト読み込み
        setContentView(R.layout.activity_main);

        //オブジェクト取得
//        btnSend    = findViewById(R.id.btnSend);
//        textInput  = findViewById(R.id.textInput);
//        textOutput = findViewById(R.id.textOutput);

        inputMessage=(EditText)findViewById(R.id.input_message);
        sendMessage=(Button) findViewById(R.id.send_message);
        messageLog=(LinearLayout) findViewById(R.id.message_log);
//        UserMessage=(TextView) findViewById(R.id.user_message);
        sendMessage.setOnClickListener(this);

//        sendMessage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                //テキスト取得
//                //CharSequence text = textInput.getText();
//                String text = inputMessage.getText().toString();
//
//                //テキスト設定
////                UserMessage.setText(text);
//                TextView UserMessage = new TextView(this);
//                messageLog.addView(new );
//            }
//        });

//
//        /////////////////////////////////////////////////////////////////////
//        //  リスナ
//        /////////////////////////////////////////////////////////////////////
//
//        //ボタン
//        btnSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                //テキスト取得
//                //CharSequence text = textInput.getText();
//                String text = textInput.getText().toString();
//
//                //テキスト設定
//                textOutput.setText(text);
//            }
//        });
    }

    Button removeButton=null;
    int allMessage=0;
    @Override
    public void onClick(View v) {
        if(v.equals(sendMessage)){
            String text = inputMessage.getText().toString();
//        UserMessage.setText(text);
            TextView UserMessage = new TextView(this);
            UserMessage.setText(text);
            UserMessage.setTag(allMessage);
            messageLog.addView(UserMessage,0);
            UserMessage.setGravity(Gravity.START);

            Button removeButton = new Button(this);
            removeButton.setOnClickListener(this);
            this.removeButton=removeButton;
            removeButton.setTag(allMessage);
            messageLog.addView(removeButton);
            allMessage++;
        }else if(v.equals(removeButton)){
//            messageLog.removeView(v.getTag().toString());
        }
    }
}
