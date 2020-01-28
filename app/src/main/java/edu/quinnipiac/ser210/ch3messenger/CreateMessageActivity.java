package edu.quinnipiac.ser210.ch3messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    //Call onSendMessage() when the button is clicked
    public void onSendMessage(View view) {

        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        //Intent specifies the activity you want to receive from (address to)
          Intent intent = new Intent(this, ReceiveMessageActivity.class); //parameters: from, then where want it to go
          intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);

        //*Allows choice of how to send the message
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT, messageText);

        //** get the chooser title
//        String chooserTitle = getString(R.string.chooser);
//        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);

        //starts the activity from the 2nd parameter above recievemesac
         startActivity(intent);

        //*starts activity that user selects
        //startActivity(chosenIntent);

    }
}
