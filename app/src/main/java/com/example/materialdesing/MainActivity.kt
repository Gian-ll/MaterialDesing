package com.example.materialdesing

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miBoton: MaterialButton = findViewById(R.id.mi_boton)
        val fabAdd: FloatingActionButton = findViewById(R.id.fab_add)
        val textInputEditText: TextInputEditText = findViewById(R.id.text_input_edit_text)

        miBoton.setOnClickListener {
            val nombre = textInputEditText.text.toString()
            Toast.makeText(this, "Hola,$nombre", Toast.LENGTH_SHORT).show()
        }
        fabAdd.setOnClickListener {
            Toast.makeText(this, "Acción Principal Ejecutada", Toast.LENGTH_SHORT).show()
        }
    }
}