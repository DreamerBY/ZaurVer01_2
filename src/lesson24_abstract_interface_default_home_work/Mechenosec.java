package lesson24_abstract_interface_default_home_work;

public class Mechenosec extends Fish{
    Mechenosec (String name){
        super(name);
        this.name = name;
    }

    public void swim (){
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }
    public void eat(){ //связанная проблема
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    };


}
