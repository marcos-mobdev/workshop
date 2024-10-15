package br.com.appforge.workshop

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.com.appforge.workshop.databinding.ActivityMainBinding
import br.com.appforge.workshop.models.Address
import br.com.appforge.workshop.services.RetrofitHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    /*
    //App vs Web
    //1 - Notificação (offline e online)
    //2 - Camera, Sensor (acelerometro, microfone, luz, gps, bussola, giroscopio)
    //3 - offline (com bd)
    //4 - Acesso a contatos, sms, configurações
    //5 - UX (animações, gestos)
    //6 - Segundo plano (música, localização, sincronizar dados)
    //7 - Ciclo de vida (quando sair, quando fechar, quando abrir o app)

    //Nativo (Android é Kotlin, iOS Swift)
    //-> Recursos avançados de sensores e camera, e otimizados
    //-> Aplicativos que requerem alta performance (jogos, edição de videos, RA)
    //-> Nivel SO -> maior controle de Ciclo de vida Activity

    //Hibrido (RN, Flutter, Kotlin Multiplatform)
    //-> Android, iOS, Desktop, Navegador e etc. Com o mesmo código
    //-> Ótima curva de aprendizado
    //-> Velocidade de desenvolvimento
    //-> Telas com mesmo design em multiplas plataformas
    //-> Notificação, consumo de api, visual
     */

    private val TAG = "info_viacep"

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val retrofit by lazy{
        RetrofitHelper.retrofitViacep
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
            //navigateToDetails()
            //toggleImageResultVisibility()
            CoroutineScope(Dispatchers.IO).launch {
                consultCepForAddress()
            }
        }
    }

    private suspend fun consultCepForAddress() {
        val text = binding.editCep.text.toString()
        var response: Response<Address>? = null
        try{
            response = retrofit.getAddress(text)
        }catch (e: Exception){
            e.printStackTrace()
            Log.e(TAG, "consultCepForAddress: ", )
        }
        if(response != null){
            if(response.isSuccessful){
                val body = response.body()
                val cep = body?.cep
                val street = body?.street
                val neighborhood = body?.neighborhood
                val city = body?.city

                withContext(Dispatchers.Main){
                    binding.textResult.text = "$cep\n$street\n$neighborhood\n$city"
                }

                //Log.i(TAG, "consultCepForAddress: $cep - $street - $neighborhood - $city")
            }else{
                Log.e(TAG, "Unsuccessful response: ${response.code()}", )
            }
        }else{
            Log.e(TAG, "Null response")
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