package simplefactory.main;

import simplefactory.PersonalSpital;
import simplefactory.SimpleFactory;
import simplefactory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        PersonalSpital personalSpital1 = simpleFactory.createPersonal(TipPersonal.Medic, "Claurentiu");
        PersonalSpital personalSpital2 = simpleFactory.createPersonal(TipPersonal.Brancardier, "Gioni");
        PersonalSpital personalSpital3 = simpleFactory.createPersonal(TipPersonal.Asistent, "Matei");
        PersonalSpital personalSpital4 = simpleFactory.createPersonal(TipPersonal.Anestezist, "Matei", 3);

        personalSpital1.afiseazaDescriere();
        personalSpital2.afiseazaDescriere();
        personalSpital3.afiseazaDescriere();
        personalSpital4.afiseazaDescriere();

        List<PersonalSpital> list = new ArrayList<>();
        list.add(personalSpital1);
        list.add(personalSpital2);
        list.add(personalSpital3);
        list.add(personalSpital4);

        for(PersonalSpital p: list) {
            p.afiseazaDescriere();
        }
    }


}
