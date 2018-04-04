

public class City {
    private String name;

    private String timeZone;

    public City(String name, String timeZone) {
        this.name = name;
        this.timeZone = timeZone;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
