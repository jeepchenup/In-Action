package com.inaction.junit5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * 可以在src/test/resources/junit-platform.properties配置文件中增加
 * 默认方法顺序，这样就不需要每次都加@TestMethodOrder注解了
 */
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTestsDemo {

    @Test
    @Order(1)
    void nullValues() {
        // perform assertions against null values
    }

    @Test
    @Order(2)
    void emptyValues() {
        // perform assertions against empty values
    }

    @Test
    @Order(3)
    void validValues() {
        // perform assertions against valid values
    }

}
