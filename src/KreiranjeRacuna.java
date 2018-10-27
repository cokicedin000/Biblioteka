
public class KreiranjeRacuna {
    
    private int brojRacuna;
	private String imeKorisnika;
	private int brojKnjiga;

	KreiranjeRacuna() {

	}

	public KreiranjeRacuna(int brojRacuna, String imeKorisnika) {
		this.brojRacuna = brojRacuna;
		this.imeKorisnika = imeKorisnika;
	}

	public KreiranjeRacuna(int brojRacuna, String imeKorisnika, int brojKnjiga) {
		this(brojKnjiga, imeKorisnika);
		this.brojKnjiga = brojKnjiga;
	}

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getIme() {
		return imeKorisnika;
	}

	public void setIme(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}

	public int getBrojKnjiga() {
		return brojKnjiga;
	}

	public void setBrojKnjiga(int brojKnjiga) {
		this.brojKnjiga = brojKnjiga;
	}
}
