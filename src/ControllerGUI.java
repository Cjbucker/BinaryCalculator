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
    private DoubleNumberOperation doubleNumberOperator;
    private Converter converter;

    public ControllerGUI(GUI gui){

        final GUI calculatorGUI = gui;
        doubleNumberOperator = new DoubleNumberOperation();
        converter = new Converter();

        binaryToggle = false;

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
                calculatorGUI.textScreen.append("x²");
            }
        });


        calculatorGUI.btnRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorGUI.btnRoot.isSelected());
                strNum1 = statement[0];
                strNum2 = statement[1];
                doubleNum = Double.parseDouble(strNum1);
                totalVal = Math.sqrt(doubleNum);
                strTotal = Double.toString(totalVal);
                calculatorGUI.textScreen.setText(strTotal);

            }
        });


        calculatorGUI.btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorGUI.btnClear.isSelected()) {
                    calculatorGUI.textScreen.setText("");
                    calculatorGUI.resultScreen.setText("");
                }
            }
        });


        calculatorGUI.btnToggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (binaryToggle){
                    binaryToggle = false;
                    String value = calculatorGUI.resultScreen.getText();
                    strTotal = converter.toBinary(value);
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

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 / num2;
                    strTotal = Integer.toString(totalValue);
                    calculatorGUI.resultScreen.setText(strTotal);

                }
                if(calculatorGUI.textScreen.getText().contains("*")) {
                    statement = calculatorGUI.textScreen.getText().split("\\*");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 + num2;

                    strTotal = Integer.toString(totalValue);
                    calculatorGUI.resultScreen.setText(strTotal);
                }
                if(calculatorGUI.textScreen.getText().contains("-")) {
                    statement = calculatorGUI.textScreen.getText().split("\\-");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 - num2;

                    strTotal = Integer.toString(totalValue);
                    calculatorGUI.resultScreen.setText(strTotal);
                }
                
                if(calculatorGUI.textScreen.getText().contains("+")) {
                    statement = calculatorGUI.textScreen.getText().split("\\+");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    strTotal = doubleNumberOperator.add(strNum1, strNum2);
                }

                if(binaryToggle){
                    calculatorGUI.resultScreen.setText(strTotal);
                }
                else{
                    strTotal = converter.toDecimal(strTotal);
                    calculatorGUI.resultScreen.setText(strTotal);
                }
            }
        });


    }
}

