package singleton;

//вторая версия потокобезопасного синглтона
//создаем экземпляр заранее
//если приложение всегда создает и использует экземпляр
//или затраты на создание не столь существенны
public class ChocolateBoiler3 {
    private static ChocolateBoiler3 chocolateBoiler3 = new ChocolateBoiler3();
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler3() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }

    public static ChocolateBoiler3 getInstance() {
        return chocolateBoiler3;
    }
}
