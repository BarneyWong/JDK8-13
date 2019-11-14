package chapter2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 核心类:
 * LocalDate
 * LocalTime
 * LocalDateTime
 */

public class MainDate {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("今天日期：" + localDate);
        //获取年、月、日
        System.out.println("年:" + localDate.getYear());
        System.out.println("月：" + localDate.getMonth());
        System.out.println("月：" + localDate.getMonthValue());
        System.out.println("日：" + localDate.getDayOfMonth());
        System.out.println("日：" + localDate.getDayOfWeek());
        System.out.println("日：" + localDate.getDayOfYear());
        //加减年份
        localDate = localDate.plusYears(1);
        System.out.println("年+：" + localDate);
        localDate = localDate.minusYears(1);
        System.out.println("年-：" + localDate);
        //日期比较
        System.out.println("isAfter:" + localDate.isAfter(localDate));
        System.out.println("isBefore:" + localDate.isBefore(localDate));
        System.out.println("isEqual:" + localDate.isEqual(localDate));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //日期格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(localDateTime));
        //获取指定的日期时间对象
        LocalDateTime dateTime = LocalDateTime.of(2020,11,11,11,11,11);
        System.out.println(dateTime);
        //时间差
        Duration duration = Duration.between(localDateTime,dateTime);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
    }
}
