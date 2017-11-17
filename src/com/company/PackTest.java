package com.company;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PackTest extends TestCase {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

            { 191, 123, 18,  2.354d, "FR", "12,00" },

            { 253, 215, 164, 1.565d, "FR", "30,39" },

            { 653, 133, 271, 2.132d, "FR", "46,09" },

            { 653, 331, 271, 3.650d, "FR", "83,76" },

            { 123, 191, 18,  2.354d, "MC", "13,04" },

            { 253, 215, 164, 1.565d, "MC", "33,03" },

            { 653, 133, 271, 2.132d, "MC", "50,10" },

            { 653, 331, 271, 3.650d, "MC", "91,05" }

    });}


    static double actual;
    static double expected;



    public void shipping_cost_test(int width, int height, int depth, double weight, String Loc, String result) {
        Pack pack1 = new Pack(width,height,depth,weight);
        actual=pack1.calculateLocalShippingCost(Loc);
        expected= Double.parseDouble(result);
    }

    @Test
    public void Must_return_right_price_for_each_location(){
        assertEquals(actual,expected);
    }





}