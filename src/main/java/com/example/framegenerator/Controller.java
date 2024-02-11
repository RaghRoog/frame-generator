package com.example.framegenerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    public void onGenFrame(ActionEvent event) {
        FrameGenerator.genFrame();
    }
}