package com.inaction.junit5;

import com.inaction.junit5.extension.RandomParametersExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(RandomParametersExtension.class)
class MyRandomParametersTest {

    @Test
    void injectsInteger(@RandomParametersExtension.Random int i, @RandomParametersExtension.Random int j) {
        assertNotEquals(i, j);
    }

    @Test
    void injectsDouble(@RandomParametersExtension.Random double d) {
        assertEquals(0.0, d, 1.0);
    }

}