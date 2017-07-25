package basicAdapter;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();//адаптируемый класс
        Adapter adapter = new Adapter(adaptee);//адаптер
        adapter.request();//передаем запрос через адаптер
    }
}
