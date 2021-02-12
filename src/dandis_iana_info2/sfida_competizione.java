package dandis_iana_info2;

import prog.utili.Orario;

public class sfida_competizione extends sfida {
		
	int punteggio;
	
	public sfida_competizione(String descrizione, Orario ora, String nomePartecipanti, Validita val, String ID, int punteggio) {
		super(descrizione, ora, nomePartecipanti, val, ID);
		this.punteggio = punteggio;
	}

	public sfida_competizione(String descrizione, Orario ora, String nomePartecipanti, Validita val) {
		super(descrizione, ora, nomePartecipanti, val);
		this.letteraID = "N";
	}

	@Override
	public int compareTo(sfida o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int punteggio() {
		
		return 1000 + punteggio * 500;
	}

}
