package singleton;

//нарушена потокобезопасность синглтона
//несколько потоков могут создать 2 и более объекта ChocolateBoiler1
public class ChocolateBoiler1 {
    private static ChocolateBoiler1 chocolateBoiler1;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler1() {
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

    public static ChocolateBoiler1 getInstance() {
        if (chocolateBoiler1 == null) {
            chocolateBoiler1 = new ChocolateBoiler1();//в этой строке опасность многопоточного обращения к классу
        }
        return chocolateBoiler1;
    }
}
