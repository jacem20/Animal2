public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion("Simba");
        Animal chat = new Chat("Gatous");
        Animal chien = new Chien("Bob");

        chat.faireDuBruit();
        chien.faireDuBruit();
        lion.faireDuBruit();
    }
}