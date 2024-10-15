package br.com.appforge.workshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.appforge.workshop.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {


    private val binding by lazy{
        ActivityDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}