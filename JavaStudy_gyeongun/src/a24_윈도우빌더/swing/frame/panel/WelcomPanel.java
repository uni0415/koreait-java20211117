package a24_���������.swing.frame.panel;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import a24_���������.swing.frame.MainController;

public class WelcomPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public WelcomPanel(JPanel mainPanel, CardLayout mainCard) {
		setLayout(null);
		setSize(1000, 600);
		
		JLabel welcomTitle = new JLabel("JAVA \uC2A4\uC719 \uC218\uC5C5");
		welcomTitle.setFont(new Font("���� ���", Font.BOLD, 20));
		welcomTitle.setHorizontalAlignment(SwingConstants.CENTER);
		welcomTitle.setBounds(349, 138, 256, 57);
		add(welcomTitle);
		
		JButton startBtn = new JButton("\uC2DC\uC791\uD558\uAE30");
		startBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "signinPanel");
			}
		});
		startBtn.setBounds(426, 405, 97, 23);
		add(startBtn);

	}
}
