package by.tms.project.work2;

public class Main {

    public static void main(String[] args) {
        PhoneFactory basicFactory = new BasicPhoneFactory();
        PhoneFactory superFactory = new SuperPhoneFactory();

        Phone basicPhone = basicFactory.createPhone();
        Phone superPhone = superFactory.createPhone();

        System.out.println(basicPhone);
        System.out.println(superPhone);
    }
}
