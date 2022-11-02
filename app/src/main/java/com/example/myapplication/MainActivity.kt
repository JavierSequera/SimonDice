package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity(), Comunicador{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var ListaMáquina: MutableList<Int> = mutableListOf()
    var ListaJugador: MutableList<Int> = mutableListOf()

    override fun realizarSecuenciaMaquina() {

        var randomGenerator = Random(System.currentTimeMillis())

        var botonEmpezar: Button = findViewById(R.id.botonEmpezar)
        var textPrueba: TextView = findViewById(R.id.textoPrueba)
        //botonEmpezar.isClickable = false

        var numAleatorio = randomGenerator.nextInt(1, 5)
        ListaMáquina.add(numAleatorio)

        cambiarColorMaquina()
    }

    override fun cambiarColorMaquina() {
        var botonRojo: ImageButton = findViewById(R.id.botonRojo)
        var botonAmarillo: ImageButton = findViewById(R.id.botonAmarillo)
        var botonAzul: ImageButton = findViewById(R.id.botonAzul)
        var botonVerde: ImageButton = findViewById(R.id.botonVerde)

        var i = 0



        while (i < ListaMáquina.size){
            when(ListaMáquina[i]) {
                1 -> botonRojo.setBackgroundResource(R.drawable.shape_boton1claro)
                2 -> botonAmarillo.setBackgroundResource(R.drawable.shape_boton2claro)
                3 -> botonAzul.setBackgroundResource(R.drawable.shape_boton3claro)
                4 -> botonVerde.setBackgroundResource(R.drawable.shape_boton4claro)
            }
            i++
        }




    }

    override fun secuenciaJugador() {
        TODO("Not yet implemented")
    }

    override fun comprobador() {
        TODO("Not yet implemented")
    }

    override fun pasarSiguienteRonda() {
        TODO("Not yet implemented")
    }
}