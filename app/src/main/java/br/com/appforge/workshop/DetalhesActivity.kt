package br.com.appforge.workshop

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.appforge.workshop.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {


    private val binding by lazy{
        ActivityDetalhesBinding.inflate(layoutInflater)
    }

    var texto: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}