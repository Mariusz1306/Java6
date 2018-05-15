package Main;

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
        System.out.println("Numer: " + getNumer());
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
}
