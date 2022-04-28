package com.demo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.kotlin01.R
import java.io.BufferedReader
import java.io.File
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val result = readAsset("i have a dream.txt").run {
            contains("great")
        }
        println(result)
    }

//    fun  readFile() {
//        try {
//            val inputStream: InputStream = assets.open("/i have a dream.txt")
//            val size: Int = inputStream.available()
//            val buffer = ByteArray(size)
//            inputStream.read(buffer)
//            string = String(buffer)
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
//    }
//
//    fun readFile2() {
//        var file = File("../txt/i have a dream.txt")
//        val result = file.run {
//            readText().contains("great")
//        }
//        println(result)
//    }

//    private fun readAsset(fileName: String): String {
//        return assets
//            .open(fileName)
//            .bufferedReader()
//            .use(BufferedReader::readText)
//    }

    val readAsset = {fileName:String ->
        assets
            .open(fileName)
            .bufferedReader()
            .use(BufferedReader::readText)
    }
}