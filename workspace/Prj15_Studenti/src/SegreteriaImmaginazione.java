import java.util.List;

import controller.RegistroCtrl;
import model.Registro;
import model.Studente;
import util.Segreteria;

public class SegreteriaImmaginazione {

	public static void main(String[] args) {

		Registro r = new Registro("JavaGol");  
		RegistroCtrl ctrl = new RegistroCtrl(r);

		List<Studente> studenti = Segreteria
									.leggiFileRitornaStudenti("files/studenti.txt");
		
		for (Studente studente : studenti) {
			ctrl.addStudente(studente);
		}

//		System.out.println(ctrl.getStudenti());

		List<Studente> presenti = ctrl.faiAppello();
		
		System.out.println("sono presenti:");
		for (Studente studente : presenti) {
			System.out.println(studente);
		}
		
	}

}


