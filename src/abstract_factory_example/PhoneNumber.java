package abstract_factory_example;

public abstract class PhoneNumber {
    private String phoneNumber;

    public abstract String getCountryCode();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        try {
            //проверяем номер телефона на число
            Long.parseLong(phoneNumber);
            //если число - записываем
            this.phoneNumber = phoneNumber;
            //если нет - пропускаем
        } catch (NumberFormatException e) {
        }
    }
}
