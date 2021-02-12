package dandis_iana_info2;

import prog.utili.Orario;

public class sfide_main {
	
	public static void main (String [] args) throws SfidaNonValida {
	 
		gestore_sfide g1 = new gestore_sfide(); 
		Orario o1 = new Orario ();
		
		// creo sfide 
		sfida s1 = new sfida_normale("videogioco1", o1, "Orlando Furioso", Validita.AMICHEVOLE, "N12", "America" );
		sfida s2 = new sfida_pacifica("videogioco2", o1, "Orlando NonFurioso", Validita.AMICHEVOLE, "P13" );
		
		g1.inserisci_sfida(s1);
		g1.inserisci_sfida(s2);
		g1.stampa_ordine_punti();
	}

}