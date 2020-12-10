package H19;

public class Enkeltbillett extends Bilett {

	public Enkeltbillett(int soner) {
		super(soner);
		}
	
	public boolean aktiver(int sone) {
		Status Vstatus = GetStatus();
		if (Vstatus == Status.IKKEAKTIV) {
			SetStatus(Vstatus);
			SetSoner(sone);
			return true;
		}
		return false;
	}
}