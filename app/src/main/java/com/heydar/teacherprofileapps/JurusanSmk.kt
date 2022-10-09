package com.heydar.teacherprofileapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class JurusanSmk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jurusan_smk)

        val btnTo = findViewById<Button>(R.id.btnTo)
        val btnTpfl = findViewById<Button>(R.id.btnTpfl)
        val btnPplg = findViewById<Button>(R.id.btnPplg)
        val btnKuliner = findViewById<Button>(R.id.btnKuliner)
        val btnBusana = findViewById<Button>(R.id.btnBusana)

        var fragment : Fragment = visimisi()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()

        btnTo.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, OtomotifFragment())
            fragmentpindah.commit()
        }
        btnTpfl.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, PengelasanFragment())
            fragmentpindah.commit()
        }
        btnPplg.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, PplgFragment())
            fragmentpindah.commit()
        }
        btnKuliner.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, KulinerFragment())
            fragmentpindah.commit()
        }
        btnBusana.setOnClickListener {
            val fragmentpindah = supportFragmentManager.beginTransaction()
            fragmentpindah.replace(R.id.fragmentContainer, BusanaFragment())
            fragmentpindah.commit()
        }
    }
}