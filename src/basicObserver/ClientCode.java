package basicObserver;

public class ClientCode {
    public static void main(String[] args) {
        //создаем субъект
        ConcreteSubject subject = new ConcreteSubject();
        //создаем наблюдателей
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        //регистрируем наблюдателей
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        //меняем состояние субъекта и оповещаем наблюдателей
        subject.setState(8);
        //удаляем наблюдателя
        subject.removeObserver(observer1);
        //еще раз меняем состояние для проверки
        subject.setState(9);
    }
}
