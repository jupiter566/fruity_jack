
import javax.swing.*;
import java.awt.*;
public class Hello extends JFrame {
    public static void main(String[] arg) {
		JFrame f = new JFrame ("fenetre du prout");
		f.setDefaultCloseOperation(Hello.EXIT_ON_CLOSE);
		f.setSize(666,333);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		JPanel prout = new JPanel();
		prout.setBackground(Color.BLUE);
		f.setContentPane(prout);
		f.setVisible(true);
		System.out.println("Fin");
	
    }
	
}
