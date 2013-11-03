import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class SwingApp extends JFrame {
    private static String a[];
    private String title = "First App";
    private String buttonLabel = "It's a button";

    public SwingApp() {
        initUI();
    }

    public SwingApp(String title, String buttonLabel) {
        this.title = title;
        this.buttonLabel = buttonLabel;
        initUI();
    }

    private void initUI() {

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);
        panel.setToolTipText("A Panel container");

        JButton btn = new JButton(buttonLabel);
        btn.setBounds(100, 60, 100, 30);
        btn.setToolTipText("A Button component");

        panel.add(btn);

        setTitle(title);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        if (args.length >= 2) {
            a = args;
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    SwingApp ex = new SwingApp(a[0], a[1]);
                    ex.setVisible(true);
                }
            });
        } else {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    SwingApp ex = new SwingApp();
                    ex.setVisible(true);
                }
            });
        }
    }
}