public class Lion extends Animal{
    public Lion(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " rugit.");
    }
}
