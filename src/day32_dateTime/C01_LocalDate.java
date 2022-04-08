package day32_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh= LocalDate.now(); // objenin olusturuldugu tarihi trh'ye atar
        LocalDate baskatrh= LocalDate.of(1972,1,18);
        // istedigimiz yil ay ve gun dgerlerine gore bize obje olusturur

        System.out.println(trh); // 2022-03-31
        // get'li method'larla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth()); //31
        System.out.println(trh.getDayOfWeek()); //THURSDAY
        System.out.println(trh.getMonthValue()); // 3
        System.out.println(trh.getYear()); //2022

        //bir tarihte istedgimiz kadar ileri veya geri gidebiliriz
        System.out.println(trh.minusWeeks(20)); // 2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022-02-21

        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-01-10

        // Tarih dile gore degis
        LocalDate trhZone= LocalDate.now();
        System.out.println(LocalDate.now().isLeapYear()); // false



    }

}
