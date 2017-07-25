package abstract_factory_example;

public interface AddressFactory {
    Address createAddress();
    PhoneNumber createPhoneNumber();
}
