package mx.edu.ittepic.tdm_u1_reva_practica

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var btnSD : Button ?= null
    var btn : Button ?= null
    var nombre : EditText ?= null
    var telefono : EditText ?= null
    var medico : EditText ?= null
    var HC : EditText ?= null
    var FC : EditText ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSD = findViewById(R.id.btnSD)
        btn = findViewById(R.id.btn)
        nombre = findViewById(R.id.nombre)
        telefono = findViewById(R.id.telefono)
        medico = findViewById(R.id.medico)
        HC = findViewById(R.id.HC)
        FC = findViewById(R.id.FC)

        val registro = nombre?.text.toString()+telefono?.text.toString()+medico?.text.toString()+HC?.text.toString()+FC?.text.toString()


        btnSD?.setOnClickListener(){
            try {
                val file = File("Registro.txt")
                val osw = OutputStreamWriter(FileOutputStream(file))
                osw.write(registro)
                osw.flush()
                osw.close()
                Toast.makeText(this, "Los datos fueron grabados correctamente", Toast.LENGTH_SHORT).show()
                nombre?.setText("")
                telefono?.setText("")
                medico?.setText("")
                HC?.setText("")
                FC?.setText("")
            } catch (ioe: IOException) {
                Toast.makeText(this, "No se pudo grabar1", Toast.LENGTH_SHORT).show()
            }
        }
        btn?.setOnClickListener(){
            try {
                val file = File(Environment.getDataDirectory(),"Registro.txt")
                val osw = OutputStreamWriter(FileOutputStream(file))
                osw.write(registro)
                osw.flush()
                osw.close()
                Toast.makeText(this, "Los datos fueron grabados correctamente", Toast.LENGTH_SHORT).show()
                nombre?.setText("")
                telefono?.setText("")
                medico?.setText("")
                HC?.setText("")
                FC?.setText("")
            } catch (ioe: IOException) {
                Toast.makeText(this, "No se pudo grabar1", Toast.LENGTH_SHORT).show()
            }
        }
        }


    }



