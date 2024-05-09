package lesson24_abstract_interface_default_home_work;

public class Pingvin extends Bird{
    public Pingvin(String name){
        super(name);
        this.name=name;
    }


    public void eat(){
        System.out.println("Pingvin lyubit est ribu!");
    };

    public void sleep(){
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    };

    public void fly(){
        System.out.println("Pingvini ne umeyut letat!");
    };

    public void speek(){
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    };


}
