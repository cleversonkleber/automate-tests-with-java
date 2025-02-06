package com.cleverson.automate_tests_with_java.math;

import com.cleverson.automate_tests_with_java.cleverson.SimpleMathS3;
import org.junit.jupiter.api.*;

public class DemoRepetedTest {
    SimpleMathS3 math;

    @BeforeEach
    void beforeEachMethod(){
        math = new SimpleMathS3();
        System.out.println("BeforeEach");
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition"+
    "{currentRepetition} of {totalRepetition}!")
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIDivisidedByZero(
            RepetitionInfo repetitionInfo,
            TestInfo testInfo
    ){
        System.out.println("Repetition N "+repetitionInfo.getCurrentRepetition() +"Of" +
                repetitionInfo.getTotalRepetitions());
        System.out.println("Runner :"+ testInfo.getTestMethod().get().getName());
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
}
