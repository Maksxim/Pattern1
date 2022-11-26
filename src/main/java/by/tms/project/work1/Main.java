package by.tms.project.work1;

import by.tms.project.work1.Person;

public class Main {

    public static void main(String[] args) {
        Person newPerson =  new Person
                .Builder()
                .name("Ivan")
                .surname("Ivanov")
                .age(30)
                .phoneNumber(4352345)
                .build();

        System.out.println(newPerson);

    }
}
