import javax.swing.*;

public class GUI {
    protected JFrame frame;
    protected JPanel panel;

    protected JTextArea equationScreen;
    protected JTextArea resultScreen;

    protected JLabel equationText;
    protected JLabel resultText;

    protected JButton btnDivide;
    protected JButton btnMultiply;
    protected JButton btnAdd;
    protected JButton btnSubtract;
    protected JButton btnRoot;
    protected JButton btnSquare;
    protected JButton btnEqual;

    protected JButton btnClear;
    protected JButton btnToggle;
    protected JButton button0;
    protected JButton button1;

    public GUI() {
        setJFrameView();

    }

    private void setJFrameView() {

        frame = new JFrame("Calculator");
        panel  = new JPanel();

        panel.setLayout(null);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,550);

        IntializeJFrameComponents();
        AddJFrameComponents();
        SetComponentsSize();
        SetComponentsLocation();
        SetTextEditableToFalse();

    }

    private void IntializeJFrameComponents(){
        equationScreen = new JTextArea();
        resultScreen = new JTextArea();

        equationText = new JLabel("Equation", JLabel.CENTER);
        resultText = new JLabel("Result", JLabel.CENTER);

        btnDivide = new JButton("/");
        btnMultiply  = new JButton("*");
        btnAdd = new JButton ("+");
        btnSubtract = new JButton("-");
        btnRoot = new JButton("√x");
        btnSquare = new JButton ("x²");
        btnEqual = new JButton("=");

        button0 = new JButton("0");
        button1 = new JButton("1 ");
        btnClear = new JButton("Clear");
        btnToggle = new JButton("Binary/Decimal");
    }

    private void AddJFrameComponents() {
        panel.add(equationScreen);
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
    }

    private void SetComponentsSize() {
        btnEqual.setSize(60,50);
        btnDivide.setSize(60,50);
        btnMultiply.setSize(60,50);
        btnAdd.setSize(60,50);
        btnSubtract.setSize(60,50);
        btnSquare.setSize(60,50);
        btnRoot.setSize(60,50);
        btnClear.setSize(125,50);
        btnToggle.setSize(125,50);
        button0.setSize(125, 50);
        button1.setSize(125,50);
        equationText.setSize(60,60);
        resultText.setSize(60,60);
        equationScreen.setSize(175, 50);
        resultScreen.setSize(175, 50);
    }

    private void SetComponentsLocation(){
        btnEqual.setLocation(310,460);
        btnDivide.setLocation(310,150);
        btnMultiply.setLocation(310,200);
        btnAdd.setLocation(310,250);
        btnSubtract.setLocation(310,300 );
        btnSquare.setLocation(310,350);
        btnRoot.setLocation(310,400);
        btnClear.setLocation(25,150);
        btnToggle.setLocation(160,150);
        button0.setLocation(25, 250);
        button1.setLocation(160, 250);
        equationText.setLocation(2, 40);
        resultText.setLocation(190, 40);
        equationScreen.setLocation(7, 5);
        resultScreen.setLocation(200, 5);
    }

    private void SetTextEditableToFalse() {
        equationScreen.setEditable(false);
        resultScreen.setEditable(false);
    }

}
