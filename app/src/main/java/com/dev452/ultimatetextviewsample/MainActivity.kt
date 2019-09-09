package com.dev452.ultimatetextviewsample

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.dev452.ultimatetextview.UltimateTextView

/**
 * Created by Debojyoti Singha on 06,July,2019.
 */
class MainActivity : AppCompatActivity() {

    private var editextDemo: EditText? = null
    private var textviewDemo: UltimateTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

        editextDemo!!.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0!!.isNotEmpty()) {
                    textviewDemo!!.text = p0.toString()
                }
            }

        })
    }

    private fun initViews() {
        editextDemo = findViewById(R.id.editTextDemo)
        textviewDemo = findViewById(R.id.textViewDemo)
    }
}