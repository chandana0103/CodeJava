package ControlStatements;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int day =3;
		String dayName;
		switch(day) {
		case 1:
			dayName="Today is monday"; break;
		case 2:
			dayName="Today is tuesday"; break;
		case 3:
			dayName="Today is wednesday"; break;
		case 4:
			dayName="Today is thursday"; break;
		case 5:
			dayName="Today is friday"; break;
		case 6:
			dayName="Today is saturday"; break;
		default:
			dayName="Today is monday"; break;	
		
		}
		System.out.println(dayName);

	}

}
