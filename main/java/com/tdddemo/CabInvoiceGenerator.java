package com.tdddemo;
public class CabInvoiceGenerator {
    public static  final  double costperkm=10.0;
    public static  final  double costpermin=1.0;
    public static  final  double minfare=5;
    public  double calculatefare(double distance,int time){
        double totalfare =(distance*costperkm)+(time*costpermin);
        if(totalfare<5){
            return minfare;
        }
        return totalfare;
    }

}



package com.tdddemo;

import com.tdddemo.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;
public class CabInvoiceGeneratorText {
    public void distanceandtime() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double result = cabInvoiceGenerator.calculatefare(distance, time);
        Assert.assertEquals(25,result,0);

    }
}
    <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.1</version>
    <scope>test</scope>
</dependency>
