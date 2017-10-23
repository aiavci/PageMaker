import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.GridLayout;
import javax.swing.JEditorPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 438, 266);
		contentPane.add(tabbedPane);
		
		Panel panel_1 = new Panel();
		tabbedPane.addTab("New Page", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblPageTitle = new JLabel("Page Title");
		lblPageTitle.setBounds(0, 0, 203, 68);
		panel_1.add(lblPageTitle);
		
		textField = new JTextField();
		textField.setBounds(208, 19, 208, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPageContent = new JLabel("Page Content");
		lblPageContent.setBounds(0, 73, 203, 68);
		panel_1.add(lblPageContent);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setContentType("html");
		editorPane.setBounds(86, 73, 330, 118);
		panel_1.add(editorPane);
		
		JButton btnSubmit = new JButton("Save Page");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");
				// TODO Create file with page title and page content
			}
		});
		btnSubmit.setBounds(208, 191, 208, 28);
		panel_1.add(btnSubmit);
		
		Panel panel_2 = new Panel();
		tabbedPane.addTab("Manage Pages", null, panel_2, null);
		
	}
}
