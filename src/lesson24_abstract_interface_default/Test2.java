package lesson24_abstract_interface_default;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 =new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();

    }
}

abstract class Figura {
 
    int kolichestvoStoron = 0;
    abstract  void perimetr();
    abstract  void ploshad ();
    void showInfo (){
        System.out.println("Eto figura");
    }


}
class Kvadrat extends Figura{

    int kolichestvoStoron = 4;
    int storona1 = 10;
    public void perimetr () {
        System.out.println("Perimetr kvadrata = " + 4*storona1);
    }
    public void ploshad () {
        System.out.println("Pploshad kvadrata = " +  storona1*storona1);
    }

}
class Pryamougolnik extends Figura{
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;
    public void perimetr () {
        System.out.println("Perimetr Pryamougolnika = " + 4*(storona1+storona2));
    }
    public void ploshad () {
        System.out.println("Pploshad Pryamougolnika = " +  storona1*storona1);
    }

}
class Okrujnost extends Figura{
    int radius = 3;

    public void perimetr () {
        System.out.println("Perimetr Okrujnosti = " + 2*3.14*radius);
    }
    public void ploshad () {
        System.out.println("Pploshad Okrujnosti = " +   3.14*radius*radius);
    }

}

abstract class Chetirexugolnik extends Figura{
    void def () {
        System.out.println("eto Chetirexugolnik");
    }
}