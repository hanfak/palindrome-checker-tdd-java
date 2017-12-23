package com.hanfak;

import java.util.*;

class PalindromeFinder {
    boolean evaluate(String text) {
        List<String> textArrayList = Arrays.asList(text.split(""));
        List<String> reversedArrrayList = new ArrayList<>(textArrayList);
        Collections.reverse(reversedArrrayList);
        return String.join("", textArrayList).equals(String.join("", reversedArrrayList));
    }
}