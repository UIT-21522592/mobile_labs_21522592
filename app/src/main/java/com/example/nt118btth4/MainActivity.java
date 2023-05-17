package com.example.nt118btth4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    FirebaseFirestore firestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firestore = FirebaseFirestore.getInstance();
        //Thong tin duoc kiem duyt thi cho vao day
        Map<String,Object> user = new HashMap<>();
        user.put("Fullname",);
        user.put("Phone",);
        user.put("Username",);
        user.put("Password",);
    }
}