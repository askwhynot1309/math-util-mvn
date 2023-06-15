/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quyen.math.util.main.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.quyen.math.util.core.MathUtility;
import static org.quyen.math.util.core.MathUtility.*;

/**
 *
 * @author CCLaptop
 */
public class MathUtilityAdvancedTest {

    //ham chuan bi bo data de test
    //de fill vao ham assertEquals
    public static Object[][] initTestData() {
        Object testData[][] = {{0,1}, 
                               {1,1}, 
                               {2,2}, 
                               {4,24}, 
                               {6,720}};
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
    
    @Test 
    public void testFactorialGivenWrongArgumentsThrowException(){
//        Executable gF = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtility.getFactorial(-5);
//            }
//        };
        
        Executable gF = () -> getFactorial(-5);
        
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-4));// dua vao ham thuoc interface executable
    }
}
