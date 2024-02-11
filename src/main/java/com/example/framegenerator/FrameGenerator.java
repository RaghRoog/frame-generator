package com.example.framegenerator;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class FrameGenerator {

    static Scene scene = AppFrame.scene;

    static void genFrame(){
        TextField senderInput = (TextField) scene.lookup("#senderInput");
        String sender = senderInput.getText();
        TextField receiverInput = (TextField) scene.lookup("#receiverInput");
        String receiver = receiverInput.getText();
        TextField cmdInput = (TextField) scene.lookup("#cmdInput");
        String cmd = cmdInput.getText();
        TextField dataInput = (TextField) scene.lookup("#dataInput");
        String data = dataInput.getText();

        String dataToCalcCrc = sender + receiver + cmd + data;
        byte crc = ControlSum.genControlSum(dataToCalcCrc);

        String frame = ':' + dataToCalcCrc.toUpperCase() + Integer.toHexString(crc & 0xFF).toUpperCase() + ';';

        Label frameOutput = (Label) scene.lookup("#frameOutput");
        frameOutput.setText(frame);

    }
}
