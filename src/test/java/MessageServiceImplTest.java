import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MessageServiceImplTest {


    // DEPENDS ON CURRENT DAY TIME
//    @Test
//    public void getMessage() {
//
//        MessageServiceImpl messageServiceImpl = new MessageServiceImpl();
//
//        City city = new City("New York", "");
//
//        System.out.println("Current Locale: " + Locale.getDefault());
//
//        String message = messageServiceImpl.getMessage(city);
//        Assert.assertEquals("Good night " + city.getName()+"!", message);
//
//        System.out.println(message);
//
//        Locale.setDefault(new Locale("ru", "ru"));
//        System.out.println("Current Locale: " + Locale.getDefault());
//
//        String ruMessage = messageServiceImpl.getMessage(city);
//        System.out.println(ruMessage);
//        Assert.assertEquals("Доброй ночи " + city.getName()+"!", ruMessage);
//
//    }

    @Test
    public void getMessageForUnknownCity() {
        MessageServiceImpl messageServiceImpl = new MessageServiceImpl();
        City city = new City("Unknown", "");

        String message = messageServiceImpl.getMessage(city);

        System.out.println(message);

    }
}