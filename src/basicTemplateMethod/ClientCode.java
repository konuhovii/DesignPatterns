package basicTemplateMethod;

public class ClientCode {
    public static void main(String[] args) {
        AbstractClass ac[] = {new ConcreteClass1(), new ConcreteClass2()};

        for(AbstractClass cc : ac) {
            cc.templateMethod();
        }
    }
}
