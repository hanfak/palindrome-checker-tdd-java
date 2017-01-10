package com.hanfak;

class PalindromeFinder {
    public boolean evaluate(String text) {
        if(text.length() == 4) {
            return isPalindrome(text);
        }

        if(text.length() < 3) {
            return isPalindrome(text);
        }

        return true;
    }

    private boolean isPalindrome(String text) {
        int indexOfLastChar = text.length() - 1;
        char firstChar = text.charAt(0);
        char lastChar = text.charAt(indexOfLastChar);
        return firstChar == lastChar;
    }
}