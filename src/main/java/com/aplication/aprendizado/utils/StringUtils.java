package com.aplication.aprendizado.utils;

import java.util.Objects;

public class StringUtils {

    private static boolean stringVazia(String str) {
        return Objects.isNull(str) || str.isBlank() || str.isEmpty();
    }
}
