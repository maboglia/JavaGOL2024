package collezionefunzionale;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProvaFunzioni {

	public static void main(String[] args) {

		List<String> note = new ArrayList<>(); 
		
		note.add("do");
		note.add("re");
		note.add("mi");
		note.add("fa");
		note.add("sol");
		note.add("la");
		note.add("si");
		
		Stream.of("do", "re").forEach(System.out::print);
		
//		note
//			.stream()
//			.filter(n -> n.length() == 2)
////			.filter(n -> n.endsWith("i"))
//			.forEach(n -> System.out.println(n));
		
		
//		for (int i = 0; i < note.size(); i++) {
//			System.out.println(note.get(i));
//		}
		
//		for (String nota : note) {
//			System.out.println(note);
//		}
		

	}

}
