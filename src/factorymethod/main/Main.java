package factorymethod.main;

import factorymethod.FactoryBrancardier;
import factorymethod.FactoryMedic;
import factorymethod.PersonalSpital;

import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        FactoryMedic factoryMedic = new FactoryMedic();
        FactoryBrancardier factoryBrancardier = new FactoryBrancardier();

        List<PersonalSpital> lista = new ArrayList<>();
    }


}
