package com.example.myapplication

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
import android.widget.TextView
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var canAddOperation = false

    private var canAddDecimal = true

    private lateinit var btn_1: Button
    private lateinit var btn_2: Button
    private lateinit var btn_3: Button
    private lateinit var btn_4: Button
    private lateinit var btn_5: Button
    private lateinit var btn_6: Button
    private lateinit var btn_7: Button
    private lateinit var btn_8: Button
    private lateinit var btn_9: Button
    private lateinit var btn_0: Button

    private lateinit var btn_Clear: Button
    private lateinit var btn_hapus: Button
    private lateinit var btn_Persen: Button
    private lateinit var btn_bagi: Button
    private lateinit var btn_kali: Button
    private lateinit var btn_kurang: Button
    private lateinit var btn_plus: Button
    private lateinit var btn_hasil: Button
    private lateinit var btn_minus: Button
    private lateinit var btn_koma: Button
    private var data = ""

    val text1 = findViewById<TextView>(R.id.text1)
    val text2 = findViewById<TextView>(R.id.text2)
    val length = text1.length()

    fun evaluateMathExpression(data: String): String {
        try {
            val exp = ExpressionBuilder(data).build()
            val result = exp.evaluate()
            return result.toString()
        } catch (e: Exception) {
            return "Error"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btn_0 = findViewById(R.id.btn_0)
        btn_1 = findViewById(R.id.btn_1)
        btn_2 = findViewById(R.id.btn_2)
        btn_3 = findViewById(R.id.btn_3)
        btn_4 = findViewById(R.id.btn_4)
        btn_5 = findViewById(R.id.btn_5)
        btn_6 = findViewById(R.id.btn_6)
        btn_7 = findViewById(R.id.btn_7)
        btn_8 = findViewById(R.id.btn_8)
        btn_9 = findViewById(R.id.btn_9)

        btn_Clear = findViewById(R.id.btn_Clear)
        btn_hapus = findViewById(R.id.btn_hapus)
        btn_Persen = findViewById(R.id.btn_Persen)
        btn_bagi = findViewById(R.id.btn_bagi)
        btn_kali = findViewById(R.id.btn_kali)
        btn_kurang = findViewById(R.id.btn_kurang)
        btn_plus = findViewById(R.id.btn_plus)
        btn_hasil = findViewById(R.id.btn_hasil)
        btn_minus = findViewById(R.id.btn_minus)
        btn_koma = findViewById(R.id.btn_koma)

        btn_0.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "0"
        }

        btn_1.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "1"
        }

        btn_2.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "2"
        }

        btn_3.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "3"
        }

        btn_4.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "4"
        }

        btn_5.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "5"
        }
        btn_6.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "6"
        }

        btn_7.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "7"
        }
        btn_8.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "8"
        }

        btn_9.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "9"
        }

        btn_Clear.setOnClickListener {
            text1.text = ""
            text2.text = ""
        }
        btn_koma.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + ","
        }
        btn_plus.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "+"
        }
        btn_kurang.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "-"
        }
        btn_minus.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "-"
        }
        btn_Persen.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "%"
        }
        btn_kali.setOnClickListener {
            data = text1.text.toString()
            text1.text = data + "×"
        }
        btn_hapus.setOnClickListener {
            data = text1.text.toString()
            text1.text = data.drop(-1)
        }
        btn_hasil.setOnClickListener {
            data = text1.text.toString()

            data = data.replace("×", "*")
            data = data.replace("%", "/100")
            data = data.replace("÷", "/")
            data = data.replace(",", ".")


            val hasil = evaluateMathExpression(data)
            text2.text = hasil

        }


    }
}
