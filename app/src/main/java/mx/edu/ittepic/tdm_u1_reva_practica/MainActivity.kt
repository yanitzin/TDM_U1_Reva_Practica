package mx.edu.ittepic.tdm_u1_reva_practica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.io.File

class MainActivity : AppCompatActivity() {
    var btn : Button ?= null
    var nombre : EditText ?= null
    var telefono : EditText ?= null
    var medico : EditText ?= null
    var HC : EditText ?= null
    var FC : EditText ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        nombre = findViewById(R.id.nombre)
        telefono = findViewById(R.id.telefono)
        medico = findViewById(R.id.medico)
        HC = findViewById(R.id.HC)
        FC = findViewById(R.id.FC)



        var registro = Array<String>


        btn?.setOnClickListener(){


        }

    }
}
