package com.cleverson.automate_tests_with_java.math;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderdRandonlyTest {

    @Test
    @Order(1)
    void testA(){
        System.out.println("Running Test A");
    }
    @Test
    @Order(2)
    void testB(){
        System.out.println("Running Test B");
    }

    @Test
    @Order(3)
    void testC(){
        System.out.println("Running Test C");
    }
}
