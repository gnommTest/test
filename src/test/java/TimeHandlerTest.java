import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class TimeHandlerTest {

    @Test
    public void getTime() {
        TimeHandler timeHandler = new TimeHandler();

        City city = new City("New Yorker", "");

        ZonedDateTime dateTime = timeHandler.getTime(city);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("\n ======================= \n");
        System.out.println(dateTime.format(formatter));
        System.out.println("\n ======================= \n");


        Assert.assertEquals(ZonedDateTime.now(ZoneId.of("GMT")).withSecond(0).withNano(0),
                dateTime.withSecond(0).withNano(0));

    }
}