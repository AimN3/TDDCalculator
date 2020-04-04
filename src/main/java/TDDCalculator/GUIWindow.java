package TDDCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUIWindow extends JFrame implements ActionListener, KeyListener, Calculable {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;


    public static void call() {
        SwingUtilities.invokeLater(() -> new GUIWindow());
    }

    private final JTextArea wow = new JTextArea();
    private final JTextField calculator = new JTextField("Calculator");
    private final JTextField fieldInput = new JTextField();


    private GUIWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null); //окно будет посередине
        setAlwaysOnTop(true); //окно всегда будет сверху

        wow.setEditable(false);
        wow.setLineWrap(true);
        add(wow, BorderLayout.CENTER);

        fieldInput.addActionListener(this);
        fieldInput.addKeyListener(this);
        add(fieldInput, BorderLayout.SOUTH);
        add(calculator, BorderLayout.NORTH);

        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = fieldInput.getText();
        System.out.println(msg);
        if (msg.equals("")) return;

        fieldInput.setText(null);


}


    @Override
    public int calculate() {
        return 0;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("Эвент вызван");
            calculate();
        }
    }
}



