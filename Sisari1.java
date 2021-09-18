package Zivotinje_domaci_zadatak;

public class Sisari1 extends Kicmenjaci {

	private String bojaDlake;
	private String nacinIshrane;
	private String covekovaPodela;

	public Sisari1(String vrsta, String naziv, String hrana, String bojaDlake, String nacinIshrane,
			String covekovaPodela) {
		super(vrsta, naziv, hrana);
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane;
		this.covekovaPodela = covekovaPodela;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}

	public String getCovekovaPodela() {
		return covekovaPodela;
	}

	public void setCovekovaPodela(String covekovaPodela) {
		this.covekovaPodela = covekovaPodela;
	}

	public void stampaj() {
		System.out.println("Vrsta: " + super.getVrsta() + "\nNaziv: " + super.getNaziv() + "\nHrana: "
				+ super.getHrana() + "\nBoja dlake: " + this.bojaDlake + "\nNacin ishrane: " + this.nacinIshrane
				+ "\nCovekova podela: " + this.covekovaPodela);

	}

}