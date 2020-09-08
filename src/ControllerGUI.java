import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerGUI {

    private String strNum1 = "";
    private String strNum2 = "";
    private String[] statement;
    private String strTotal = "";
    private boolean binaryToggle;
    private Converter converter;
    private GUI calculatorGUI;

    public ControllerGUI(GUI gui){

        calculatorGUI = gui;
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
                try {
                    strNum1 = calculatorGUI.textScreen.getText();
                    strTotal = SingleNumberOperations.getSquare(strNum1);
                    PrintResult(strTotal);
                }
                catch(Exception err){
                    strTotal = "Error. Operator not allowed.";
                    PrintResult(strTotal);
                    System.out.println(err);
                }
            }
        });


        calculatorGUI.btnRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    strNum1 = calculatorGUI.textScreen.getText();
                    strTotal = SingleNumberOperations.getSquareRoot(strNum1);
                    PrintResult(strTotal);
                }
                catch(Exception err){
                    strTotal = "Error. Operator not allowed.";
                    PrintResult(strTotal);
                    System.out.println(err);
                }

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
                try {
                    if (calculatorGUI.textScreen.getText().contains("/")) {
                        statement = calculatorGUI.textScreen.getText().split("\\/");
                        strNum1 = statement[0];
                        strNum2 = statement[1];
                        strTotal = DoubleNumberOperation.divide(strNum1, strNum2);

                    } else if (calculatorGUI.textScreen.getText().contains("*")) {
                        statement = calculatorGUI.textScreen.getText().split("\\*");
                        strNum1 = statement[0];
                        strNum2 = statement[1];
                        strTotal = DoubleNumberOperation.multiply(strNum1, strNum2);
                    } else if (calculatorGUI.textScreen.getText().contains("-")) {
                        statement = calculatorGUI.textScreen.getText().split("\\-");
                        strNum1 = statement[0];
                        strNum2 = statement[1];
                        strTotal = DoubleNumberOperation.subtract(strNum1, strNum2);
                    } else if (calculatorGUI.textScreen.getText().contains("+")) {
                        statement = calculatorGUI.textScreen.getText().split("\\+");
                        strNum1 = statement[0];
                        strNum2 = statement[1];
                        strTotal = DoubleNumberOperation.add(strNum1, strNum2);
                    } else {
                        strTotal = "Error.";
                    }
                    PrintResult(strTotal);
                }
                catch(Exception err){
                    strTotal = "Error. Only one operator allowed.";
                    PrintResult(strTotal);
                    System.out.println(err);
                }

            }
        });
    }

    void PrintResult(String result){
        if(binaryToggle){
            calculatorGUI.resultScreen.setText(result);
        }
        else{
            result = converter.toDecimal(result);
            calculatorGUI.resultScreen.setText(result);
        }
    }
}

