package com.cleverson.automate_tests_with_java.math;

import com.cleverson.automate_tests_with_java.cleverson.SimpleMath;
import org.junit.jupiter.api.*;
import org.springframework.test.util.AssertionErrors;

public class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void setup(){
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("Running @AfterAll method!");
    }
// Para instanciar o objeto no inicio da execução
    @BeforeEach
    void beforeEachMethod(){
        math = new SimpleMath();
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEachMathod(){
        System.out.println("Ruuner @AfterEach method!");
    }


//    @Disabled("TODO: wen still work on it!")
    @Test
    @DisplayName("Divide por zero")
    void testDivision_When_FirstNumberIDivisidedByZero(){
        //Given
        double fistNumber = 6.2D;
        double secondNumber = 0D;
        var expectedMessege = "Impossivel dividir por zero";

        ArithmeticException actual = Assertions.assertThrows(ArithmeticException.class, ()->{
            //When
           math.division(fistNumber, secondNumber);
        }, ()-> "Impossivel dividir por zero");
        //then
        Assertions.assertEquals(expectedMessege, actual.getLocalizedMessage());
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_when_SixDotTwoIsAddedByTwo(){
        // AAA Arrange, act Assert
        // Given / Arrange -> Declaração


        // When / Act
        Double actual = math.sum(6.2D, 2D);
        double expected = 8.2D;
        // Then / Assert
        Assertions.assertEquals(expected, actual,()-> "6.2+2 did not produce 8.2!");
        Assertions.assertNotEquals(9.2, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.1")
    void testSubtration(){
         
        Double actual = math.subtraction(6.2D, 2D);
        double expected = 4.2D;

        Assertions.assertEquals(expected, actual,()-> "6.2-2 did not produce 6!");
        Assertions.assertNotEquals(9.2, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMultiplication(){
         
        Double actual = math.multiplication(6.2D, 2D);
        double expected = 12.4D;

        Assertions.assertEquals(expected, actual,()-> "6.2-2 did not produce 6!");
        Assertions.assertNotEquals(9.2, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2/2 = 3.1")
    void testDivision(){
         
        Double actual = math.division(6.2D, 2D);
        double expected = 3.1D;

        Assertions.assertEquals(expected, actual,()-> "6.2-2 did not produce 6!");
        Assertions.assertNotEquals(9.2, actual);
        Assertions.assertNotNull(actual);
    }
    @Test
    @DisplayName("Test mean (6.2+2)/2  = 4.1")
    void testAVG(){
         
        Double actual = math.mean(6.2D, 2D);
        double expected = 4.1D;

        Assertions.assertEquals(expected, actual,()-> "6.2+2 did not produce 8.2!");
        Assertions.assertNotEquals(9.2, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Test square Root of 81 = 9")
    void testSquareRoot(){
         
        Double actual = math.squareRoot(81D);
        double expected = 9D;

        Assertions.assertEquals(expected, actual,()-> "6.2+2 did not produce 8.2!");

    }

    @DisplayName("Diplay Name")
    @Test
    void testABC_When_XYZ_Should(){
//        Given / Arrange
//        When / Act
//        Then / Assert

    }




}
