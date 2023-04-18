package com.example.btth02;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.btth02.databinding.ActivityMainBinding;
import android.widget.EditText;
import android.widget.Button;
import android.util.Log;

import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;





public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    protected Button myBtn;
    public EditText e1, e2;
    TextView t1;
    String nam;
    int num1;

    public boolean getNumber(){
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.inputLuong);
        t1 = (TextView) findViewById(R.id.result);

        String s1 = e1.getText().toString();

        String s2 = e2.getText().toString();

        if(s1.equals("Hay nhap vao") && s2.equals(null)){
            String result = "Hay nhap vao Gross Salary";
            e2.setText(result);
            return false;
        }
        if(s1.equals(null) && s2.equals("Hay nhap vao")){
            String result = "Hay nhap ten vao";
            e1.setText(result);
            return false;
        }
        if(s1.equals("Hay nhap vao") || s2.equals("Hay nhap vao")){
            return false;
        }

        if((!s1.equals(null) && s2.equals(null)) || (!s1.equals("") && s2.equals(""))){
            String result = "Hay nhap luong vao";
            e2.setText(result);
            return false;
        }

        if( (s1.equals(null) && s2.equals(null) ) || (!s1.equals("") && s2.equals("") ) ){
            String result = "Hay nhao luong ";
            e2.setText(result);
            return false;
        }

        if((s1.equals(null) && s2.equals(null)) || (!s1.equals("") && !s2.equals("")) ){
            String result1 = "Hay nhap ten vao";
            e1.setText(result1);
            String result2 = "Hay nhap luong vao";
            e2.setText(result2);
            return false;
        }
        else{
            // Converting string to int
            num1 = Integer.parseInt(s2);
        }

        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.num1);

        e2 = (EditText) findViewById(R.id.inputLuong);

        myBtn = findViewById(R.id.cal);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = e1.getText().toString();
                int number = Integer.parseInt(e2.getText().toString());
                Employee tmp = new Employee(text, number);
                tmp.calSalary();
            }
        });
    }
}




