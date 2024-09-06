package com.unitconversion
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputValue = findViewById<EditText>(R.id.inputValue)
        val fromUnit = findViewById<Spinner>(R.id.fromUnit)
        val toUnit = findViewById<Spinner>(R.id.toUnit)
        val convertButton = findViewById<Button>(R.id.convertButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        val converter = Converter()

        convertButton.setOnClickListener {
            val value = inputValue.text.toString().toDoubleOrNull()
            if (value != null) {
                val from = fromUnit.selectedItem.toString()
                val to = toUnit.selectedItem.toString()

                val result = when {
                    from in listOf("Celsius", "Fahrenheit", "Kelvin") -> converter.convertTemperature(value, from, to)
                    from in listOf("Meters", "Feet", "Kilometers", "Miles", "Centimeters", "Inches") -> converter.convertLength(value, from, to)
                    from in listOf("Kilograms", "Pounds", "Grams", "Ounces", "Tons") -> converter.convertWeight(value, from, to)
                    from in listOf("Liters", "Gallons", "Milliliters", "Cups") -> converter.convertVolume(value, from, to)
                    from in listOf("Seconds", "Minutes", "Hours", "Days") -> converter.convertTime(value, from, to)
                    from in listOf("Meters per second", "Kilometers per hour", "Miles per hour") -> converter.convertSpeed(value, from, to)
                    from in listOf("Square meters", "Square feet", "Acres") -> converter.convertArea(value, from, to)
                    from in listOf("Pascals", "Atmospheres", "Bars") -> converter.convertPressure(value, from, to)
                    from in listOf("Joules", "Calories", "Watt-hours") -> converter.convertEnergy(value, from, to)
                    from in listOf("Bytes", "Kilobytes", "Megabytes", "Gigabytes", "Terabytes") -> converter.convertDataStorage(value, from, to)
                    else -> value
                }

                resultText.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
