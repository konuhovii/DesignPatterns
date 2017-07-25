package command1;

public class Client {
    public static void main(String[] args) {
        //создаем вызывающий объект
        Invoker invoker = new Invoker();
        //создаем объект-получатель
        Receiver receiver = new Receiver();
        //создаем конкретную команду, которая делегирует действие получателю
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        //передаем команду вызывающему
        invoker.setCommand(concreteCommand);
        //запрашиваем действие у получателя
        invoker.queryCommand();
        invoker.undoCommand();
    }
}
