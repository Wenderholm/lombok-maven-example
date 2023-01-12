package pl.zajavka;

import lombok.*;

@Getter  // dodanie geterów na wszystkie pola
//@Getter(AccessLevel.NONE)// w klasie nie zostanie wygenerowany zaden getter
@Setter // dodanie seterów na wszystkie pola
//@NoArgsConstructor // dodanie kostruktora bezargumentowego
@RequiredArgsConstructor // <- generuje konstruktor dla pól ktore są oznaczone jako @NonNull albo jako final
//@RequiredArgsConstructor(staticName = "init") // <- teraz mozemy towrzyc konstruktor Cat cat2 = Cat.init(4, owner);
@ToString // <- generuje metode toString() jezeli jakiegos pola nie chcemy ujmowac w toSting dodajemy @ToString.Exclude
//@ToString(onlyExplicitlyIncluded = true) // <- jezeli chcemy miec tylko jedną wartość wyświetloną w toString
// to dodajemy onlyExplicitlyIncluded = true przy adnotacji oraz  @ToString.Include przy polu
//@EqualsAndHashCode // <- dodawanie hashCode oraz Equals. jezeli chcemy wykluczyć jakąś jedną wartość z metod
// to wpisujemy @EqualsAndHashCode.Exclude
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // podobnie jak w @ToString mozemy wybrac tylko jedną wartość do
// metody equals oraz hashCode. musimy dodać do pola @EqualsAndHashCode.Include

public class Cat {
//    private @NonNull String name;

//    @ToString.Exclude
//    private String name;
//
//    @ToString.Include
//    private String name;

//    @EqualsAndHashCode.Include
//    private String name;

//   @EqualsAndHashCode.Exclude
//    private String name;

    private String name;

    //    @Getter(value = AccessLevel.NONE) <- zapis ten spowoduje ze nie bedzie na age metody getAge()
    private final Integer age;

    private final Owner owner;

    private String food;

    public Cat(String name, Integer age, Owner owner, String food) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.food = food;
    }

    // @NonNull zabezpieczenie przed wstawieniem wartości null
    public void consume(@NonNull String argToConsume) {
        System.out.println("consuming: " + argToConsume);
    }

// jezeli używmy with to oznacza to ze bedzie sprawdzane dodane nowe imię. jezeli nowe imie jest takie samo to
// bedziemy wskazywali na ten sam objekt "this" jezeli imię będzie imie to zostanie stworzeony nowy obiekt z
//    nowym imieniem a pozostałe wartości zostaną skopiowane
    public Cat withName(String name) {
        return this.name == name ? this : new Cat(name, this.age, this.owner, this.food);
    }
}
