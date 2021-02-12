package dandis_iana_info2;

import prog.utili.Orario;

public class sfida_pacifica extends sfida {
	
	
	// costruttore con id passato 
	public sfida_pacifica(String descrizione, Orario ora, String nomePartecipanti, Validita val, String ID) {
		super(descrizione, ora, nomePartecipanti, val, ID);
		
	}
	// costruttore con id assegnato 
	public sfida_pacifica(String descrizione, Orario ora, String nomePartecipanti, Validita val) {
		super(descrizione, ora, nomePartecipanti, val);
		this.letteraID = "P";
	}
	
	@Override
	public int compareTo(sfida arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int punteggio() {
		int amichevole = 10;
		int campionato = 100;
		
		switch (val) {
		case AMICHEVOLE:
			return amichevole;
		case CAMPIONATO:
			return campionato;
		}
			return 0;
	}
		
	
}

