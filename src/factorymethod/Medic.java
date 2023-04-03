package factorymethod;

import factorymethod.PersonalSpital;

public class Medic extends PersonalSpital {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getNume() + " este medic!");
    }
}
