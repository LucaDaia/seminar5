package factorymethod;

public class FactoryMedic implements Factory{
    @Override
    public PersonalSpital creeazaPersonal(String nume) {
        return new Medic(nume);
    }
}
