package proxy_dating;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


//все обработчики реализуют интерфейс InvocationHandler
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {//передаем реальный объект в конструкторе и сохраняем ссылку на него
        this.person = person;
    }

    @Override
    //при каждом вызове метода заместителя вызывается метод invoke
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if(method.getName().startsWith("get")) {//если вызван get метод, вызов передается реальному объекту
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotDating")) {//вызов метода блокируется выдачей исключения
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {//вызов любых других set-методов владельцу разрешен, передаем реальному объекту
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;//при вызове любого другого метода просто возвращаем null
    }
}
