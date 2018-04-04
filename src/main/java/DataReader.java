import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataReader {

    private final static Logger logger = Logger.getLogger(DataReader.class);

    public City readCity() {

        City city = new City();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            city.setName(reader.readLine());
            city.setTimeZone(reader.readLine());

            logger.info("Got city with name= " + city.getName() + " and zone= " + city.getTimeZone());
        } catch (IOException e) {
            logger.info(e);
        }

        return city;
    }


}
