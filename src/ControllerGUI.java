

public class ControllerGUI {

    private String strNum1 = "";
    private String strNum2 = "";
    private String[] equation;
    private String result = "";
    private boolean binaryToggle;
    private final Converter converter;
    private final GUI calculatorGUI;

    public ControllerGUI(GUI gui){

        calculatorGUI = gui;
        converter = new Converter();

        binaryToggle = true;

        calculatorGUI.button0.addActionListener(e -> calculatorGUI.equationScreen.append("0"));

        calculatorGUI.button1.addActionListener(e -> calculatorGUI.equationScreen.append("1"));


        calculatorGUI.btnDivide.addActionListener(e -> calculatorGUI.equationScreen.append("/"));


        calculatorGUI.btnMultiply.addActionListener(e -> calculatorGUI.equationScreen.append("*"));


        calculatorGUI.btnAdd.addActionListener(e -> calculatorGUI.equationScreen.append("+"));


        calculatorGUI.btnSubtract.addActionListener(e -> calculatorGUI.equationScreen.append("-"));


        calculatorGUI.btnSquare.addActionListener(e -> {
            try {
                strNum1 = calculatorGUI.equationScreen.getText();
                result = SingleNumberOperations.getSquare(strNum1);
                PrintResult(result);
            }
            catch(Exception error){
                result = "Error. Operator not allowed.";
                PrintResult(result);
                System.out.println(error);
            }
        });


        calculatorGUI.btnRoot.addActionListener(e -> {
            try {
                strNum1 = calculatorGUI.equationScreen.getText();
                result = SingleNumberOperations.getSquareRoot(strNum1);
                PrintResult(result);
            }
            catch(Exception error){
                result = "Error. Operator not allowed.";
                PrintResult(result);
                System.out.println(error);
            }

        });


        calculatorGUI.btnClear.addActionListener(e -> {
            calculatorGUI.equationScreen.setText("");
            calculatorGUI.resultScreen.setText("");

        });


        calculatorGUI.btnToggle.addActionListener(e -> {
            if (binaryToggle){
                binaryToggle = false;
                String value = calculatorGUI.resultScreen.getText();
                result = converter.toDecimal(value);
                calculatorGUI.resultScreen.setText(result);
            }
            else{
                binaryToggle = true;
                String value = calculatorGUI.resultScreen.getText();
                result = converter.toBinary(value);
                calculatorGUI.resultScreen.setText(result);
            }
        });


        calculatorGUI.btnEqual.addActionListener(e -> {
            try {
                if (calculatorGUI.equationScreen.getText().contains("/")) {
                    equation = calculatorGUI.equationScreen.getText().split("/");
                    strNum1 = equation[0];
                    strNum2 = equation[1];
                    result = DoubleNumberOperation.divide(strNum1, strNum2);

                } else if (calculatorGUI.equationScreen.getText().contains("*")) {
                    equation = calculatorGUI.equationScreen.getText().split("\\*");
                    strNum1 = equation[0];
                    strNum2 = equation[1];
                    result = DoubleNumberOperation.multiply(strNum1, strNum2);
                } else if (calculatorGUI.equationScreen.getText().contains("-")) {
                    equation = calculatorGUI.equationScreen.getText().split("-");
                    strNum1 = equation[0];
                    strNum2 = equation[1];
                    result = DoubleNumberOperation.subtract(strNum1, strNum2);
                } else if (calculatorGUI.equationScreen.getText().contains("+")) {
                    equation = calculatorGUI.equationScreen.getText().split("\\+");
                    strNum1 = equation[0];
                    strNum2 = equation[1];
                    result = DoubleNumberOperation.add(strNum1, strNum2);
                } else {
                    result = "Error.";
                }
                PrintResult(result);
            }
            catch(Exception error){
                result = "Error. Only one operator allowed.";
                PrintResult(result);
                System.out.println(error);
            }

        });
    }

    private void PrintResult(String result){
        if(binaryToggle){
            calculatorGUI.resultScreen.setText(result);
        }
        else{
            result = converter.toDecimal(result);
            calculatorGUI.resultScreen.setText(result);
        }
    }
}

