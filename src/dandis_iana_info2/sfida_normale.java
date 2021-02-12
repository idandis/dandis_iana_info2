package dandis_iana_info2;

import prog.utili.Orario;

public class sfida_normale extends sfida {

	String luogoSfida;
	
	public sfida_normale(String descrizione, Orario ora, String nomePartecipanti, Validita val, String ID, String LuogoSfida) {
		super(descrizione, ora, nomePartecipanti, val, ID);
		this.luogoSfida = LuogoSfida;
		
	}
	public sfida_normale(String descrizione, Orario ora, String nomePartecipanti, Validita val) {
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
		int prima = 200;
		int dopo = 300;
		Orario ora1 = new Orario(12, 00);
		if (ora.isMinore(ora1)) 
		return prima;
		     else
			  return dopo;
}
	public String toString () {
		return "ID: "+ ID + "descrizione: " + descrizione + "ora: " + ora + "luogo della sfida: " + luogoSfida;
	}
}
