package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class C08_DateTimeException {
    public static  void main(String[] args) {
      //  LocalDate date = LocalDate.of(2022, 11, 33);//RTE ->DateTimeException
        try {
            LocalDate date = LocalDate.of(2022, 11, 33);
            System.out.println("bunu okduysan hata yok");

        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
            System.out.println("agam kasım 33 çeker mi");
        }
        System.out.println("agam sorun handle edildi");
    }
}