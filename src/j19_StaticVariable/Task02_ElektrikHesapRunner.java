package j19_StaticVariable;

public class Task02_ElektrikHesapRunner {
	public static void main(String[] args) {


	Task02_ElektrikHesap fatura1=new Task02_ElektrikHesap();
	fatura1.tuketimEkle(500);
	fatura1.tuketimEkle(300);
		System.out.println("fatura1.toplamTuketım = " + fatura1.toplamTuketım);
		System.out.println("fatura1.odenecekTutar() = " + fatura1.odenecekTutar());
		Task02_Musteri musteri1=new Task02_Musteri("Çagla",fatura1);


}}