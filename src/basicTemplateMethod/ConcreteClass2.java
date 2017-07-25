package basicTemplateMethod;

public class ConcreteClass2 extends AbstractClass{
    @Override
    protected void operation2() {
        System.out.println("ConcreteClass2.operation2()");
    }

    @Override
    protected void operation1() {
        System.out.println("ConcreteClass2.operation1()");
    }
}
