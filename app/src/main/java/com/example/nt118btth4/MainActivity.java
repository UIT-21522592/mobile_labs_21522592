package com.example.nt118btth4;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    public EditText e1,e2,e3,e4;
    User User = new User();
    String in[]={null,null,null,null};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.fullname);
        e2 = (EditText) findViewById(R.id.phonenumber);
        e3 = (EditText) findViewById(R.id.username);
        e4 = (EditText) findViewById(R.id.password);

        in[0] = e1.getText().toString();
        in[1] = e2.getText().toString();
        in[2] = e3.getText().toString();
        in[3] = e4.getText().toString();

        User.checkValidationUserName(in[2]);
        User.checkValidPhoneNumber(in[1]);
        User.checkValidationPassword(in[3]);

        User.setUserFullName(in[0]);
        User.setPhoneNumber(in[1]);
        User.setUserName(in[2]);
        User.setUserPassword(in[3]);

        Button clickButton = (Button) findViewById(R.id.button);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Map<String, Object> user = new HashMap<>();
                user.put("Fullname", User.getUserFullName());
                user.put("Phonenumber", User.getPhoneNumber());
                user.put("Username", User.getUserName());
                user.put("Password", User.getUserPassword());

                // Add a new document with a generated ID
                db.collection("Khach Hang")
                        .add(user)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error adding document", e);
                            }
                        });
            }
        });


    }
}