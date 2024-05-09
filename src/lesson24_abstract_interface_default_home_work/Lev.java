package lesson24_abstract_interface_default_home_work;

public class Lev extends Mammal{
    Lev (String name){
        super(name);
        this.name = name;
    }

    public void eat(){
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    };


    public void sleep(){
        System.out.println("Bolshuyu chast dnya lev spit!");
    };

    public void run(){
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    };



}
