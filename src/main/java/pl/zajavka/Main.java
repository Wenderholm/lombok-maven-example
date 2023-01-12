package pl.zajavka;

public class Main {
    public static void main(String[] args) {

        Owner owner = new Owner();
        Cat cat = new Cat("burek",4, owner , "ham");

        cat.consume("something to consume ");
//        cat.consume(null);

//        Cat cat2 = new Cat(); // @NoArgsConstructor
        Cat cat2 = new Cat(4, owner); //@RequiredArgsConstructor

//        System.out.println(cat2.toString());

        Cat cat3 = new Cat("Romek", 10, owner, "ham");
        Cat cat4 = cat3.withName("Romek2"); // toworzenie nowego obiektu z nowym imieniem oraz skopiowanymi wartościami
//        age=10, owner=owner, food="ham"

        System.out.println(cat3 == cat4); // sprwadzenie czy to ten sam obiekt
        System.out.println(cat3.getOwner().equals(cat4.getOwner())); // sprawdzenie czy maja tego samego własciciela
    }
}
