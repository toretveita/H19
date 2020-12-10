package O5;

public class MiniGoogle {
	private WebDokument[] websider;
	private int antall = 0;
	 // her kommer koden fra oppgavene


public MiniGoogle(int n) {
	websider = new WebDokument[n];
	
	
}

public void sok(String sokeord) {
	String s = "";
	for(int i = 0; i <= websider.length; i++) {
		if (websider[i].finnes(sokeord)) {
			s = s + websider[i];
		}
	}
	System.out.println(s);
}


public String beste(String sokeord) {
	int k = 0; //teller
	String s = null;
		for(int i = 0; i <= websider.length; i++) {
			if (websider[i].frekvens(sokeord) > k) {
				k = websider[i].frekvens(sokeord);
				s = websider[i].GetUrl();
			}
		}
		return s;		
}

}

