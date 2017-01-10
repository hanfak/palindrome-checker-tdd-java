package com.hanfak;

class PalindromeFinder {
    public boolean evaluate(String text) {
        if(text.length() == 3) {
            return isPalindrome(text);
        }

        if(text.length() == 2) {
            return isPalindrome(text);
        }

        return true;
    }

    private boolean isPalindrome(String text) {
        char firstChar = text.charAt(0);
        char lastChar = text.charAt(text.length() - 1);
        return firstChar == lastChar;
    }
}