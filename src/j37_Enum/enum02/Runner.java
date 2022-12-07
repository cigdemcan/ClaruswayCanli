package j37_Enum.enum02;

public class Runner {
    public static void main(String[] args) {
        user kll1=new user();
        kll1.name="ebubekır";
      //  kll1.role=0;
      //  kll1.status =2;
        kll1.yetki=Role.ADMIN;
        kll1.durum=Status.INACTIVE;

        user kll2=new user();
        kll2.name="Fatih Bey";
        kll2.yetki=Role.CUSTOMER;
        kll2.durum=Status.LOGING;
        if (kll1.yetki==Role.ADMIN){
            System.out.println("agam muhur sende sil de silelim");
        }else System.out.println("tee Allam ya admın değil hava 1500 sefıl customer");
        if (kll2.yetki==Role.ADMIN){
            System.out.println("agam muhur sende sil de silelim");
        }else System.out.println("tee Allam ya admın değil hava 1500 sefıl customer");
    }
}
