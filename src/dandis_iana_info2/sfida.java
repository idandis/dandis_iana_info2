package dandis_iana_info2;

import prog.utili.Orario;

public abstract class sfida implements Comparable <sfida> {
	
	String letteraID;
	String descrizione;
	Orario ora;
	String nomePartecipanti;
	Validita val;
	final String ID;
	private static int contatoresfide;

// costruttore con id passato come parametro 
public sfida(String descrizione, Orario ora, String nomePartecipanti, Validita val, String ID)
{
	this.descrizione = descrizione;
	this.ora = ora;
	this.nomePartecipanti= nomePartecipanti;
	this.val = val;
	this.ID = ID ;
	
}

// costruttore con id assegnato dal sistema prima lettera + un nuero crescente 

public sfida(String descrizione, Orario ora, String nomePartecipanti, Validita val)
{
	this.descrizione = descrizione;
	this.ora = ora;
	this.nomePartecipanti = nomePartecipanti;
	this.val = val;
	contatoresfide++;
	this.ID = letteraID + contatoresfide;
	
}

public Validita getVal() {
	return this.val;
}
public Orario getOra () {
	return this.ora;
}

public abstract int punteggio();

public void valida () throws SfidaNonValida  {
	Orario ora1 = new Orario(8, 00);
	Orario ora2 = new Orario(22, 00);
	 if (ora.isMaggiore(ora2) && ora.isMinore(ora1)) throw new SfidaNonValida ();	
}

public int compareTo(Orario o) {
	return this.ora.quantoManca(o);
}

public String toString () {
	return "ID: "+ ID + "descrizione: " + descrizione + "ora: " + ora;
}
}