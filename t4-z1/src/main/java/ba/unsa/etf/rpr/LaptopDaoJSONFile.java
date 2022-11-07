package ba.unsa.etf.rpr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoJSONFile implements LaptopDao{

    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoJSONFile(){
        file = new File("zadatak1.json");
        laptopi = new ArrayList<>();
    };

    @Override
    public void dodajLaptopUListu(Laptop laptop) {

    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {
        laptopi.add(laptop);
        ObjectMapper mapper = new JsonMapper();
        FileOutputStream fos = new FileOutputStream(file);
        String s = mapper.writeValueAsString(laptopi);
        fos.write(s.getBytes());
        fos.close();
    }

    @Override
    public void getLaptop(String procesor) {

    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {

    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException{
        ObjectMapper mapper = new JsonMapper();
        ArrayList<Laptop> povratnaLista = new ArrayList<>();
        povratnaLista = mapper.readValue(file, new TypeReference<ArrayList<Laptop>>() {});
        return povratnaLista;
    }
}
