package singleton;

//первая версия потокобезопасного синглтона
//добавляем synchronized к методу getInstance()
//что сильно ухудшает производительность
public class ChocolateBoiler2 {
    private static ChocolateBoiler2 chocolateBoiler2;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler2() {
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

    public static synchronized ChocolateBoiler2 getInstance() {
        if (chocolateBoiler2 == null) {
            chocolateBoiler2 = new ChocolateBoiler2();
        }
        return chocolateBoiler2;
    }
}
