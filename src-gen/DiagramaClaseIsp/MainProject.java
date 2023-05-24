package DiagramaClaseIsp;

import java.util.ArrayList;

public class MainProject {
    public static void main(String[] args) {
        
        Client c = new Client("25-09-2001", "ion@yahoo.ro", "50109250353", "Ionut", "Ionita",23);
        Factura f = new Factura(100, "25-09-2020", ModalitatePlata.CASH, c);
            


    }

    public static ArrayList<Abonament> abonamente = new ArrayList<Abonament>();
}
