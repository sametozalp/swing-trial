import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class App {
    public static void main(String[] args) throws Exception {

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        int screenWidth = gd.getDisplayMode().getWidth(); // screen width
        int screenHeight = gd.getDisplayMode().getHeight(); // screen height

        JFrame frame = new JFrame("Deneme");
        int windowWidth = 1100; // Pencere genişliği
        int windowHeight = 800; // Pencere yüksekliği
        int x = (screenWidth - windowWidth) / 2;
        int y = (screenHeight - windowHeight) / 2;

        frame.setBounds(x, y, windowWidth, windowHeight);
        frame.setLayout(new BorderLayout());
        // frame.setSize(100, 100);

        // JButton button = new JButton("Tıkla bakim");
        // button.setSize(10, 10);
        // frame.add(button,BorderLayout.CENTER);

        JLabel welcomTextArea = new JLabel();
        welcomTextArea.setText("Bankacılık sistemimize hoşgeldiniz!");
        frame.add(welcomTextArea);

        frame.setVisible(true);
    }
}
