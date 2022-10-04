package j04_AritmeticOperators;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//5
        x += x;//10
        --x;//9
        x = 7 + x;//16
        x *= x;//16*16=256
        x -= 3;//256-3=253

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a;//d=d+a 7.5

        a+=d;//a=a+d 3+7.5=7.5
        d-=a;//d=d-a 7.5-10=-2.5
        a-=d;//a=a-d 10--2.5=12

        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
        
        

	}

}
