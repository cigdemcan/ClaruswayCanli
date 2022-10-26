package j21_ImmutableClass;

public class C02_OCA_Equals
{ public static void main(String[] args) {
    String a = "";//immutable class variable a
    a += 2;//a="2"
    a += 'c';//a="2c"
    a += false;
    String b="2cfalse";
    System.out.println(b);

    if (a == "2cfalse") {
        System.out.println("==");//sart saglamaz if çalilmaz -> a referansı "2cfalse" atama olmadığı için
    }
    if (a.equals("2cfalse")) {
        System.out.println("equals");

    }
    String x="ali";
    String y="ali";


    if(x==y){
        System.out.println("ahanda referansları aynı havuzda x ve y eşit==");
    }
    //tanımlama atanan değeri a ile aynı havuzda ve referansı olan b variable
    if(a==b){
        System.out.println("ahanda referansları aynı havuzda a ve b eşit==");
}
}}
