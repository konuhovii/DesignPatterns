package iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class PancakeHouseIterator implements Iterator {
    private final ListIterator iterator;
    ArrayList menuItems;

    public PancakeHouseIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
        this.iterator = menuItems.listIterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }
}
