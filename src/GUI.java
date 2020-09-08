import javax.swing.*;

public class GUI {
    protected JFrame frame = new   JFrame("Calculator");
    protected JPanel panel = new JPanel();

    protected JTextArea textScreen = new JTextArea();
    protected JTextArea resultScreen = new JTextArea();

    JLabel equationText = new JLabel("Equation", JLabel.CENTER);
    JLabel resultText = new JLabel("Result", JLabel.CENTER);

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

    protected JButton btnRoot = new JButton("√x");
    protected JButton btnSquare = new JButton ("x²");

    protected JButton btnEqual = new JButton("=");
    protected JButton btnClear = new JButton("Clear");

    public GUI() {
        //Frame Attributes
        panel.add(textScreen);
        panel.add(resultScreen);
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
        panel.add(equationText);
        panel.add(resultText);


        panel.setLayout(null);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,550);


        equationText.setLocation(2, 40);
        resultText.setLocation(190, 40);
        equationText.setSize(60,60);
        resultText.setSize(60,60);

        //textScreen Attributes
        textScreen.setSize(175, 50);
        textScreen.setLocation(7, 5);
        textScreen.setEditable(false);

        resultScreen.setSize(175, 50);
        resultScreen.setLocation(200, 5);
        resultScreen.setEditable(false);

        btnEqual.setSize(60,50);
        btnEqual.setLocation(310,460);

        btnDivide.setSize(60,50);
        btnDivide.setLocation(310,150);

        btnMultiply.setSize(60,50);
        btnMultiply.setLocation(310,200);

        btnAdd.setSize(60,50);
        btnAdd.setLocation(310,250);

        btnSubtract.setSize(60,50);
        btnSubtract.setLocation(310,300 );

        btnSquare.setSize(60,50);
        btnSquare.setLocation(310,350);

        btnRoot.setSize(60,50);
        btnRoot.setLocation(310,400);

        btnClear.setSize(125,50);
        btnClear.setLocation(25,150);

        btnToggle.setSize(125,50);
        btnToggle.setLocation(160,150);

        button0.setSize(125, 50);
        button0.setLocation(25, 250);

        button1.setSize(125,50);
        button1.setLocation(160, 250);

    }

    public static void main(String [] args){
        new GUI();
    }
}
