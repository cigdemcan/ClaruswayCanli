package j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        //LocalTIME ->saat dakika saniye tutar
        LocalTime suAn=LocalTime.now();//sistemde anlık zaman bilgisi
        System.out.println("suAn = " + suAn);
        System.out.println("suAn.getHaur = " + suAn.getHour());
        System.out.println("suAn.getMinute = " + suAn.getMinute());
        System.out.println("suAn.getNano = " + suAn.getNano());
        System.out.println("suAn.getSecond = " + suAn.getSecond());

        LocalTime time1=LocalTime.of(13,43,34);//belirli saat dakika saniye atandı
        //belirli zamandaileri geri zamana gidilebilir
        System.out.println("time1.plusMinutes(90) = " + time1.plusMinutes(90));
        System.out.println("time1.plusMinutes(150) = " + time1.plusMinutes(150));
        System.out.println("time1.mınusHours(23) = " + time1.minusHours(23));
        System.out.println("time1.mınusMinutes(100).plusHours(2) = " + time1.minusMinutes(100).plusHours(2));

        LocalTime forBası=LocalTime.now();
        System.out.println("forBası = " + forBası.getNano());
        int sayı=0;
        for (int i = 0; i < 100000; i++) {
            sayı +=i;
        }
        LocalTime forSonu=LocalTime.now();
        System.out.println("forSonu.getNano() = " + forSonu.getNano());

        System.out.println(forSonu.getNano() - forBası.getNano());

    }
}
