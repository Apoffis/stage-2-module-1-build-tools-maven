package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        return Double.parseDouble(str) > 0;
    }
}
