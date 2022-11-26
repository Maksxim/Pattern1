package by.tms.project.work2;

public class SuperPhoneFactory extends PhoneFactory{

    public Phone createPhone(){
        return new SuperPhone();
    }
}
