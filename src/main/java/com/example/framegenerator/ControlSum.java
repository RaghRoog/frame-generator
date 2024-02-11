package com.example.framegenerator;

public class ControlSum {

    public static byte genControlSum(String data) {
        byte crc = 0x00;
        for (int i = 0; i < data.length(); i++) {
            crc ^= data.charAt(i);
            for (int j = 0; j < 8; j++) {
                if ((crc & 0x80) != 0) {
                    crc = (byte) ((crc << 1) ^ 0x07);
                } else {
                    crc <<= 1;
                }
            }
        }
        return crc;
    }
}
