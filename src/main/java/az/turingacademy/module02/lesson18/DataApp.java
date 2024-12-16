package az.turingacademy.module02.lesson18;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataApp {

    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(now);
    }
}
