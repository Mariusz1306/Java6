package Main;

import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Sixth {

    public static void main(String[] args) {
        Osoba os1 = new Osoba("Mariusz", "Czajkowski", "Piękna 34", 48, 796012131);
        Firma frm1 = new Firma("Marius", "Piękna 34", 48, 730262026);
        os1.opis();
        frm1.opis();
        TreeMap<String, Wpis> tree = new TreeMap<String, Wpis>();
        tree.put(os1.getNumer(), os1);
        tree.put(frm1.getNumer(), frm1);
        System.out.println("TreeMap: ");
        for(Map.Entry<String, Wpis> entry:tree.entrySet()){
            String key=entry.getKey();
            Wpis value=entry.getValue();
            System.out.println(key+" Details:");
            value.opis();
        }
        System.out.println("TreeMap w/ Iterator: ");
        Set keys = tree.keySet();
        for (Iterator i = keys.iterator(); i.hasNext();) {
            String key = (String) i.next();
            Wpis value = tree.get(key);
            System.out.println(key + ": ");
            value.opis();
        }
    }
}
