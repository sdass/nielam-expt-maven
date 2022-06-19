package org.niel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CalculatorTest {

    Calculator calculator;

    @Before /* run this method before each method */
    public void beforeEach(){
        this.calculator = new Calculator();
    }

    @Test
    public void shouldreturnSum()
    {
        //prepare
        int m = 4;
        int n = 5;

        //act
        int actualVal = calculator.add(m, n);

        //verify
        Assert.assertEquals(9, actualVal);
    }
}
