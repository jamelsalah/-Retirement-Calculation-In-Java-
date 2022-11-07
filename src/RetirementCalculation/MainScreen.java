package RetirementCalculation;

import java.awt.*;
import javax.swing.*;

public class MainScreen extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//PANELS
	JPanel mainScreen = new JPanel();
	JPanel mainContainer = new JPanel();
	JPanel titleContainer = new JPanel();
	JPanel labelContainer = new JPanel();
	JPanel textFieldContainer = new JPanel();
	JPanel resultContainer = new JPanel();
	JPanel buttonContainer = new JPanel();
	
	//BUTTONS
	JButton submitButton = new JButton("Calcular");
	
	//LABELS
	JLabel title = new JLabel("Calcula Aposentadoria");
	JLabel label1 = new JLabel("Código Cadastro");
	JLabel label2 = new JLabel("Ano Nascimento");
	JLabel label3 = new JLabel("Ano Ingresso");
	JLabel resultTitle = new JLabel("Aposentadoria: ");
	JLabel resultValue = new JLabel("  ");
	
	//TEXT FIELDS
	JTextField codeField = new JTextField(8);
	JTextField yearBornField = new JTextField(8);
	JTextField yearEntryField = new JTextField(8);
	
	//FONTS
	Font f1 = new Font("Calibri", Font.BOLD, 35);
	Font f2 = new Font("Calibri", Font.PLAIN, 20);
	
	public MainScreen() {
		super("Calculo Aposentadoria");
		
		setSize(500, 300);
		setLocation(150, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		mainScreen.setLayout(new BoxLayout(mainScreen, BoxLayout.PAGE_AXIS));
		mainScreen.setBackground(Color.white);
		
		setVisible(true);
		
		title.setFont(f1);
		title.setForeground(Color.black);
		label1.setFont(f2);
		label1.setForeground(Color.black);
		label2.setFont(f2);
		label2.setForeground(Color.black);
		label3.setFont(f2);
		label3.setForeground(Color.black);
		resultTitle.setFont(f2);
		resultValue.setForeground(Color.black);
		resultValue.setFont(f2);
		resultValue.setForeground(Color.black);
		
		titleContainer.add(title);
		titleContainer.setBackground(Color.white);
		
		labelContainer.setLayout(new BoxLayout(labelContainer, BoxLayout.Y_AXIS));
		labelContainer.add(label1);
		labelContainer.add(Box.createRigidArea(new Dimension(5, 10)));
		labelContainer.add(label2);
		labelContainer.add(Box.createRigidArea(new Dimension(5, 10)));
		labelContainer.add(label3);
		labelContainer.setBackground(Color.white);
		
		codeField.setPreferredSize( new Dimension( 8, 27 ) );
		yearBornField.setPreferredSize( new Dimension( 8, 27 ) );
		yearEntryField.setPreferredSize( new Dimension( 8, 27 ) );
		
		textFieldContainer.setLayout(new BoxLayout(textFieldContainer, BoxLayout.Y_AXIS));
		textFieldContainer.add(codeField);
		textFieldContainer.add(Box.createRigidArea(new Dimension(5, 10)));
		textFieldContainer.add(yearBornField);
		textFieldContainer.add(Box.createRigidArea(new Dimension(5, 10)));
		textFieldContainer.add(yearEntryField);
		textFieldContainer.setBackground(Color.white);
		
		resultContainer.setLayout(new BoxLayout(resultContainer, BoxLayout.Y_AXIS));
		resultContainer.add(resultTitle);
		resultContainer.add(resultValue);
		resultContainer.setBackground(Color.white);
		
		buttonContainer.add(submitButton);
		buttonContainer.setBackground(Color.white);
		
		mainContainer.add(labelContainer);
		mainContainer.add(textFieldContainer);
		mainContainer.add(Box.createRigidArea(new Dimension(20, 20)));
		mainContainer.add(resultContainer);
		mainContainer.setBackground(Color.white);
		
		submitButton.addActionListener(new Action(yearBornField, yearEntryField, resultValue));
		
		mainScreen.add(titleContainer);
		mainScreen.add(mainContainer);
		mainScreen.add(buttonContainer);
		
		add(mainScreen);
	}
	
}

