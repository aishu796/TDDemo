package com.tdddemo;

import com.tdddemo.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;
public class CabInvoiceGeneratorTest {
    @Test
    public void distanceandtime() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double result = cabInvoiceGenerator.calculatefare(distance, time);
        Assert.assertEquals(25,result,0);

    }
}


