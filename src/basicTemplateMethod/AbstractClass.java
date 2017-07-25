package basicTemplateMethod;

public abstract class AbstractClass {

    //шаблонный метод
    void templateMethod() {
        operation1();
        operation2();
    }

    protected abstract void operation2();

    protected abstract void operation1();
}
