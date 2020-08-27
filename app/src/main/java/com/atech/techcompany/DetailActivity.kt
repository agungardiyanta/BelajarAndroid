package com.atech.techcompany

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar


class DetailActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName : TextView = findViewById(R.id.tv_item_name)
        val tvDetail : TextView = findViewById(R.id.tv_item_detail)
        val tvImg : ImageView = findViewById(R.id.img_item_photo)
        val tvCeo : TextView = findViewById(R.id.tv_CEO)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val img = intent.getIntExtra(EXTRA_IMG, 0)
        val ceo = intent.getStringExtra(EXTRA_CEO)


        tvName.text=name
        tvDetail.text=detail
        tvImg.setImageResource(img)
        tvCeo.text= ceo

        val btnCheckWeb : Button = findViewById(R.id.tv_website)
        btnCheckWeb.setOnClickListener(this)

        setActionBarTitle(name)
    }
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val  EXTRA_IMG = "extra_image"
        const val EXTRA_CEO = "CEO"
        const val EXTRA_WEB = "WEB"
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.tv_website ->{
                val webs = intent.getStringExtra(EXTRA_WEB)
                val checkWebsIntent = Intent(Intent.ACTION_VIEW, Uri.parse(webs))
                startActivity(checkWebsIntent)
            }
        }
    }

}

