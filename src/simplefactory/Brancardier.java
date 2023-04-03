package simplefactory;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getNume() + "este brancardier hau");
    }
}
