package com.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    @Test

    // Se comprueban los 3 números
    //* El primer número es 5; El test falla porque no se validan correctamente ninguna de las dos condiciones *//
    //* El segundo número es 3; El test falla otra vez porque no se validan correctamente ninguna de las dos condiciones *//
    // El tercer número es 15; El test se ejecuta correctamente porque las dos condiciones se han cumplido

    public void testnumerosdivisiblesportresycinco() {

        FizzBuzz test = new FizzBuzz();

        Assert.assertEquals("FizzBuzz", test.classify(15));
    }


    @Test

    public void testnumerosdivisiblespor3(){

        FizzBuzz test = new FizzBuzz();

        Assert.assertEquals("Fizz", test.classify(24));
    }

    @Test

    public void testnumerosdivisiblespor5() {

        FizzBuzz test = new FizzBuzz();

        Assert.assertEquals("Buzz", test.classify(25));

    }

}


