package objects;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Slf4j
public class Person {


    private String name;
    private String surname;
    private int age;
    private double weight;
    private boolean isHetero;

    public void retrieveInformation() {

        log.info("Name is: {} Surname is: {}", name , surname);
        System.out.println("Name = " + name + "  Surname = " + surname +
                "  Age = " + age + "  weight = " + weight + " isHero = " + isHetero);
    }


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }



}