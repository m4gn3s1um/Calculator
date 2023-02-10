package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.MFXListView;

public class CalculatorController {

    @FXML
    private MFXButton but0,but1,but2,but3,but4,but5,but6,but7,but8,but9,butDelete,butMinus,butPlus,butMultiply,butDivide,butGetResult;
    @FXML
    private MFXTextField numberTrack;
    @FXML
    private MFXListView resultList;

    private int search = 0;


    int loadingResult;


    int firstCalc, secondCalc, middleCalc;


    public void add1(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "1");

    }

    public void add4(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "4");
    }

    public void add7(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "7");
    }

    public void add2(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "2");
    }

    public void add5(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "5");
    }

    public void add8(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "8");
    }

    public void add3(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "3");
    }

    public void add6(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "6");
    }

    public void add9(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "9");
    }

    public void deleteNr(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText().substring(0, numberTrack.getLength() - 1));
    }

    public void addMinus(ActionEvent actionEvent) {

        firstCalc = Integer.valueOf(numberTrack.getText());

        middleCalc = firstCalc;

        System.out.println(firstCalc);

        numberTrack.clear();



        loadingResult = middleCalc - firstCalc;

        System.out.println(middleCalc);

    }

    public void addPlus(ActionEvent actionEvent) {

        firstCalc = Integer.valueOf(numberTrack.getText());

        middleCalc = firstCalc;

        numberTrack.clear();



        loadingResult = firstCalc + middleCalc;

    }

    public void add0(ActionEvent actionEvent) {

        numberTrack.setText(numberTrack.getText() + "0");
    }

    public void addMult(ActionEvent actionEvent) {
    }

    public void addDivide(ActionEvent actionEvent) {
    }

    public void getResult(ActionEvent actionEvent) {

        numberTrack.clear();
        numberTrack.setText(String.valueOf(loadingResult));

    }
}