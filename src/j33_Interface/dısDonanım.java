package j33_Interface;

public interface dısDonanım {
    public void kapı();//abs method
    void kaporta();//abs method
    String RENK="kırmızı";//statıc publıc final varıabla

    public default String sisLamp(){//default cons. method
        return "sisli havada dikkat";
    }
    static void anten() {//statıc cons. method
        System.out.println("agam yıne antın kuntın işlerdesin");
    }
    //dısDonanım obj=new dısDonanım() {

   /* public static void main(String[] args) {
        System.out.println(RENK);
        aga();*/
 //public static default void sorunMethod(){//CTE

}





