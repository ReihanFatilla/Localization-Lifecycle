package com.reift.localizationlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.reift.localizationlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIntent.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            finish()
        }
        Toast.makeText(this, "onCreate Invoke", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart Invoke", Toast.LENGTH_SHORT).show()
    }

    // Saat Berpindah Activity

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause Invoke", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop Invoke", Toast.LENGTH_SHORT).show()
    }

    // Saat Activity di buka kembali saat keadaan onStop

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart Invoke", Toast.LENGTH_SHORT).show()
    }

    // Saat aplikasi di close

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy Invoke", Toast.LENGTH_SHORT).show()
    }
}