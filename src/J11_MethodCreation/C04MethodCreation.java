package J11_MethodCreation;

public class C04MethodCreation {//motor

    public static void main(String[] args) {
        String name = "haluk";
        C04_MethodDepo.geçmeNotu(24);//depo classtan clas name ile methot call ettik


/*farklı clastan method code create etmek için..
1.method statik->gökteki güneş gibi
2.ClassName.methodName()şeklinde coll edilir
aynı classtaki method doğrudan methodName ile call edilir
 */
        selamVer();

    }//main dışı

    public static void selamVer() {
        System.out.println("agam selamlar devamke");
    }


}
