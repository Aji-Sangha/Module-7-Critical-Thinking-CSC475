package com.unitconversion
class Converter {

    // Temperature conversion
    fun convertTemperature(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Celsius" to "Fahrenheit" -> (value * 9/5) + 32
            "Fahrenheit" to "Celsius" -> (value - 32) * 5/9
            "Celsius" to "Kelvin" -> value + 273.15
            "Kelvin" to "Celsius" -> value - 273.15
            "Fahrenheit" to "Kelvin" -> (value - 32) * 5/9 + 273.15
            "Kelvin" to "Fahrenheit" -> (value - 273.15) * 9/5 + 32
            else -> value
        }
    }

    // Length conversion
    fun convertLength(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Meters" to "Feet" -> value * 3.28084
            "Feet" to "Meters" -> value / 3.28084
            "Kilometers" to "Miles" -> value * 0.621371
            "Miles" to "Kilometers" -> value / 0.621371
            "Centimeters" to "Inches" -> value / 2.54
            "Inches" to "Centimeters" -> value * 2.54
            else -> value
        }
    }

    // Weight conversion
    fun convertWeight(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Kilograms" to "Pounds" -> value * 2.20462
            "Pounds" to "Kilograms" -> value / 2.20462
            "Grams" to "Ounces" -> value / 28.3495
            "Ounces" to "Grams" -> value * 28.3495
            "Tons" to "Kilograms" -> value * 1000
            "Kilograms" to "Tons" -> value / 1000
            else -> value
        }
    }

    // Volume conversion
    fun convertVolume(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Liters" to "Gallons" -> value * 0.264172
            "Gallons" to "Liters" -> value / 0.264172
            "Milliliters" to "Cups" -> value / 240
            "Cups" to "Milliliters" -> value * 240
            else -> value
        }
    }

    // Time conversion
    fun convertTime(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Seconds" to "Minutes" -> value / 60
            "Minutes" to "Seconds" -> value * 60
            "Hours" to "Minutes" -> value * 60
            "Minutes" to "Hours" -> value / 60
            "Days" to "Hours" -> value * 24
            "Hours" to "Days" -> value / 24
            else -> value
        }
    }

    // Speed conversion
    fun convertSpeed(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Meters per second" to "Kilometers per hour" -> value * 3.6
            "Kilometers per hour" to "Meters per second" -> value / 3.6
            "Miles per hour" to "Kilometers per hour" -> value * 1.60934
            "Kilometers per hour" to "Miles per hour" -> value / 1.60934
            else -> value
        }
    }

    // Area conversion
    fun convertArea(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Square meters" to "Square feet" -> value * 10.7639
            "Square feet" to "Square meters" -> value / 10.7639
            "Acres" to "Square meters" -> value * 4046.86
            "Square meters" to "Acres" -> value / 4046.86
            else -> value
        }
    }

    // Pressure conversion
    fun convertPressure(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Pascals" to "Atmospheres" -> value / 101325
            "Atmospheres" to "Pascals" -> value * 101325
            "Bars" to "Pascals" -> value * 100000
            "Pascals" to "Bars" -> value / 100000
            else -> value
        }
    }

    // Energy conversion
    fun convertEnergy(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Joules" to "Calories" -> value / 4.184
            "Calories" to "Joules" -> value * 4.184
            "Watt-hours" to "Joules" -> value * 3600
            "Joules" to "Watt-hours" -> value / 3600
            else -> value
        }
    }

    // Data Storage conversion
    fun convertDataStorage(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit to toUnit) {
            "Bytes" to "Kilobytes" -> value / 1024
            "Kilobytes" to "Bytes" -> value * 1024
            "Kilobytes" to "Megabytes" -> value / 1024
            "Megabytes" to "Kilobytes" -> value * 1024
            "Gigabytes" to "Terabytes" -> value / 1024
            "Terabytes" to "Gigabytes" -> value * 1024
            else -> value
        }
    }
}
