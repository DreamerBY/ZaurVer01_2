package lesson27_exception;

public class Test15 {
void marafon(int temperaturaVozduha, int tempBega) throws PodvernutjNoguException{
  if(tempBega > 12){
    throw new PodvernutjNoguException ("Temp bega bul vusokij " + tempBega);
  }
  if(temperaturaVozduha > 32){
    throw new SveloMishouException ();
  }
  System.out.println("Vu probegali marofon ");
}

  public static void main(String[] args) {
    Test15 t = new Test15();
    try {
      t.marafon(20, 1);
    }catch (PodvernutjNoguException e){
      System.out.println(e.getMessage());
    }
    finally {
      System.out.println("В любом случае вы получите грамот");
    }
  }

}


class PodvernutjNoguException extends Exception{
  PodvernutjNoguException (String message) {
    super(message);
  }
  PodvernutjNoguException () {

  }

}

class SveloMishouException extends RuntimeException{
  SveloMishouException (String message) {
    super(message);
  }
  SveloMishouException () {

  }
}
