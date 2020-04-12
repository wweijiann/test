package com.example.test

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.ActionCodeSettings
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {
//Login


    //Database
//    lateinit var editTextName: EditText
//    lateinit var buttonSave: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




//        editTextName = findViewById(R.id.editTextName)
//        buttonSave = findViewById(R.id.buttonSave)
//        buttonSave.setOnClickListener{
//            saveCustomer()
//        }
        return
    }






//    private fun saveCustomer(){
//        val name = editTextName.text.toString().trim()
//
//        if(name.isEmpty()){
//            editTextName.error = "Please enter your name"
//            return
//        }
//
//
//        val ref = FirebaseDatabase.getInstance().getReference("Admin")
//
//        val customerID = ref.push().key
//
//        val customer = Customer(customerID.toString(), name)
//        ref.child(customerID.toString()).setValue(customer).addOnCompleteListener{
//            Toast.makeText(applicationContext, "Customer save successfully", Toast.LENGTH_LONG).show()
//
//        }
//    }
}
