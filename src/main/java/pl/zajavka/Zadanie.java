package pl.zajavka;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Zadanie {
    public static void main(String[] args) {

        SneakyThrowsExample sneakyThrowsExample = new SneakyThrowsExample();
        System.out.println(sneakyThrowsExample);
    }
    public static class SneakyThrowsExample {
//        @SneakyThrows
        public static void fileSize(Path path) {
            try {
                System.out.println(Files.size(path));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
//    @RequiredArgsConstructor
    public class Dog {
        private final String name;
        private String surname;
    public Dog(String name) {
        this.name = name;
    }
}

//    @Data
    public class Employee {
        private String name;
        private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
//    @Value
    public final class Employee2 {
        final String name;
        final String surname;

    public Employee2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Objects.equals(name, employee2.name) && Objects.equals(surname, employee2.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
}
