package br.com.claudio.myappexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.claudio.libraryutils.Example

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Nome Lib: ${Example.getName()}")
        println("Resultado: ${Example.sum(1, 10)}")
    }
}