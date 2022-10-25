package j19_StaticVariable;

public class Task01_Rectangle {/*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
 int width;//instance variable
  int length;

  public Task01_Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int cevre(){//non static
    int cevre=(width+length)*2;
   return cevre;
}
public  int alan(){
    int alan=width*length;
    return alan;
}















}
