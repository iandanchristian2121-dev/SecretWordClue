package com.dan.secretwordclue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val title = TextView(this)
        title.text = "Secret Word Clue\n\nSTART GAME\n\n⚙ SETTINGS"
        title.textSize = 28f
        setContentView(title)
    }
}
