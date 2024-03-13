package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Gender.*;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        List<Person> people = List.of(
                new Person("Jose", Gender.MALE),
                new Person("Lia", FEMALE),
                new Person("Bia", FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Mathew", Gender.MALE)
        );

        // Imperative approach
        System.out.println("\nImperative approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if (FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

        // Declarative approach
        System.out.println("\nDeclarative approach");
        people.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .toList()
                .forEach(System.out::println);

        // Predicate
        System.out.println("\nPredicate");
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.getGender());
        people.stream()
                .filter(personPredicate)
                .toList()
                .forEach(System.out::println);

    }
}
