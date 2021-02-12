package com.ryanhtechlabs.markconverter

/* Copyright 2021 Ryanhtech Labs

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var nextButton: Button  // Define a "lateinit" variable, which will be global. The code down below changes this variable to
    //                                          the button named next. The thing with lateinit variables, is that they will be global in all the class
    //                                          or function you defined them in, even if you actually initialize it in another function.
    //                                          More info in the official Kotlin documentation:
    //                                            [https://kotlinlang.org/docs/whatsnew12.html#lateinit-top-level-properties-and-local-variables]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Set the content view to the file /app/src/main/res/layout/activity_main.xml
        //                           ^-----------------<--------------<-------------<---------------<---------------^
        nextButton = findViewById(R.id.next)  // Get the button next from the layout
        nextButton.setOnClickListener {
            startActivity(Intent(this, WizardActivity::class.java))  // Create a new Intent to the WizardActivity and start it
        }
    }
}