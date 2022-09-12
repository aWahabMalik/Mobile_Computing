package com.example.children_app;

public class DataClass
{
    String Alphabet;
    String Digit;
    String Roman;
    Integer ImgId;

    public DataClass(String alphabet, String digit, String roman, Integer imgId) {
        Alphabet = alphabet;
        Digit = digit;
        Roman = roman;
        ImgId = imgId;
    }

    public String getAlphabet() {
        return Alphabet;
    }

    public void setAlphabet(String alphabet) {
        Alphabet = alphabet;
    }

    public String getDigit() {
        return Digit;
    }

    public void setDigit(String digit) {
        Digit = digit;
    }

    public String getRoman() {
        return Roman;
    }

    public void setRoman(String roman) {
        Roman = roman;
    }

    public Integer getImgId() {
        return ImgId;
    }

    public void setImgId(Integer imgId) {
        ImgId = imgId;
    }
}
