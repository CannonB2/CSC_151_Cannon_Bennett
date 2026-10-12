/*
Name: Kallie Bennett
Date: 10/09/2026
Description: Program for practicing tests in java
*/

package com.labs;

// creates an object
public class BankAccount {

    // creates a variable to hold the account balance
    private double balance = 0;

    // method used to add to the account balance as long as the amount is greater than 0
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // method used to get the account balance
    public double getBalance() {
        return balance;
    }

    // method used to withdraw money from the account as long as the amount is greater than zero and less than or equal to the current balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

/* 
    1. Maybe I'm misunderstanding this question but I guess writing tests helped to see what I need to do in order for the test to succeed
    2. I didn't really run into errors that the tests caught but that might be because of the structure of the lab
    3. I believe TDD improves software reliability by allowing you to figure out what needs to be done in order for the program to work properly
    4. I feel like you wouldn't need to use TDD if you already know what you need to do in order for a program to work
*/