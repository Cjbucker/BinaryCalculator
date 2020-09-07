import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerGUI {
    private JFrame frame = new   JFrame("Calculator");

    private JTextArea textScreen = new JTextArea();

    //Calculation Variables
    String strNum1 = "";
    String strNum2 = "";
    String[] statement;
    int num1 = 0;
    int num2 = 0;
    String strTotal = "";
    int totalValue = 0;
    private double doubleNum = 0;
    private double totalVal;



    //toggle button
    private JButton btnToggle = new JButton("Binary/Decimal");

    //Add Number Buttons to screen
    private JButton button0 = new JButton("0");
    private JButton button1 = new JButton("1 ");


    //Add operator buttons to screens
    private JButton btnDivide = new JButton("/");
    private JButton btnMultiply  = new JButton("*");
    private JButton btnAdd = new JButton ("+");
    private JButton btnSubtract = new JButton("-");

    private JButton btnRoot = new JButton("√x ");
    private JButton btnSquare = new JButton ("x²");

    private JButton btnEqual = new JButton("=");
    private JButton btnClear = new JButton("Clear");


    public ControllerGUI(){
        //Frame Attributes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
        frame.setSize(400,550);
        frame.setLayout(null);

        //textScreen Attributes
        textScreen.setSize(380,100);
        textScreen.setLocation(7,5);
        textScreen.setEditable(false);


        button0.setSize(100,50);
        button0.setLocation(100,300);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textScreen.append("0");
            }
        });
        button1.setSize(100,50);
        button1.setLocation(200,300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textScreen.append("1");
            }
        });

        btnDivide.setSize(50,50);
        btnDivide.setLocation(310,150);
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textScreen.append("/");
            }
        });

        btnMultiply.setSize(50,50);
        btnMultiply.setLocation(310,200);
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textScreen.append("*");
            }
        });

        btnAdd.setSize(50,50);
        btnAdd.setLocation(310,250);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textScreen.append("+");

            }
        });

        btnSubtract.setSize(50,50);
        btnSubtract.setLocation(310,300 );
        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textScreen.append("-");

            }
        });

        btnSquare.setSize(50,50);
        btnSquare.setLocation(310,350);
        btnSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textScreen.append("x²");
            }
        });

        btnRoot.setSize(50,50);
        btnRoot.setLocation(310,400);
        btnRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnRoot.isSelected());
                strNum1 = statement[0];
                strNum2 = statement[1];
                doubleNum = Double.parseDouble(strNum1);
                totalVal = Math.sqrt(doubleNum);
                strTotal = Double.toString(totalVal);
                textScreen.setText(strTotal);

            }
        });

        btnClear.setSize(100,50);
        btnClear.setLocation(30,150);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnClear.isSelected());
                textScreen.setText("");
            }
        });

        btnToggle.setSize(100,50);
        btnToggle.setLocation(30,200);
        btnToggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnEqual.setSize(50,50);
        btnEqual.setLocation(310,460);
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textScreen.getText().contains("/")) {
                    statement = textScreen.getText().split("\\/");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 / num2;
                    strTotal = Integer.toString(totalValue);
                    textScreen.setText(strTotal);

                }
                if(textScreen.getText().contains("+")) {
                    statement = textScreen.getText().split("\\+");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 + num2;

                    strTotal = Integer.toString(totalValue);
                    textScreen.setText(strTotal);
                }
                if(textScreen.getText().contains("*")) {
                    statement = textScreen.getText().split("\\*");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 + num2;

                    strTotal = Integer.toString(totalValue);
                    textScreen.setText(strTotal);
                }
                if(textScreen.getText().contains("-")) {
                    statement = textScreen.getText().split("\\-");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 - num2;

                    strTotal = Integer.toString(totalValue);
                    textScreen.setText(strTotal);
                }
            }
        });


        //add Objects to Screen
        frame.add(textScreen);
        frame.add(button0);
        frame.add(button1);
        frame.add(btnDivide);
        frame.add(btnMultiply);
        frame.add(btnAdd);
        frame.add(btnSubtract);
        frame.add(btnRoot);
        frame.add(btnSquare);
        frame.add(btnEqual);
        frame.add(btnClear);
        frame.add(btnToggle);

    }
    public static void main(String [] args){
        new ControllerGUI();
    }
}

