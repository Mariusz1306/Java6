package Main;

class NrTelefoniczny implements Comparable<NrTelefoniczny>{
    int nrkierunkowy, nrTelefonu;

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
