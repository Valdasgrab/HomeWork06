package lt.vgrabauskas.homework06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "Shapes"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val square = Square(4)
        val triangle = Triangle(5, 7)
        val circle = Circle(4)

        Log.i(TAG, "onCreate: ${chooseShape(square)}")
        Log.i(TAG, "onCreate: ${chooseShape(triangle)}")
        Log.i(TAG, "onCreate: ${chooseShape(circle)}")
    }

    fun chooseShape(shape: Shape) {
        shape.calculateArea()
        Log.i(TAG, "$shape")
    }
}
