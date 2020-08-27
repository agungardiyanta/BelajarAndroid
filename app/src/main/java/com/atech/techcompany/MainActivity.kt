package com.atech.techcompany
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rvtech: RecyclerView
    private var list: ArrayList<TechComp> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvtech = findViewById(R.id.tech_comp)
        rvtech.setHasFixedSize(true)
        list.addAll(TechData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvtech.layoutManager = LinearLayoutManager(this)
        val listTechAdapter = ListTechAdapter(list)
        rvtech.adapter = listTechAdapter

        listTechAdapter.setOnItemClickCallback(object : ListTechAdapter.OnItemClickCallback{
            override fun onItemClicked(data: TechComp) {
                showSelectedList(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_utama_new, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.main_menu -> {
                val intentAbout = Intent(this@MainActivity,AboutActivity::class.java)
                startActivity(intentAbout)
            }
        }
    }
    private fun showSelectedList(tech:TechComp){
        val dataName = tech.name
        val dataDetail = tech.detail
        val dataImg=tech.icons
        val dataCeo = tech.ceotech
        val dataWeb = tech.webtech

        val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)

        moveIntent.putExtra(DetailActivity.EXTRA_NAME,dataName)
        moveIntent.putExtra(DetailActivity.EXTRA_DETAIL,dataDetail)
        moveIntent.putExtra(DetailActivity.EXTRA_IMG,dataImg)
        moveIntent.putExtra(DetailActivity.EXTRA_CEO,dataCeo)
        moveIntent.putExtra(DetailActivity.EXTRA_WEB,dataWeb)
        startActivity(moveIntent)

    }

}