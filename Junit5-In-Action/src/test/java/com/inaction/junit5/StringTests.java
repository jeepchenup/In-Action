package com.inaction.junit5;

import com.inaction.junit5.sup.ComparableContract;
import com.inaction.junit5.sup.EqualsContract;

public class StringTests implements ComparableContract<String>, EqualsContract<String> {

    @Override
    public String createValue() {
        return "banana";
    }

    @Override
    public String createSmallerValue() {
        return "apple"; // 'a' < 'b' in "banana"
    }

    @Override
    public String createNotEqualValue() {
        return "cherry";
    }

}
