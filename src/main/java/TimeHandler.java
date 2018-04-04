import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeHandler {

    public TimeHandler() {
    }


    public ZonedDateTime getTime(City city) {

        Set<String> zones = ZoneId.getAvailableZoneIds();

        ZonedDateTime zonedDateTime;

        if (!zones.contains(city.getTimeZone())) {

            String cityZoneName = changeNameToZone(city.getName()).toLowerCase();

            String zoneName = "";
            for (String zone : zones) {
                if (zone.toLowerCase().endsWith(cityZoneName)) {
                    zoneName = zone;
                }
            }

            if (!zoneName.equals("")) {
                zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneName));
            } else {
                zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT"));
            }


        } else {
            zonedDateTime = ZonedDateTime.now(ZoneId.of(city.getTimeZone()));
        }


        return zonedDateTime;
    }


    private String changeNameToZone(String name) {
        String trimmedName = name.trim();

        return trimmedName.replace(" ", "_");
    }


}
