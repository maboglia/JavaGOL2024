import controller.RegistroCtrl;
import model.Registro;
import model.Studente;

public class SegreteriaImmaginazione {

	public static void main(String[] args) {

		Registro r = new Registro("JavaGol");  
		RegistroCtrl ctrl = new RegistroCtrl(r);
		Studente s1 = new Studente("Gianluca", "Parlato");
		Studente s2 = new Studente("Elliot", "Bamawo");

		ctrl.addStudente(s1);
		ctrl.addStudente(s2);
		
		System.out.println(ctrl.getNumeroStudenti());
	}

}
