import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    protected JFrame frame = new   JFrame("Calculator");
    protected JPanel panel = new JPanel();

    protected JTextArea textScreen = new JTextArea();

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
    protected JButton btnToggle = new JButton("Binary/Decimal");

    //Add Number Buttons to screen
    protected JButton button0 = new JButton("0");
    protected JButton button1 = new JButton("1 ");


    //Add operator buttons to screens
    protected JButton btnDivide = new JButton("/");
    protected JButton btnMultiply  = new JButton("*");
    protected JButton btnAdd = new JButton ("+");
    protected JButton btnSubtract = new JButton("-");

    protected JButton btnRoot = new JButton("√x ");
    protected JButton btnSquare = new JButton ("x²");

    protected JButton btnEqual = new JButton("=");
    protected JButton btnClear = new JButton("Clear");

    public GUI() {
        //Frame Attributes
        panel.add(textScreen);
        panel.add(button0);
        panel.add(button1);
        panel.add(btnDivide);
        panel.add(btnMultiply);
        panel.add(btnAdd);
        panel.add(btnSubtract);
        panel.add(btnRoot);
        panel.add(btnSquare);
        panel.add(btnEqual);
        panel.add(btnClear);
        panel.add(btnToggle);

        //panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        //panel.setLayout(new GridLayout(0,1));
        panel.setLayout(null);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,550);


        //textScreen Attributes
        textScreen.setSize(380, 100);
        textScreen.setLocation(7, 5);
        textScreen.setEditable(false);


        button0.setSize(100, 50);
        button0.setLocation(100, 300);

        btnEqual.setSize(50,50);
        btnEqual.setLocation(310,460);

        button1.setSize(100,50);
        button1.setLocation(200,300);

        btnDivide.setSize(50,50);
        btnDivide.setLocation(310,150);

        btnMultiply.setSize(50,50);
        btnMultiply.setLocation(310,200);

        btnAdd.setSize(50,50);
        btnAdd.setLocation(310,250);

        btnSubtract.setSize(50,50);
        btnSubtract.setLocation(310,300 );

        btnSquare.setSize(50,50);
        btnSquare.setLocation(310,350);

        btnRoot.setSize(50,50);
        btnRoot.setLocation(310,400);

        btnClear.setSize(100,50);
        btnClear.setLocation(30,150);

        btnToggle.setSize(100,50);
        btnToggle.setLocation(30,200);

        btnEqual.setSize(50,50);
        btnEqual.setLocation(310,460);
    }

    public static void main(String [] args){
        new GUI();
    }
}
