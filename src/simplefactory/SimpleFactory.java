package simplefactory;

import java.util.ArrayList;
import java.util.List;

public class SimpleFactory {

    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume) {
        switch(tipPersonal) {
            case Medic:
            {
                return new Medic(nume);
            }
            case Asistent: return new Asistent(nume);
            case Brancardier: return new Brancardier(nume);
            default: return null;
        }
    }

    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, int anVechime) {
        switch(tipPersonal) {
            case Anestezist: return new Anestezist(nume, anVechime);
            default: return createPersonal(tipPersonal, nume);

    }
}



}
