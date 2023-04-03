package factorymethod;

public class FactoryBrancardier implements Factory{
    @Override
    public PersonalSpital creeazaPersonal(String nume) {
        return new Brancardier(nume);
    }
}
