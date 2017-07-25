package singleton;

//вторая версия потокобезопасного синглтона
//синхронизация выполняется только при первом вызове
//volatile гарантирует, что параллельные программные потоки
//будут правильно работать с переменной chocolateBoiler4
//данный способ обеспечивает лучшую производительность
public class ChocolateBoiler4 {
    private volatile static ChocolateBoiler4 chocolateBoiler4;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler4() {
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

    public static ChocolateBoiler4 getInstance() {
        if (chocolateBoiler4 == null) {
            synchronized (ChocolateBoiler4.class) {
                if (chocolateBoiler4 == null) chocolateBoiler4 = new ChocolateBoiler4();
            }
        }
        return chocolateBoiler4;
    }
}
