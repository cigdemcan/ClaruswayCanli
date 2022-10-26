package j19_StaticVariable;

public class Task02_ElektrikHesap {/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
    int toplamTuketım;
    double oran=0.7;
    double fatura;





    public int tuketimEkle(int tuketım)
    {
        return toplamTuketım+=tuketım;
    }
    public double odenecekTutar()
    {
        return fatura=toplamTuketım*oran;
   }


}

