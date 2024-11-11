<%@page import="giochi.PariDispari"%>
<%

String sceltaUmano = null;
String sceltaMacchina = null;
int ditaUmano = 0;
int ditaMacchina = 0;
String valutazioneDita = null;
String risultato = null;

//scelta pari o dispari umano
if (request.getParameter("sceltaUmano") != null){
	
	sceltaUmano = request.getParameter("sceltaUmano");
	
	//pari o dispari
	if (sceltaUmano.equals("pari"))
			sceltaMacchina = "dispari";
		else
			sceltaMacchina = "pari";
	
	//quante dita
	if (request.getParameter("ditaUmano")!=null){
		ditaUmano = Integer.parseInt(request.getParameter("ditaUmano"));
		ditaMacchina = PariDispari.sceltaMacchina();
		valutazioneDita = PariDispari
							.valutaScelte(ditaUmano, ditaMacchina);
		if (sceltaUmano.equals(valutazioneDita)){
			risultato = "Vince umano";
		} else {
			risultato = "Vince macchina";
		}
	}
	
}

%>