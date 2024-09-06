package com.unitconversion
import org.junit.Assert.assertEquals
import org.junit.Test

class ConverterTest {

    private val converter = Converter()

    // Temperature Tests
    @Test
    fun testCelsiusToFahrenheit() {
        val result = converter.convertTemperature(0.0, "Celsius", "Fahrenheit")
        assertEquals(32.0, result, 0.001)
    }

    @Test
    fun testFahrenheitToCelsius() {
        val result = converter.convertTemperature(32.0, "Fahrenheit", "Celsius")
        assertEquals(0.0, result, 0.001)
    }

    @Test
    fun testCelsiusToKelvin() {
        val result = converter.convertTemperature(0.0, "Celsius", "Kelvin")
        assertEquals(273.15, result, 0.001)
    }

    // Length Tests
    @Test
    fun testMetersToFeet() {
        val result = converter.convertLength(1.0, "Meters", "Feet")
        assertEquals(3.28084, result, 0.001)
    }

    @Test
    fun testFeetToMeters() {
        val result = converter.convertLength(3.28084, "Feet", "Meters")
        assertEquals(1.0, result, 0.001)
    }

    // Weight Tests
    @Test
    fun testKilogramsToPounds() {
        val result = converter.convertWeight(1.0, "Kilograms", "Pounds")
        assertEquals(2.20462, result, 0.001)
    }

    @Test
    fun testPoundsToKilograms() {
        val result = converter.convertWeight(2.20462, "Pounds", "Kilograms")
        assertEquals(1.0, result, 0.001)
    }

    // Volume Tests
    @Test
    fun testLitersToGallons() {
        val result = converter.convertVolume(1.0, "Liters", "Gallons")
        assertEquals(0.264172, result, 0.001)
    }

    @Test
    fun testGallonsToLiters() {
        val result = converter.convertVolume(1.0, "Gallons", "Liters")
        assertEquals(3.78541, result, 0.001)
    }

    // Time Tests
    @Test
    fun testSecondsToMinutes() {
        val result = converter.convertTime(60.0, "Seconds", "Minutes")
        assertEquals(1.0, result, 0.001)
    }

    @Test
    fun testMinutesToSeconds() {
        val result = converter.convertTime(1.0, "Minutes", "Seconds")
        assertEquals(60.0, result, 0.001)
    }

    // Speed Tests
    @Test
    fun testMetersPerSecondToKilometersPerHour() {
        val result = converter.convertSpeed(1.0, "Meters per second", "Kilometers per hour")
        assertEquals(3.6, result, 0.001)
    }

    @Test
    fun testKilometersPerHourToMetersPerSecond() {
        val result = converter.convertSpeed(3.6, "Kilometers per hour", "Meters per second")
        assertEquals(1.0, result, 0.001)
    }

    // Area Tests
    @Test
    fun testSquareMetersToSquareFeet() {
        val result = converter.convertArea(1.0, "Square meters", "Square feet")
        assertEquals(10.7639, result, 0.001)
    }

    @Test
    fun testSquareFeetToSquareMeters() {
        val result = converter.convertArea(10.7639, "Square feet", "Square meters")
        assertEquals(1.0, result, 0.001)
    }

    // Pressure Tests
    @Test
    fun testPascalsToAtmospheres() {
        val result = converter.convertPressure(101325.0, "Pascals", "Atmospheres")
        assertEquals(1.0, result, 0.001)
    }

    @Test
    fun testAtmospheresToPascals() {
        val result = converter.convertPressure(1.0, "Atmospheres", "Pascals")
        assertEquals(101325.0, result, 0.001)
    }

    // Energy Tests
    @Test
    fun testJoulesToCalories() {
        val result = converter.convertEnergy(4.184, "Joules", "Calories")
        assertEquals(1.0, result, 0.001)
    }

    @Test
    fun testCaloriesToJoules() {
        val result = converter.convertEnergy(1.0, "Calories", "Joules")
        assertEquals(4.184, result, 0.001)
    }

    // Data Storage Tests
    @Test
    fun testBytesToKilobytes() {
        val result = converter.convertDataStorage(1024.0, "Bytes", "Kilobytes")
        assertEquals(1.0, result, 0.001)
    }

    @Test
    fun testKilobytesToBytes() {
        val result = converter.convertDataStorage(1.0, "Kilobytes", "Bytes")
        assertEquals(1024.0, result, 0.001)
    }
}
