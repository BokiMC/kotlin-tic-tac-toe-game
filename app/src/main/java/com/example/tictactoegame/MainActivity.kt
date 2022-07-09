package com.example.tictactoegame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById(R.id.button1) as Button
        var button2 = findViewById(R.id.button2) as Button
        var button3 = findViewById(R.id.button3) as Button
        var button4 = findViewById(R.id.button4) as Button
        var button5 = findViewById(R.id.button5) as Button
        var button6 = findViewById(R.id.button6) as Button
        var button7 = findViewById(R.id.button7) as Button
        var button8 = findViewById(R.id.button8) as Button
        var button9 = findViewById(R.id.button9) as Button


        var Player1 = ArrayList<Int>()
        var Player2 = ArrayList<Int>()
        var currentPlayer = 1
        fun checkWinner() {
            var winner = -1
            //row 1
            if(Player1.contains(1) && Player1.contains(2) && Player1.contains(3)){
                winner = 1
            }
            if(Player2.contains(1) && Player2.contains(2) && Player2.contains(3)){
                winner = 2
            }

            //row2
            if(Player1.contains(4) && Player1.contains(5) && Player1.contains(6)){
                winner = 1
            }
            if(Player2.contains(4) && Player2.contains(5) && Player2.contains(6)){
                winner = 2
            }

            //row3
            if(Player1.contains(7) && Player1.contains(8) && Player1.contains(9)){
                winner = 1
            }
            if(Player2.contains(7) && Player2.contains(8) && Player2.contains(9)){
                winner = 2
            }

            //column 1
            if(Player1.contains(1) && Player1.contains(4) && Player1.contains(7)){
                winner = 1
            }
            if(Player2.contains(1) && Player2.contains(4) && Player2.contains(7)){
                winner = 2
            }

            //column2
            if(Player1.contains(2) && Player1.contains(5) && Player1.contains(8)){
                winner = 1
            }
            if(Player2.contains(2) && Player2.contains(5) && Player2.contains(8)){
                winner = 2
            }

            //column3
            if(Player1.contains(3) && Player1.contains(6) && Player1.contains(9)){
                winner = 1
            }
            if(Player2.contains(3) && Player2.contains(6) && Player2.contains(9)){
                winner = 2
            }

            if(winner != -100) {
                if(winner == 1){
                    Toast.makeText(this,"Winner is Player$winner",Toast.LENGTH_LONG).show()
                }
                if(winner == 2){
                    Toast.makeText(this,"Winner is Player$winner",Toast.LENGTH_LONG).show()
                }
            }
        }

        button1.setOnClickListener(){
            if(currentPlayer %2 == 0){
                button1.text = "X"
                button1.setBackgroundColor(Color.GREEN)
                Player1.add(1)
                currentPlayer +=1
            }
            else{
                button1.text = "O"
                button1.setBackgroundColor(Color.RED)
                Player2.add(1)
                currentPlayer +=1
            }
            checkWinner()
        }
        button2.setOnClickListener(){
            if(currentPlayer %2 == 0){
                button2.text = "X"
                button2.setBackgroundColor(Color.GREEN)
                Player1.add(2)
                currentPlayer +=1
            }
            else{
                button2.text = "O"
                button2.setBackgroundColor(Color.RED)
                Player2.add(2)
                currentPlayer +=1
            }
            checkWinner()
        }
        button3.setOnClickListener(){
            if(currentPlayer %2 == 0){
                button3.text = "X"
                button3.setBackgroundColor(Color.GREEN)
                Player1.add(3)
                currentPlayer +=1
            }
            else{
                button3.text = "O"
                button3.setBackgroundColor(Color.RED)
                Player2.add(3)
                currentPlayer +=1
            }
            checkWinner()
        }
        button4.setOnClickListener(){
            if(currentPlayer %2 == 0){
                button4.text = "X"
                button4.setBackgroundColor(Color.GREEN)
                Player1.add(4)
                currentPlayer +=1
            }
            else{
                button4.text = "O"
                button4.setBackgroundColor(Color.RED)
                Player2.add(4)
                currentPlayer +=1
            }
            checkWinner()
        }
        button5.setOnClickListener(){
            if(currentPlayer %2 == 0){
                button5.text = "X"
                button5.setBackgroundColor(Color.GREEN)
                Player1.add(5)
                currentPlayer +=1
            }
            else{
                button5.text = "O"
                button5.setBackgroundColor(Color.RED)
                Player2.add(5)
                currentPlayer +=1
            }
            checkWinner()
        }
        button6.setOnClickListener(){
            if(currentPlayer %2 == 0){
                button6.text = "X"
                button6.setBackgroundColor(Color.GREEN)
                Player1.add(6)
                currentPlayer +=1
            }
            else{
                button6.text = "O"
                button6.setBackgroundColor(Color.RED)
                Player2.add(6)
                currentPlayer +=1
            }
            checkWinner()
        }
        button7.setOnClickListener(){
            if(currentPlayer %2 == 0){
                button7.text = "X"
                button7.setBackgroundColor(Color.GREEN)
                Player1.add(7)
                currentPlayer +=1
            }
            else{
                button7.text = "O"
                button7.setBackgroundColor(Color.RED)
                Player2.add(7)
                currentPlayer +=1
            }
            checkWinner()
        }
        button8.setOnClickListener(){
            if(currentPlayer %2 == 0){
                button8.text = "X"
                button8.setBackgroundColor(Color.GREEN)
                Player1.add(8)
                currentPlayer +=1
            }
            else{
                button8.text = "O"
                button8.setBackgroundColor(Color.RED)
                Player2.add(8)
                currentPlayer +=1
            }
            checkWinner()
        }
        button9.setOnClickListener(){
            if(currentPlayer %2 == 0){
                button9.text = "X"
                button9.setBackgroundColor(Color.GREEN)
                Player1.add(9)
                currentPlayer +=1
            }
            else{
                button9.text = "O"
                button9.setBackgroundColor(Color.RED)
                Player2.add(9)
                currentPlayer +=1
            }
            checkWinner()
        }




    }
}