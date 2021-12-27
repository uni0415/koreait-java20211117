package a24_À©µµ¿ìºô´õ.swing.frame.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import a24_À©µµ¿ìºô´õ.swing.frame.service.AuthService;
import a24_À©µµ¿ìºô´õ.swing.frame.swing.dto.SigninDto;

public class SigninPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField usernameText;
	private JPasswordField passwordText;
	private AuthService authService;

	public SigninPanel(JPanel mainPanel, CardLayout mainCard) {
		setLayout(null);
		setSize(1001, 600);
		
		authService = new AuthService();
		
		JLabel signinTitle = new JLabel("JAVA \uC2A4\uC719 \uC218\uC5C5");
		signinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		signinTitle.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		signinTitle.setBounds(386, 83, 204, 51);
		add(signinTitle);
		
		JPanel signinItems = new JPanel();
		signinItems.setBackground(Color.WHITE);
		signinItems.setBounds(191, 144, 623, 324);
		add(signinItems);
		signinItems.setLayout(null);
		
		JLabel usernameLabel = new JLabel("\uC544\uC774\uB514");
		usernameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		usernameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameLabel.setBounds(137, 80, 57, 15);
		signinItems.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		passwordLabel.setBounds(113, 142, 81, 15);
		signinItems.add(passwordLabel);
		
		usernameText = new JTextField();
		usernameText.setBounds(232, 73, 234, 36);
		signinItems.add(usernameText);
		usernameText.setColumns(10);
		
		JButton signinBtn = new JButton("\uB85C\uADF8\uC778");
		signinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = usernameText.getText();
				String password = passwordText.getText();
				SigninDto signinDto = new SigninDto();
				signinDto.setUsername(usernameText.getText());
				signinDto.setPassword(passwordText.getText());
				int result = authService.signin(signinDto);
				if(result == 2) {
					//·Î±×ÀÎ ¼º°ø
					mainCard.show(mainPanel, "indexPanel");
				}else if(result == 0) {
					System.out.println("Á¸ÀçÇÏÁö ¾Ê´Â ¾ÆÀÌµð");
				}else if(result == 1) {
					System.out.println("ºñ¹Ð¹øÈ£°¡ ÀÏÄ¡ÇÏÁö ¾ÊÀ½");
				}
			}
		});
		signinBtn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		signinBtn.setBounds(243, 231, 110, 36);
		signinItems.add(signinBtn);
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		passwordText.setBounds(232, 142, 234, 36);
		signinItems.add(passwordText);
	}
}
