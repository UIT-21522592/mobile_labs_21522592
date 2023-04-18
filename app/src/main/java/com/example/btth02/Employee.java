package com.example.btth02;

import android.util.Log;
import android.widget.EditText;
import android.text.Editable;
import java.util.*;

public class Employee {
            int dependentCost = 11000000;
            private String name;
            private int salary;


            public Employee(){
                this.name = "default";
                this.salary = 0;
            }

            public Employee(String a,int b){
                this.name = a;
                this.salary =b;
            }
            String getName(){
                return this.name;
            }
            public int getSalary(){
                return this.salary;
            }

            public void calSalary(){
                double tmp = this.getSalary()*(1-0.05);
                if(tmp <= this.dependentCost) {
                    Log.d("PersonalSalary", this.getName() + Integer.toString((int) tmp));
                }
                    Log.d("Personal",this.getName() + Integer.toString((int) (this.dependentCost + (tmp - this.dependentCost)*(1 - 0.05))));
            }

            void printOut(){
                System.out.println("");
            }
}
