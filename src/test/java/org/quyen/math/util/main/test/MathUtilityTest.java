/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quyen.math.util.main.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.quyen.math.util.core.MathUtility;

public class MathUtilityTest {

        
        @Test
        public void testFactorialGivenRightArgumentRunsWell() {
            //assertEquals(69, 69);
            assertEquals(MathUtility.getFactorial(4), 24);
            assertEquals(1, MathUtility.getFactorial(1));
            assertEquals(1, MathUtility.getFactorial(0));
            assertEquals(2, MathUtility.getFactorial(2));
            assertEquals(6, MathUtility.getFactorial(3));
            assertEquals(120, MathUtility.getFactorial(5));
        }
}
