package week2.day4;

public class Elements extends Button {

	public static void main(String[] args) {

		Elements execute = new Elements();
		TextField text = new TextField();
		CheckBoxButton  check = new CheckBoxButton();
		RadioButton radio = new RadioButton();
		
		execute.click();
		execute.setText("Inheritance");
		execute.submit();
		text.getText();
		execute.submit();
		check.clickCheckButton();
		check.submit();
		radio.selectRadioButton();
		radio.submit();
		
		
		
	}

}
