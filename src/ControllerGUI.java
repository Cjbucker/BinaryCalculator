import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerGUI {

    private String strNum1 = "";
    private String strNum2 = "";
    private String[] statement;
    private int num1 = 0;
    private int num2 = 0;
    private String strTotal = "";
    private int totalValue = 0;
    private double doubleNum = 0;
    private double totalVal;
    private boolean binaryToggle;
    private Converter converter;

    public ControllerGUI(GUI gui){

        final GUI calculatorGUI = gui;
        converter = new Converter();

        binaryToggle = true;

        calculatorGUI.button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorGUI.textScreen.append("0");
            }
        });

        calculatorGUI.button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorGUI.textScreen.append("1");
            }
        });


        calculatorGUI.btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorGUI.textScreen.append("/");
            }
        });


        calculatorGUI.btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorGUI.textScreen.append("*");
            }
        });


        calculatorGUI.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorGUI.textScreen.append("+");

            }
        });


        calculatorGUI.btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorGUI.textScreen.append("-");

            }
        });


        calculatorGUI.btnSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                strNum1 = calculatorGUI.textScreen.getText();
                strTotal = SingleNumberOperations.getSquare(strNum1);
                PrintResult(calculatorGUI, strTotal);
            }
        });


        calculatorGUI.btnRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                strNum1 = calculatorGUI.textScreen.getText();
                strTotal = SingleNumberOperations.getSquareRoot(strNum1);
                PrintResult(calculatorGUI, strTotal);

            }
        });


        calculatorGUI.btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorGUI.textScreen.setText("");
                calculatorGUI.resultScreen.setText("");

            }
        });


        calculatorGUI.btnToggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (binaryToggle){
                    binaryToggle = false;
                    String value = calculatorGUI.resultScreen.getText();
                    strTotal = converter.toDecimal(value);
                    calculatorGUI.resultScreen.setText(strTotal);
                }
                else{
                    binaryToggle = true;
                    String value = calculatorGUI.resultScreen.getText();
                    strTotal = converter.toBinary(value);
                    calculatorGUI.resultScreen.setText(strTotal);
                }
            }
        });


        calculatorGUI.btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(calculatorGUI.textScreen.getText().contains("/")) {
                    statement = calculatorGUI.textScreen.getText().split("\\/");
                    strNum1 = statement[0];
                    strNum2 = statement[1];
                    strTotal = DoubleNumberOperation.divide(strNum1, strNum2);

                }
                if(calculatorGUI.textScreen.getText().contains("*")) {
                    statement = calculatorGUI.textScreen.getText().split("\\*");
                    strNum1 = statement[0];
                    strNum2 = statement[1];
                    strTotal = DoubleNumberOperation.multiply(strNum1, strNum2);
                }

                if(calculatorGUI.textScreen.getText().contains("-")) {
                    statement = calculatorGUI.textScreen.getText().split("\\-");
                    strNum1 = statement[0];
                    strNum2 = statement[1];
                    strTotal = DoubleNumberOperation.subtract(strNum1, strNum2);
                }

                if(calculatorGUI.textScreen.getText().contains("+")) {
                    statement = calculatorGUI.textScreen.getText().split("\\+");
                    strNum1 = statement[0];
                    strNum2 = statement[1];
                    strTotal = DoubleNumberOperation.add(strNum1, strNum2);
                }
                PrintResult(calculatorGUI, strTotal);

            }
        });
    }

    void PrintResult(GUI calculatorGUI, String result){
        if(binaryToggle){
            calculatorGUI.resultScreen.setText(result);
        }
        else{
            result = converter.toDecimal(result);
            calculatorGUI.resultScreen.setText(result);
        }
    }
}

