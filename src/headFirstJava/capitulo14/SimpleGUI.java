package headFirstJava.capitulo14;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;

public class SimpleGUI implements ActionListener{
    private JButton button;

    public static void main(String[] args) {
        SimpleGUI gui = new SimpleGUI();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me");

        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
    }

    }
        

