package id.ac.polbeng.sucizulianaf.androidkotlinapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.Button
import android.widget.TextView
import id.ac.polbeng.sucizulianaf.androidkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        binding.tvCounter.text = "1"

    }
    fun addNumber(v: View){
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        binding.tvCounter.text = nextVal.toString()
    }

    fun subtractNumber(v: View){
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        binding.tvCounter.text = nextVal.toString()
    }

    fun resetNumber(v: View){
        binding.tvCounter.text = "0"
    }
}