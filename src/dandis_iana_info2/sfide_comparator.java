package dandis_iana_info2;

import java.util.Comparator;

public class sfide_comparator implements Comparator <sfida> {

	@Override
	public int compare(sfida s1, sfida s2) {
		// TODO Auto-generated method stub
		return Integer.compare(s1.punteggio(), s2.punteggio());
	}

	
}
