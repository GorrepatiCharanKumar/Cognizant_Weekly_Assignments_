package com.example;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import com.sun.tools.javac.util.Assert;

public class CalculatorTest {
    private Calculator  calculator;
    @BeforeEach //it will execute before each test case
    public void setUp(){
        calculator = new Calculator(); // defing a method rather than creating each time an object at each test --by using BeforeEach annotation 
        System.out.println("Object is Created each time");
    }
    @AfterEach
    public void tearDown(){
        calculator = null;
        System.out.println("Destorying Object");
        //remove the object after each test
    }
    @Test
    void testCalculation() {
        //AAA pattern defines as Arrange(Declarations), Act (running test cases), Assert(verifying and refracting the code)
        //Arrange
        int a = 2;
        int b =5;
        //Act
        int res = calculator.add(a,b);
        //Assert
        assertEquals(7,res);
    }
    @Test
    void testSubtraction(){
        //Arrange
        int a = 12;
        int b = 4;
        //Act
        int res = calculator.subtract(a,b);
        //Assert
        assertEquals(8, res);
    }
     @Test
    void testMultiplication(){
        //Arrange
        int a = 11;
        int b = 4;
        //Act
        int res = calculator.multiply(a,b);
        //Assert
        assertEquals(44, res);
    }
}
