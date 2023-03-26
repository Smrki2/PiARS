package uros.markovic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.button1);
        Button b2=findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.button1)
        {
            this.findViewById(R.id.button1).setVisibility(View.INVISIBLE);
            this.findViewById(R.id.button2).setVisibility(View.INVISIBLE);
            BlankFragment1 fragment1=BlankFragment1.newInstance("login","login");
            getSupportFragmentManager().beginTransaction().add(R.id.fragment1,fragment1).commit();
        }
        if(view.getId()==R.id.button2)
        {
            this.findViewById(R.id.button1).setVisibility(View.INVISIBLE);
            this.findViewById(R.id.button2).setVisibility(View.INVISIBLE);
            BlankFragment2 fragment2=BlankFragment2.newInstance("register","register");
            getSupportFragmentManager().beginTransaction().add(R.id.fragment1,fragment2).commit();
        }
    }
}