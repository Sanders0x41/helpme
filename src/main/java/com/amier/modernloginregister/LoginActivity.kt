package com.amier.modernloginregister


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnRegLogin.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }

    }

    fun toastMe(view: View) {
        val username = findViewById<EditText>(R.id.LoginEdit)
        val username_text: String = username.text.toString()
        val username_text_lower: String = username_text.toLowerCase()
        val password = findViewById<EditText>(R.id.PasswordEdit)
        val password_text: String = password.text.toString()
        val password_text_lower: String = password_text.toLowerCase()
        if (username_text_lower == "sergey_sanders") {
            if (password_text == "123") {
                val myToast =
                    Toast.makeText(this, "Sergey Sanders добро пожаловать !", Toast.LENGTH_SHORT)
                myToast.show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }
            if (password_text != "123") {
                val myToast =
                    Toast.makeText(this, "Пожалуйста повторите попытку.", Toast.LENGTH_SHORT)
                myToast.show()
            }
        }
        if (username_text_lower == "rayn_fire") {
            if (password_text == "123") {
                val myToast =
                    Toast.makeText(this, "Rayn Fire добро пожаловать !", Toast.LENGTH_SHORT)
                myToast.show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            if (password_text != "123") {
                val myToast =
                    Toast.makeText(this, "Пожалуйста повторите попытку.", Toast.LENGTH_SHORT)
                myToast.show()
            }
        }
        if (username_text_lower == "admin") {
            if (password_text_lower == "admin") {
                val myToast = Toast.makeText(this, "Admin добро пожаловать !", Toast.LENGTH_SHORT)
                myToast.show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            if (password_text_lower != "admin") {
                val myToast = Toast.makeText(this, "Пожалуйста повторите попытку.", Toast.LENGTH_SHORT)
                myToast.show()
            }
        }
    }
}