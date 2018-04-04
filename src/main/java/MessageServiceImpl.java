import org.apache.log4j.Logger;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class MessageServiceImpl implements MessageService {

    private static final Logger logger = Logger.getLogger(MessageServiceImpl.class);

    private TimeHandler timeHandler;

    public MessageServiceImpl() {
        this.timeHandler = new TimeHandler();
    }

    @Override
    public String getMessage(City city) {

        ZonedDateTime dateTime = timeHandler.getTime(city);
        logger.info("Time in the current city: " + dateTime.format(DateTimeFormatter.ofPattern("HH:mm")) +
                " and timezone: " + dateTime.getZone());

        String message;

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

        ZonedDateTime six = ZonedDateTime.from(dateTime).withHour(6).withMinute(0);
        ZonedDateTime nine = ZonedDateTime.from(dateTime).withHour(9).withMinute(0);
        ZonedDateTime nineteen = ZonedDateTime.from(dateTime).withHour(19).withMinute(0);
        ZonedDateTime twentyThree = ZonedDateTime.from(dateTime).withHour(23).withMinute(0);

        if (dateTime.isAfter(six) && dateTime.isBefore(nine) || dateTime.isEqual(six)) {
            message = resourceBundle.getString("morning") + " " + city.getName() + "!";
        } else if (dateTime.isAfter(nine) && dateTime.isBefore(nineteen) || dateTime.isEqual(nine)) {
            message = resourceBundle.getString("day") + " " + city.getName() + "!";
        } else if (dateTime.isAfter(nineteen) && dateTime.isBefore(twentyThree) || dateTime.isEqual(nineteen)) {
            message = resourceBundle.getString("evening") + " " + city.getName() + "!";
        } else {
            message = resourceBundle.getString("night") + " " + city.getName() + "!";
        }

        logger.info("Message: " + message);

        return message;
    }


}
