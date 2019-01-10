package com.example.urvish.inheritancedemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var listOfShape = mutableListOf<Shape>()
    val eps=1E-10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.circle).setOnClickListener({ v -> calculateArea(Circle()) })
        findViewById<Button>(R.id.square).setOnClickListener({ v -> calculateArea(Square()) })
        findViewById<Button>(R.id.rectangle).setOnClickListener({ v -> calculateArea(Rectangle()) })
        findViewById<Button>(R.id.nullcheck).setOnClickListener({ v -> calculateArea(null) })
        var user = User("Urvish", "Rana")
        Log.d("TAG", user.name)
        user.age = 100
        Log.d("TAG", user.age.toString())

        val urvish = Person("Urvish")
        urvish.age = 21
        urvish.sex = "Male"
        val oldUrvish = urvish.copy(age = 22)
        val (name, age, sex) = urvish
        Log.d("TAG", "name:$name sex:$sex age:$age")
        Log.d("TAG", oldUrvish.toString())


        val demo = Outer.Nested().function()
        Log.d("TAG", demo.toString())
        val demo1 = OuterClass().InnerClass().function()
        Log.d("TAG", demo1.toString())
        continuesAddition(i = *intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
        println(findFixPoint(10.0))

        val items=listOf(1,2,4,5,6,7)
        items.fold(10) { acc:Int, i:Int->
            println("acc=$acc")
            val result=acc*i
            print("result:$result")
            result
        }
    }
    tailrec fun findFixPoint(x: Double = 1.0): Double
            = if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
    //varagrs function
    fun continuesAddition(vararg i: Int) {
        var ans = 0;
        for (item in i) {
            ans = +item;
        }
        println("ans:$ans")
    }

    //extension functions
    fun Square.calculatePerimeter(sideLength: Float) = sideLength * 4

    fun Circle.calculatePerimeter(radius: Float) = 2 * 3.14 * radius
    fun Rectangle.calculatePerimeter(sideLength: Float, sideHeight: Float) = (2 * sideHeight) + (2 * sideLength)

    //usage of when
    private fun calculateArea(shape: Shape?) {
        var area = 0f
        when (shape) {
            is Circle -> {
                Toast.makeText(this, "Shape is type of Circle", Toast.LENGTH_LONG).show();
                shape.radius = 100f
                area = shape.calculateArea()
                listOfShape.add(shape)
                findViewById<TextView>(R.id.textview).append("Area of circle is" + area + "\n")
                findViewById<TextView>(R.id.textview).append("Perimeter of circle is" + shape.calculatePerimeter(shape.radius) + "\n")

            }
            is Square -> {
                Toast.makeText(this, "Shape is type of Square", Toast.LENGTH_LONG).show();
                shape.sideLength = 100f
                area = shape.calculateArea()
                listOfShape.add(shape)
                findViewById<TextView>(R.id.textview).append("Area of square is" + area + "\n")
                findViewById<TextView>(R.id.textview).append("Perimeter of square is" + shape.calculatePerimeter(shape.sideLength) + "\n")
            }
            is Rectangle -> {
                Toast.makeText(this, "Shape is type of Rectangle", Toast.LENGTH_LONG).show();
                shape.sideLength = 100f
                shape.sideHeight = 10f
                area = shape.calculateArea()
                listOfShape.add(shape)
                findViewById<TextView>(R.id.textview).append("Area of rectangle is" + area + "\n")
                findViewById<TextView>(R.id.textview).append("Perimeter of rectangle is" + shape.calculatePerimeter(shape.sideLength, shape.sideHeight) + "\n")

            }
            else -> {
                Toast.makeText(this, "Null", Toast.LENGTH_LONG).show()
                listOfShape.forEach {
                    when (it) {
                        is Circle -> findViewById<TextView>(R.id.textview).append("\nCircle Radius is" + it.radius)
                        is Square -> findViewById<TextView>(R.id.textview).append("\nsquare side length is" + it.sideLength)
                        is Rectangle -> findViewById<TextView>(R.id.textview).append("\nrect height is" + it.sideHeight + "\trect length is" + it.sideLength)
                        else -> {
                            findViewById<TextView>(R.id.textview).append("the shape doesn't exist")
                        }
                    }
                }
            }
        }
    }
}
