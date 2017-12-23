package com.hanfak;

class PalindromeFinder {
    public boolean evaluate(String text) {
        return text.length() < 2 || endsMatch(text) && evaluate(innerText(text));
    }

    private boolean endsMatch(String text) {
        int indexOfLastChar = text.length() - 1;
        char firstChar = text.charAt(0);
        char lastChar = text.charAt(indexOfLastChar);
        return firstChar == lastChar;
    }

    private String innerText(String text) {
        return text.substring(1, text.length() - 1);
    }
}