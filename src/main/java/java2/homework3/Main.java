package java2.homework3;


public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("88000000001", "Petrov");
        phonebook.add("88000000002", "Ivanov");
        phonebook.add("88000000003", "Sidorov");
        phonebook.add("88000000004", "Muhin");
        phonebook.add("88000000005", "Belov");
        phonebook.add("88000000006", "Ivanov");
        phonebook.add("88000000007", "Smirnova");
        phonebook.add("88000000008", "Pupkin");
        phonebook.add("88000000009", "Torova");
        phonebook.add("88000000010", "Petrov");
        phonebook.add("88000000011", "Ivanov");

        phonebook.display();

        phonebook.get("Petrov");
        phonebook.get("Ivanov");
        phonebook.get("Smirnova");
        phonebook.get("Kochkin");

        Words words = new Words();

        words.words();
    }
}
