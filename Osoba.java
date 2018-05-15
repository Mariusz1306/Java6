package Main;

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
        System.out.println("Numer Telefonu: " + getNumer());
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

    public String getNumer() {
        return Numer.getNumer();
    }
}
