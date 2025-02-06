package com.cleverson.automate_tests_with_java.math;

import com.cleverson.automate_tests_with_java.cleverson.SimpleMathS3;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class SimpleMathTestS3 {

    SimpleMathS3 math;

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
        math = new SimpleMathS3();
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEachMathod(){
        System.out.println("Ruuner @AfterEach method!");
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Pelé","Senna","Keith Moon"
    })
    void testValueSource(String firstName){
        System.out.println(firstName);
        Assertions.assertNotNull(firstName);
    }


    @Test
    @DisplayName("Test 6.2/2 = 3.1")
    @ParameterizedTest
//    @MethodSource("testDivisionInpuParameters")
//    @MethodSource()

//    @CsvSource({
//            "6.2,2,3.1",
//            "71,14,5.07",
//            "18.3,3.1,5.90"
//    })
//
    @CsvFileSource(resources = "/testeDivision.csv")
    void testDivision(double firstNumber, double secondNumber, double expected){

        Double actual = math.division(firstNumber, secondNumber);
        System.out.println("Expect:"+ expected +" Atualk:"+actual +" n1"+ firstNumber +" n2"+ + secondNumber);
        Assertions.assertEquals(
                expected, actual,2D,()->firstNumber+"/"+secondNumber+ " did not produce"+ expected + "!"
        );
    }


//    public static Stream<Arguments> testDivision(){
//        return Stream.of(
//                Arguments.of(6.2D,2D,3.1D),
//                Arguments.of(71D,14D,5.07D),
//                Arguments.of(18.3D,3.1D,5.90D)
//
//        );
//    }
//



}
