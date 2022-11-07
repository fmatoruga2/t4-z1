package ba.unsa.etf.rpr;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LaptopDao dao = new LaptopDaoJSONFile();
        Laptop l = new Laptop();
        l.setBrend("Asus");
        l.setCijena(700);
        try {
            dao.dodajLaptopUFile(l);
        } catch (IOException e) {
            System.out.println("NEsto nije u redu sa datotekom");
            e.printStackTrace();
        }
    }
}
