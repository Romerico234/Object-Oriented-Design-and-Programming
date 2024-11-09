import java.awt.event.ActionEvent;
import javax.swing.*;

public class WindowsButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void render() {
        frame.setTitle("Windows Button");
        button = new JButton("Test Button");
        button.addActionListener((ActionEvent e) -> {
            onClick();
        });

        panel.add(button);
        frame.add(panel);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void onClick() {
        JOptionPane.showMessageDialog(frame, "Click! Button says - 'Hello World!'");
    }
}
