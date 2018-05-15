import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

class NrTelefoniczny implements Comparable<NrTelefoniczny>{
    Integer nrkierunkowy, nrTelefonu;

    NrTelefoniczny(int nrkierunkowy, int nrTelefonu){
        this.nrkierunkowy = nrkierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    public int getNrkierunkowy() {
        return nrkierunkowy;
    }

    public int getNrTelefonu() {
        return nrTelefonu;
    }

    String getNumer(){
        return "+" + getNrkierunkowy() + " " + getNrTelefonu();
    }

    @Override
    public int compareTo(NrTelefoniczny compare) {
        return Integer.compare(Integer.parseInt(getNumer()), Integer.parseInt(compare.getNumer()));
    }
}

abstract class Wpis{
    abstract void opis();
}

class Firma extends Wpis {
    String Nazwa, Adres;
    NrTelefoniczny Numer;

    Firma(String NazwaFirmy, String AdresFirmy, int nrkierunkowy, int nrtelefonu){
        this.Nazwa = NazwaFirmy;
        this.Adres = AdresFirmy;
        this.Numer = new NrTelefoniczny(nrkierunkowy, nrtelefonu);

    }


    @Override
    void opis() {
        System.out.println("Opis firmy:");
        System.out.println("Nazwa: " + getNazwa());
        System.out.println("Adres: " + getAdres());
        System.out.println("Numer: " + getNrTelefonu());
    }

    public String getNazwa() {
        return Nazwa;
    }

    public String getAdres() {
        return Adres;
    }

	public String getNumer() {
        return Numer.getNumer();
    }

	public String getNrTelefonu() {
        return Integer.toString(Numer.getNrTelefonu());
    }
}

class Osoba extends Wpis {
    String Imie, Nazwisko, Adres;
    NrTelefoniczny Numer;

    Osoba(String ImieOsoby, String NazwiskoOsoby, String AdresOsoby, int nrkierunkowy, int nrtelefonu){
        this.Imie = ImieOsoby;
        this.Nazwisko = NazwiskoOsoby;
        this.Adres = AdresOsoby;
        this.Numer = new NrTelefoniczny(nrkierunkowy, nrtelefonu);
    }

    @Override
    void opis() {
        System.out.println("Opis osoby:");
        System.out.println("Imie i nazwisko: " + getImie() + " " + getNazwisko());
        System.out.println("Adres: " + getAdres());
        System.out.println("Numer Telefonu: " + getNrTelefonu());
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getAdres() {
        return Adres;
    }

    public String getNrTelefonu() {
        return Integer.toString(Numer.getNrTelefonu());
    }

	public String getNumer() {
        return Numer.getNumer();
    }
}

public class Sixth {

    public static void main(String[] args) {
        Osoba os1 = new Osoba("Mariusz", "Czajkowski", "Piękna 34, Lodz", 48, 796111111);
		Osoba os2 = new Osoba("Jan", "Kowalski", "Mokra 67, Krakow", 49, 456712356);
		Osoba os3 = new Osoba("Pawel", "Nowak", "Nowomiejska, Warszawa", 48, 154976123);
        Firma frm1 = new Firma("Ju", "Stala 0, Antoniew", 48, 730222222);
		Firma frm2 = new Firma("Macrohard", "Kiel 2, Rabien", 47, 159753456);
		Firma frm3 = new Firma("Swistaki i spolka", "Walcowa 1234, Rudzielce", 48, 789456123);
        TreeMap<String, Wpis> tree = new TreeMap<String, Wpis>();
        tree.put(os1.getNumer(), os1);
		tree.put(os2.getNumer(), os2);
		tree.put(os3.getNumer(), os3);
        tree.put(frm1.getNumer(), frm1);
        tree.put(frm2.getNumer(), frm2);
        tree.put(frm3.getNumer(), frm3);

        System.out.println("TreeMap w/ Iterator: ");
        Set keys = tree.keySet();
        for (Iterator i = keys.iterator(); i.hasNext();) {
            String key = (String) i.next(); //bez rzutowania!
            Wpis value = tree.get(key);
            System.out.println(key + ": ");
            value.opis();
        }
    }
}

//oddzielne pliki class
