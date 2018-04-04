
public class Application {

    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        MessageServiceImpl messageResource = new MessageServiceImpl();

        City city = dataReader.readCity();

        System.out.println(messageResource.getMessage(city));


    }


}
