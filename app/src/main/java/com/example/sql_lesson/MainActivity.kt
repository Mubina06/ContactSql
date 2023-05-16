package com.example.sql_lesson

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.sql_lesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val permission = android.Manifest.permission.CALL_PHONE
        val requestCode = 123 // Replace with an appropriate request code

        if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
            // Permission has not been granted, so request it
            ActivityCompat.requestPermissions(this, arrayOf(permission), requestCode)
        }

    }
}