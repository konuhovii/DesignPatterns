package basicTemplateMethod;

public class ConcreteClass1 extends AbstractClass{
    @Override
    protected void operation2() {
        System.out.println("ConcreteClass1.operation2()");
    }

    @Override
    protected void operation1() {
        System.out.println("ConcreteClass1.operation1()");
    }
}
