package com.atech.techcompany

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AboutActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnCheckemail: Button = findViewById(R.id.btn_email)
        btnCheckemail.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_email -> {
                val receipt = "agungardiyanta@gmail.com"
                try {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:$receipt"))
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject")
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text")
                    startActivity(intent)
                } catch (e: Exception) {
                    Toast.makeText(this, "Sorry...You don't have any mail app", Toast.LENGTH_SHORT)
                        .show()
                    e.printStackTrace()
                }
            }
        }
    }
}
