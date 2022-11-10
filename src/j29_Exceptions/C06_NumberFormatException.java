package j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        //NumberFormatException-:sayı formatında olmayan bir datayı parseInt() method run ederek ınteger a cevrildiğinde
        //java da String içindeki rakam karakterler parseInt () method ile int değere atanbilir
        String str="1453";
        System.out.println(str+5);//14535->concat edilir
       int sayı= Integer.parseInt(str);//str deki rakam sayı variable ye atandı
        System.out.println(sayı);//1453
        System.out.println(sayı+5);//1458

        String id="57l622";
      //  System.out.println(Integer.parseInt(id));//NumberFormatException
        try {
            System.out.println(Integer.parseInt(id));
            System.out.println("agam try block da bu yazıyı okuduysan  exce. fırlatmadı komut sorunsuz");

        }catch (NumberFormatException e) {
            System.out.println("agam l den 1 yazmamı istiyorsun");
            System.out.println("agam catch block da bu yazıyı okuduysan  exce. fırlatmadı komut sorunsuz");

        }



        System.out.println("agam sorun handle eildi devamkee");

    }
}
