package parking;

import java.net.http.HttpClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
         LocalDateTime enter =
                 LocalDateTime.of(2022,2,23,17,10,25);
         LocalDateTime leave =
                 LocalDateTime.of(2022,2,23,19,45,12);
        Car car = new Car("ATG-0075",enter );
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long)Math.ceil(car.getDuration()/60.0);
        System.out.println(hours);

        //java8
       //java8();

        //   java();

    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(formatter.format(now.plus(Duration.ofDays(3))));
        LocalDateTime other = LocalDateTime.of(2022,10,23,13,18,22);
        System.out.println(other);

    }

    private static void java() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(sdf.format(date));
        String s ="2022/01/01 13:10:00";
        try {
            Date another = sdf.parse(s);

            System.out.println(sdf.format(another));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
