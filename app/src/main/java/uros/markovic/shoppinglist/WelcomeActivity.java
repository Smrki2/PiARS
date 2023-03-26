package uros.markovic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        bundle=getIntent().getExtras();
        TextView textview1=findViewById(R.id.textview5);
        textview1.setText(bundle.getString("username", "lel"));
        Button button1=findViewById(R.id.button5);
        Button button2=findViewById(R.id.button6);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button5)
        {
            AlertDialog.Builder builder1=new AlertDialog.Builder(this).setTitle("New List Dialog").setMessage("Are you sure you want to create new list?");
            builder1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent=new Intent(WelcomeActivity.this,NewListActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder1.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            AlertDialog alert=builder1.create();
            alert.show();
        }
    }
}