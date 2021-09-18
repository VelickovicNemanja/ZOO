package Zivotinje_domaci_zadatak;

public class Glavna {

	public static void main(String[] args) {

		Sisari1 medved = new Sisari1("Kicmenjaci", "Medved", "Meso", "Braon", "Svastojed", "Divlja zivotinja");

		medved.stampaj(); // jedan sisar stampa

		medved.setCovekovaPodela("Domaca zivotinja"); // zamena uloge

		System.out.println("------------------------");

		medved.stampaj(); // posle izmene stampa

		System.out.println("------------------------");

		Ribe1 stuka = new Ribe1("Kicmenjaci", "Stuka", "Mesojed", "Slatka voda", 4, "Neparna peraja");
		stuka.stampaj(); // jedna riba

		System.out.println("------------------------");

		Staniste bara = new Staniste("Jezero");

		bara.setListaZivotinja(medved);
		bara.setListaZivotinja(stuka);

		bara.stampaj(); // jedno staniste sa listom ?

	}

}
