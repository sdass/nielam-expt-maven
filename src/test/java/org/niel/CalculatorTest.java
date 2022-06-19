package org.niel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;


public class CalculatorTest {

    @Mock
    private RandomAdjuster randomAdjusterMock;

    private Calculator calculator;

    @Before /* run this method before each method */
    public void beforeEach(){

        MockitoAnnotations.initMocks(this);
        this.calculator = new Calculator();
        this.calculator.setRandomAdjuster(randomAdjusterMock);
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

    @Test
    public void adjustmentSumMockNetworkCallSimulationTest()
    {
        //prepare
        int m = 4;
        int n = 5;
        final int THREE = 3;
        //understand: why I am returning 3 or 4, etc, eventhough atual method call (hardcoded return 55
        Mockito.when(randomAdjusterMock.resultMultiplier(Mockito.any())).thenReturn(THREE);

        //act
        int actualVal = calculator.addWithAdjust(m, n);

        System.out.println("actualVal=" + actualVal);
        //verify
        Assert.assertEquals(9* THREE, actualVal);
    }
}
