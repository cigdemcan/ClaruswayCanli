package j24_AccessModifier.farklıPackage;

import j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {
    private  String privateTeamLed="Hakan Aydın";
    String defaultName="cebrail bey";
    protected String publicName="Gamze Hanım";

    public static void main(String[] args) {
        C01_AccessModifier obj9=new C01_AccessModifier(23,63);//public cons.
        System.out.println("obj9.publicYas = " + obj9.publicYas);//public variable
       // obj9.defaultYas//default variable packege dişi erişlemez
        //obj9.protectedMethod()//protected method packege dışı call edilemez
    }
}
