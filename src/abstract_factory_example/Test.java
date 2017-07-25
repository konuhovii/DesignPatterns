package abstract_factory_example;

public class Test {
    public static void main(String[] args) {
        AddressFactory factory = new USAddressFactory();
        USAddress usAddress = (USAddress) factory.createAddress();
        USPhoneNumber usPhoneNum = (USPhoneNumber) factory.createPhoneNumber();
        usAddress.setCity("Washington");
        usAddress.setPostalCode("20521-2050");
        usAddress.setRegion("DC");
        usAddress.setStreet("2050 Bamako Place");
        System.out.println(usAddress.getFullAddress());
    }
}
