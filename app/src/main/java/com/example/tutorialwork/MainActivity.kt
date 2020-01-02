package com.example.tutorialwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.NumberFormat
import android.view.View



class MainActivity : AppCompatActivity() {
    // Basic app on Main function that runs when opening the application. Will start by running onCreate.

    // Class variable created on run
    var numberOfCoffees = 0
    var price = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        // Basic app on Main function that runs on Create

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun submitOrder(view: View){
        // Will reset the number of coffees ordered. e.g. "Completes the order"
        numberOfCoffees = 0
        display(numberOfCoffees)
        displayPrice(numberOfCoffees * price)
    }

    public fun increment(view: View) {
        // Increases the coffees ordered by one
        numberOfCoffees += 1
        display(numberOfCoffees)
        displayPrice(numberOfCoffees * price)
    }

    public fun decrement(view: View) {
        // reduces the coffees ordered by one... unless = to 0
        if (numberOfCoffees > 0) {
        numberOfCoffees -= 1
        display(numberOfCoffees)
        displayPrice(numberOfCoffees * price) }
        else {
            return
        }
    }

    private fun display(number:Int) {
        // Method that displays the correct amount of coffees

        val quantityTextView = findViewById<TextView>(R.id.quantity_text)
        quantityTextView.text = "" + number
    }

    private fun displayPrice(number:Int) {
        // Method that displays the correct price for the coffees
        val priceTextView = findViewById<TextView>(R.id.price_text)
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number))

    }
}
