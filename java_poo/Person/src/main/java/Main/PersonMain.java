package Main;

import Entitys.Person;
import Service.PersonService;

public class PersonMain {

    public static void main(String[] args) {
        PersonService ps = new PersonService();
        Person p1 = ps.makeHuman();
        ps.idealWeight(p1, 0, 0);
        ps.over18(p1, 0);
        System.out.println("-------------2--------------");
        Person p2 = ps.makeHuman();
//        ps.idealWeight(p2, 0, 0);
//        ps.over18(p2, 0);
        

    }
}
