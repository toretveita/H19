package H19;

public class Multibillett extends Bilett{
	
	int antall;

	public Multibillett(int antall, int soner) {
		super(soner);
		this.antall = antall;
	}

	public boolean aktiver(int sone) {
		Status Vstatus = GetStatus();
		if (Vstatus == Status.IKKEAKTIV || antall > 0) {
			SetStatus(Status.AKTIV);
			antall = antall-1;
			return true;
		}
		return false;
	}
	
	public Bilett[] konverter() {
		Bilett[] BArray = new Bilett[antall];
		for (int i = 0; i <= BArray.length; i++) {
			BArray[i] = new Bilett(GetSoner());
			
		}
		return BArray;
	}
}
