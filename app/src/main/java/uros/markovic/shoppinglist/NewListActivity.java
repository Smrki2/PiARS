package uros.markovic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class NewListActivity extends AppCompatActivity implements View.OnClickListener {
    EditText unosnaslov;
    TextView ispisnaslov;
    Bundle bundle;
    RadioGroup radiogroup1;
    RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_list);
        unosnaslov=findViewById(R.id.edittext6);
        ispisnaslov=findViewById(R.id.textview7);
        bundle=getIntent().getExtras();
        radiogroup1=findViewById(R.id.radiogroup1);
        rb1=findViewById(R.id.radiobutton11);
        rb2=findViewById(R.id.radiobutton12);
        Button buttonok=findViewById(R.id.button7);
        buttonok.setOnClickListener(this);
        Button buttonsave=findViewById(R.id.button8);
        buttonsave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button7)
        {
            ispisnaslov.setText(unosnaslov.getText().toString());
            unosnaslov.getText().clear();
        }
        if(view.getId()==R.id.button8)
        {
            if(rb1.isChecked() || rb2.isChecked())
            {
                Intent intent = new Intent(NewListActivity.this, WelcomeActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Please select if you want your list shared or not.",Toast.LENGTH_SHORT).show();
            }
        }
    }

}