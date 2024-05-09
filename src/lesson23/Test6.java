package lesson23;

public class Test6 {

    
}

class Animal{
    static String showName() {
        return "someAnimal";
    }

    void showInfoAboutAnimal(){
        System.out.println("Name of Animal: " + showName());
    }
}

class Mouse extends Animal {

    void showInfoAboutMouse(){
        System.out.println("Name of Mouse: " + showName());
    }
    static String showName() {
        return "Jerry";
    }

    public static void main(String[] args) {
        Mouse a = new Mouse();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}

