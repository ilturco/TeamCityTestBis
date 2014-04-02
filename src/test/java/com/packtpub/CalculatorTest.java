package com.packtpub;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by salvatore on 02/04/2014.
 */
public class CalculatorTest extends TestCase {
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        Assert.assertEquals(3, sum);
        //bla


    };

    public void testDic() throws Exception {
        Calculator calculator = new Calculator();
        float div = calculator.div(1.0f, 2.0f);
        Assert.assertEquals(0.5f, div);

    }

    public void testMult() throws Exception {
        Calculator calculator = new Calculator();
        int product = calculator.multiply(2, 3);
        Assert.assertEquals(6, product);

    }
}
