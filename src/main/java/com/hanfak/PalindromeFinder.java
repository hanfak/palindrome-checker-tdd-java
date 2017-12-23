package com.hanfak;

class PalindromeFinder {
    boolean evaluate(String text) {
        return new StringBuilder(text).reverse().toString().equals(text);
    }
}