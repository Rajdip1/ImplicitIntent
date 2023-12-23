package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.cardview.widget.CardView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.implicitintent.ui.theme.ImplicitIntentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webButton = findViewById<CardView>(R.id.cardWeb)
        val cameraButton = findViewById<CardView>(R.id.cardCamera)
        val callCard = findViewById<CardView>(R.id.callApp)
        val instagramCard = findViewById<CardView>(R.id.instagram)
        val youtubeButton = findViewById<CardView>(R.id.youTube)
        val linkedinButton = findViewById<CardView>(R.id.linkedin)

        webButton.setOnClickListener{
            // redirect to another application by clicking on card button and opens chrome app
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://en.wikipedia.org/wiki/Jalaram_Bapa")
            startActivity(intent)
        }

        cameraButton.setOnClickListener {
            // opens camera app of your phone
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        callCard.setOnClickListener {
            //redirect to your phones's call log app
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("+919924298988")
            startActivity(intent)
        }

        instagramCard.setOnClickListener {
            //redirect to instagram app
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com/")
            startActivity(intent)
        }

        youtubeButton.setOnClickListener {
            //redirect to youtube app
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/")
            startActivity(intent)
        }

        linkedinButton.setOnClickListener {
            //redirect to linkedin app
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/feed/")
            startActivity(intent)
        }
    }
}

