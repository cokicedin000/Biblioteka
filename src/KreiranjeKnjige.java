import java.sql.Date;

public class KreiranjeKnjige {
    private int brojKnjige;
	private String imeKnjige;
	private boolean status;
	private Date datumPosudnjivanja;

	KreiranjeKnjige() {

	}

	public KreiranjeKnjige(int brojKnjige, String imeKnjige) {
		this.brojKnjige = brojKnjige;
		this.imeKnjige = imeKnjige;

	}

	public KreiranjeKnjige(int brojKnjige, String imeKnjige, boolean status) {
		this(brojKnjige, imeKnjige);
		this.status = status;
	}

	public int getBrojKnjige() {
		return brojKnjige;
	}

	public void setBrojKnjige(int brojKnjige) {
		this.brojKnjige = brojKnjige;
	}

	public String getImeKnjige() {
		return imeKnjige;
	}

	public void setImeKnjige(String imeKnjige) {
		this.imeKnjige = imeKnjige;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getDatumPosudnjivanja() {
		return datumPosudnjivanja;
	}

	public void setDatumPosudnjivanja(java.util.Date datumPosudjivanja) {
		this.datumPosudnjivanja = (Date) datumPosudjivanja;
	}

	@Override
	public String toString() {
		return "Knjiga [brojKnjige=" + brojKnjige + ", imeKnjige=" + imeKnjige + ", status=" + status
				+ ", datumPosudnjivanja=" + datumPosudnjivanja + "]";
	}
}
