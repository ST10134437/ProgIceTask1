package vcmsa.projects.firebasics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnRegisterPage: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etEmail= findViewById(R.id.etEmail)
        etPassword= findViewById(R.id.etPassword)
        btnRegisterPage= findViewById(R.id.btnRegisterPage)
        btnLogin= findViewById(R.id.btnLogin)

        btnRegisterPage.setOnClickListener {
            //Value 1 declared as intent, needs a from and tom is always this, to is the destination
            val i = Intent(this, Login::class.java)
            //starts the intent
            startActivity(i)
        }

    }
}