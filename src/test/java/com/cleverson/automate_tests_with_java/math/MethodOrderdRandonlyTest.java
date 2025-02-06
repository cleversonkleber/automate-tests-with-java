package com.cleverson.automate_tests_with_java.math;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderdRandonlyTest {

    @Test
    void testA(){
        System.out.println("Running Test A");
    }
    @Test
    void testB(){
        System.out.println("Running Test B");
    }

    @Test
    void testC(){
        System.out.println("Running Test C");
    }
}
