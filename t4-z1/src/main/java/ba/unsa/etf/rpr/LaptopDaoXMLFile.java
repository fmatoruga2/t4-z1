package ba.unsa.etf.rpr;

import java.io.File;
import java.util.ArrayList;

public class LaptopDaoXMLFile implements LaptopDao{

    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoXMLFile(File file, ArrayList<Laptop> laptopi){};

    @Override
    public void dodajLaptopUListu(Laptop laptop) {

    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {

    }

    @Override
    public void getLaptop(String procesor) {

    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {

    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() {
        return new ArrayList<>();
    }
}
