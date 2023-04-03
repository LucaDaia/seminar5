package simplefactory;

public class Anestezist extends PersonalSpital{

    private int anVechime;
    public Anestezist(String nume, int anVechime) {
        super(nume);
        this.anVechime = anVechime;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Anestezistul " + super.getNume() + " are " + this.anVechime + " vechime!");
    }
}
