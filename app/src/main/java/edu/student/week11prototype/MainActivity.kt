package edu.student.week11prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var txtNum1 = findViewById<EditText>(R.id.txtNum1)
       var txtNum2 = findViewById<EditText>(R.id.txtNum2)
       var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnSubtract = findViewById<Button>(R.id.btnSubtract)
        var btnMulitply = findViewById<Button>(R.id.btnMultiply)
        var btnDivide = findViewById<Button>(R.id.btnDivide)
        val txtResults = findViewById<TextView>(R.id.txtResults)

        btnAdd.setOnClickListener{
            val n1: Int = txtNum1.text.toString().toInt()
            val n2: Int = txtNum1.text.toString().toInt()
            val addition: Int = addition(n1, n2)
            txtResults.text = "The sum is ${addition}"
            txtNum1.setText("")
            txtNum2.setText("")
            txtNum1.requestFocus()
            hideKeyboard()

        btnSubtract.setOnClickListener{
                val n1: Int = txtNum1.text.toString().toInt()
                val n2: Int = txtNum1.text.toString().toInt()
                val subtract: Int = addition(n1, n2)
                txtResults.text = "The subtraction is ${subtract}"
                txtNum1.setText("")
                txtNum2.setText("")
                txtNum1.requestFocus()
                hideKeyboard()

        btnMultiply.setOnClickListener{
                val n1: Int = txtNum1.text.toString().toInt()
                val n2: Int = txtNum1.text.toString().toInt()
                val multiply: Int = addition(n1, n2)
                txtResults.text = "The sum is ${multiply}"
                txtNum1.setText("")
                txtNum2.setText("")
                txtNum1.requestFocus()
                hideKeyboard()


        }
        findViewById<View>(android.R.id.content).setOnTouchListener {_, event -> hideKeyboard()
        false}
    }
}

fun addition(a: Int, b: Int): Int {
    return a + b
}
    fun subtract(a:Int, b: Int): Int {
    return a - b
    }
}

fun hideKeyboard() {
    try {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(currentFocus!!.windowToken,0)
    } catch (e:Exception) {

    }
}
