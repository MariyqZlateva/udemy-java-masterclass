package com.zlateva;

public class Main {

    public static void main(String[] args) {
        ITelephone mimisPhone;
        mimisPhone = new DeskPhone(123456);
        mimisPhone.powerOn();
        mimisPhone.callPhone(123456);
        mimisPhone.answer();

        mimisPhone = new MobilePhone(23456);
        mimisPhone.powerOn();
        mimisPhone.callPhone(23456);
        mimisPhone.answer();
    }
}
