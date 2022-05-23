import javax.swing.*;

public class Prueba1  extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton enviarButton;
    private JPanel caja;
    public Prueba1(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(caja);
        setVisible(true);
    }

    public static void main(String[] args) {
        Prueba1 p1 = new Prueba1();
    }
}
