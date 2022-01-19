package com.example.aos_ui_practice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.button.ButtonActivity
import com.example.aos_ui_practice.checkbox.CheckBoxActivity
import com.example.aos_ui_practice.edittext.EditTextActivity
import com.example.aos_ui_practice.imageview.ImageViewActivity
import com.example.aos_ui_practice.layout.LinearLayoutActivity
import com.example.aos_ui_practice.textview.TextViewActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val btnLinearLayout = findViewById<Button>(R.id.btnLinearLayout)
        btnLinearLayout.setOnClickListener {
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }

        val btnTextView = findViewById<Button>(R.id.btnTextView)
        btnTextView.setOnClickListener {
            val intent = Intent(this, TextViewActivity::class.java)
            startActivity(intent)
        }

        val btnEditText = findViewById<Button>(R.id.btnEditText)
        btnEditText.setOnClickListener {
            val intent = Intent(this, EditTextActivity::class.java)
            startActivity(intent)
        }

        val btnButton = findViewById<Button>(R.id.btnButton)
        btnButton.setOnClickListener {
            val intent = Intent(this, ButtonActivity::class.java)
            startActivity(intent)
        }

        val btnImageView = findViewById<Button>(R.id.btnImageView)
        btnImageView.setOnClickListener {
            val intent = Intent(this, ImageViewActivity::class.java)
            startActivity(intent)
        }

        val btnCheckBox = findViewById<Button>(R.id.btnCheckBox)
        btnCheckBox.setOnClickListener {
            val intent = Intent(this, CheckBoxActivity::class.java)
            startActivity(intent)
        }




    }
}