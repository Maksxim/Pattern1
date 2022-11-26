package by.tms.project.work2;

public class BasicPhoneFactory extends PhoneFactory{

    public Phone createPhone(){
        return new BasicPhone();
    }
}
