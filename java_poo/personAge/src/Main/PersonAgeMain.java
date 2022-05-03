package Main;

import Entitys.PersonAge;
import Services.PersonAgeServices;

public class PersonAgeMain {
    public static void main(String[] args) {
        PersonAgeServices ps = new PersonAgeServices();
        PersonAge p1 = ps.createPerson();

    }
}
