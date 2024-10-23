package condizioni;

public class ProvaSwitch {

	public static void main(String[] args) {

		int mese = 7;
		
		switch(mese) {
			case 1,2,3:
			System.out.println("Primo trimestre");
			break;
			case 4,5,6:
			System.out.println("Secondo trimestre");
			break;
			case 7,8,9:
				System.out.println("Terzo trimestre");
			break;
			case 10,11,12:
				System.out.println("Quarto trimestre");
			break;
			default:
				System.out.println("Siamo chiusi");
			
		}

	}

}
