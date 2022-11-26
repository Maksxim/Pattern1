package by.tms.project.work1;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int phoneNumber;

    public static class Builder {
        private Person person;

        public Builder(){
            person = new Person();
        }

        public Builder name(String name){
            person.name = name;
            return this;
        }

        public Builder surname(String surname){
            person.surname = surname;
            return this;
        }

        public Builder age(int age){
            person.age = age;
            return this;
        }

        public Builder phoneNumber(int phoneNumber){
            person.phoneNumber = phoneNumber;
            return this;
        }

        public Person build(){
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
