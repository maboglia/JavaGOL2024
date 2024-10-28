package veicoli;

public class AutoElettrica extends Automobile {

	protected int durataBatteria;
	
	public AutoElettrica(String marca, String modello, int cilindrata, int prezzo) {
		super(marca, modello, cilindrata, prezzo);
		// TODO Auto-generated constructor stub
		
		this.durataBatteria = 600;
		
	}

	public int getDurataBatteria() {
		return durataBatteria;
	}

	public void setDurataBatteria(int durataBatteria) {
		this.durataBatteria = durataBatteria;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"AutoElettrica [durataBatteria=" + durataBatteria + "]";
	}
	
	

}
