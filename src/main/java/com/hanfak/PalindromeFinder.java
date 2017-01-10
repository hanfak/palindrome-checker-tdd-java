package com.hanfak;

class PalindromeFinder {
    public boolean evaluate(String text) {
        if(text.length() == 4) {
            if(isPalindrome(text)) {
                String innerText = text.substring(1, text.length() - 1);
                return isPalindrome(innerText);
            } else {
                return false;
            }
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