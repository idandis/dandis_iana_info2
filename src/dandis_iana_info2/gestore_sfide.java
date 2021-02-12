package dandis_iana_info2;

import java.util.ArrayList;
import java.util.Collections;

import prog.utili.SequenzaOrdinata;

public class gestore_sfide {

	SequenzaOrdinata <sfida> sfide;
	
	public gestore_sfide () {
		sfide = new SequenzaOrdinata <sfida>();
	}
	
	public void inserisci_sfida (sfida s) throws SfidaNonValida  {
		sfide.add(s); 
	}
	// metodo che stampa in ordine dei puunti 
	public void stampa_ordine_punti () {
		System.out.println("lista delle sfide in ordine di punteggio:");
		ArrayList <sfida> sfida1 = new ArrayList <sfida> () ;
		for (sfida s: sfide) {
			sfida1.add(s);
		} 
		Collections.sort(sfida1, new sfide_comparator());
		System.out.println (sfida1) ;
			
		}
	// metodo che stampa in odine di orario le sfide 
	public void stampa_ordine_orario () {
		System.out.println("lista delle sfide in ordine di tempo:");
		for (sfida s: sfide) {
			System.out.println(s);
		}
	}
	
	public void cerca_partecipante (String nome) {
		for (sfida s: sfide) {
			if (s.nomePartecipanti.equals(nome))
			{
				System.out.println ("nome:"+ nome + " trovato nell'elenco dei partecipanti");
			}
		}
	}
	}

