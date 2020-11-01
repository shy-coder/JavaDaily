package com.shy.day11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @ClassName LocalDateTest
 * @Description java.time类使用
 * @Author shy
 * @Date 2020/10/30
 **/
public class LocalDateTest {
    public static void main(String[] args) {
        getCurrentTime();
        plusHours();
        nextWeek();
        isLeapYear();
        clock();
        isBeforeOrIsAfter();
        getZoneTime();
        checkCardExpiry();
        isBeforeOrIsAfter();
        calcDateDays();
        formatDate();
    }

    /**
     * 获取当前时间
     */
    public static void getCurrentTime(){
        LocalDate time = LocalDate.now();
        System.out.println("local time now:" + time);
    }

    /**
     * 增加小时
     */
    public static void plusHours(){
        LocalTime time = LocalTime.now();
        //增加两小时
        LocalTime newTime = time.plusHours(2);
        System.out.println("time after 2 hours :" + newTime);
    }

    /**
     * 计算一周后的日期
     */
    public static void nextWeek(){
        LocalDate today = LocalDate.now();
        //使用变量赋值
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Today is :" + today);
        System.out.println("Date after 1 week :" + nextWeek);
    }

    /**
     * 时钟类
     */
    public static void clock(){
        //根据系统时间返回当前时间并设置UTC
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock);
        Clock defaultZone = Clock.systemDefaultZone();
        System.out.println("Clock :" + defaultZone);
    }

    /**
     * 使用YearMonth类处理特定的日期
     */
    public static void checkCardExpiry(){
        YearMonth currentYearMonth = YearMonth.now();
        System.out.printf("Days in month year %s : %d %n",currentYearMonth,currentYearMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2028, Month.FEBRUARY);
        System.out.printf("Your credit card expires on %s %n",creditCardExpiry);
    }

    /**
     * 检查闺年
     */
    public static void isLeapYear(){
        LocalDate today = LocalDate.now();
        if (today.isLeapYear()){
            System.out.println("This year is Leap year");
        }else {
            System.out.println("2018 is not a Leap year");
        }
    }

    /**
     * 如何用Java判断日期是早于还是晚于另一个日期
     */
    public static void isBeforeOrIsAfter(){
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.of(2018, 1, 29);
        if (tomorrow.isAfter(today)){
            System.out.println("Tomorrow comes after today");
        }
        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
        if (yesterday.isBefore(today)){
            System.out.println("Yesterday is day before today");
        }
    }

    /**
     * 获取特定时区下面的时间
     */
    public static void getZoneTime(){
        //设置时区
        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime localDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewTork = ZonedDateTime.of(localDateAndTime, america);
        System.out.println("现在的日期和时间在特定的时区：" + dateAndTimeInNewTork);
    }

    /**
     * 计算两个日期之间的天数和月数
     */
    public static void calcDateDays(){
        LocalDate today = LocalDate.now();
        LocalDate java8Release = LocalDate.of(2018, Month.MAY, 14);
        Period periodToNextJavaRelease = Period.between(today, java8Release);
        System.out.printf("Months left between today and Java 8 release:" + periodToNextJavaRelease);
    }

    /**
     * 使用预定义的格式化工具去解析或格式化日期
     */
    public static void formatDate(){
        String dayAfterTomorrow = "20180210";
        LocalDate formatted = LocalDate.parse(dayAfterTomorrow, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date generated from String %s is %s %n",dayAfterTomorrow,formatted);
    }
}
