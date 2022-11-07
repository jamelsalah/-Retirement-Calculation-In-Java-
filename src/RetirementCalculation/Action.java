package RetirementCalculation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Action implements ActionListener {
	private JTextField yearBornField;
	private JTextField yearEntryField;
	private JLabel resultLabel;
	
	public Action(JTextField yearBornField, JTextField yearEntryField, JLabel resultLabel) {
		this.yearBornField = yearBornField;
		this.yearEntryField = yearEntryField;
		this.resultLabel = resultLabel;
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		int yearBorn = Integer.parseInt(yearBornField.getText());
		int yearEntry = Integer.parseInt(yearEntryField.getText());
		int yearsOld = 2022 - yearBorn;
		int yearsInCompany = 2022 - yearEntry;
		String result = null;
		
		if(yearsOld >= 65  ||  yearsInCompany >= 30  ||  (yearsOld >= 60  &&  yearsInCompany >= 25)) {
			result = "Requerer";
		} else {
			result = "Não Requerer";
		}
		
		resultLabel.setText(result);
	}
}
