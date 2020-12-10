package O5;

public class WebDokument {
String url;
String[] ord;

public WebDokument(String url, String innhold) {
	this.url = url;
	this.ord = delOpp(innhold);
	
}

public boolean finnes(String søkeord) {
	for(int i = 0; i <= ord.length; i++) {
		if (ord[i] == søkeord) {
			return true;
		}
	}
	return false;
}

public int frekvens(String søkeord) {
	int k = 0; //Teller
	for(int i = 0; i <= ord.length; i++) {
		if (ord[i] == søkeord) {
			k = k +1;
		}
}
	return k;
}

public String GetUrl() {
	return url;
}

}
