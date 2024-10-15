package br.com.appforge.workshop

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.com.appforge.workshop.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    /*
    //App vs Web
    //Notificação (offline e online)
    //Camera, Sensor (acelerometro, microfone, luz, gps, bussola)

    //Nativo (Android é Kotlin, iOS Swift)
    //-> Recursos avançados de sensores e camera
    //->Nivel SO -> maior controle de Ciclo de vida Activity

    //Hibrido (RN, Flutter, Kotlin Multiplatform)
    //->Android, iOS, Desktop, Navegador e etc
    //->Aproveitar o mesmo iOs e Android
    //->Notificação, consumo de api, visual


     */

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    /*
    //Instanciando por componentes
    private lateinit var textResult : TextView
    private lateinit var btnSearch : Button
    private lateinit var imageResult : ImageView
    private lateinit var editCep : EditText
     */

    private var isVisible = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        /*
        //Inicializando os componentes
        textResult = findViewById(R.id.textResult)
        btnSearch = findViewById(R.id.btnSearch)
        imageResult = findViewById(R.id.imageResult)
        editCep = findViewById(R.id.editCep)
         */

        binding.btnSearch.setOnClickListener {
            navigateToDetails()
            //toggleImageResultVisibility()
        }
    }

    fun navigateToDetails(){
        val intent = Intent(this,DetalhesActivity::class.java)
        startActivity(intent)
    }

    fun toggleImageResultVisibility(){
        isVisible = !isVisible
        //TODO 1 -  Resolver esse bug
        if(isVisible){
            binding.imageResult.visibility = View.VISIBLE
        }else{
            binding.imageResult.visibility = View.GONE
        }
        //TODO 2 - Implementar nova função
        Log.i("log_api", "Toggle Image: $isVisible")
    }
}