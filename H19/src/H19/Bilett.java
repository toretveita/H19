package H19;

public class Bilett {
	private int soner;
	private Status status;
	private int soneaktivert;
	
	

public Bilett(int soner) {
	this.soner = soner;
	this.status = Status.DEAKTIVERT;
	soneaktivert = 0;
}

public int GetSoner() {
	return soner;
}

public void SetSoner(int soner) {
	this.soner = soner;
}

public Status GetStatus() {
	return status;
}

public void SetStatus(Status status) {
	this.status = status;
}

public int Getsoneaktivert() {
	return soneaktivert;
}

public void SetSoneaktivert(int soneaktivert) {
	this.soneaktivert = soneaktivert;
}

public void deaktiver () {
	this.status = Status.DEAKTIVERT;
}

public boolean aktiver(int sone) {
	soner = sone + soner;
	return true;
	
}

public boolean erGyldig(int sone) {
	if (status == Status.AKTIV && soneaktivert >= sone) {
		return true;
	}
	return false;
}


}

