package com.company;

public class Main {

    public static void main(String[] args) {
        Outfit jean = new Jean();
        jean.wear();
        Girl linda = new Girl(jean);
    }
}
