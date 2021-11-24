package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        var s = getEvenChars("1234")
        println("s = $s")
        s = getEvenChars("12345")
        println("s = $s")
    }
}

//Функция для получения строки чётных символов из входной строки str
fun getEvenChars(str: String): String {
    val result = CharArray(str.length / 2) //Массив для записи чётных значений
    var i = 0; var j=0; //Счётчики символов входной строки и результирующего массива
    for (c in str) //Перебор всех символов str
        if (i++ and 1 == 1) //Если значение счётчика НЕчётное (т.к. нумерация с нуля, а не с 1)
            result[j++] = c //Записываем очередной символ в массив результата
    return String(result) //Создаём строку на основе массива результата и возвращаем её
}

