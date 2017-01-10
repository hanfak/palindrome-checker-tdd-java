package com.hanfak;

class PalindromeFinder {
    public boolean evaluate(String text) {
        if(text.length() == 2){
            char firstChar = text.charAt(0);
            char secondChar = text.charAt(1);
            return firstChar == secondChar;
        }
        return true;
    }
}