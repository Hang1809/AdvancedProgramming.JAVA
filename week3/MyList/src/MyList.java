import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // add (int index, E element)
    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        if (index >= size || index < 0) {
            System.out.println("Index invalid");
        } else {
            System.arraycopy(elements, index, elements, index + 1, size - index);
        }
        elements[index] = element;
        size++;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    //public boolean add(E element)
//    public  boolean add(E e) {
//        if (size >= elements.length) {
//            System.arraycopy(elements, 0, elements, 0, elements.length);
//        }
//        elements[size++] = e;
//        return true;
//    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    //remove (int index)
    public void remove(int index) {
        if (size == elements.length) {
            ensureCapa();
        }
        if (index >= size || index < 0) {
            System.out.println("Index invalid");
        } else {
            System.arraycopy(elements, index, elements, index, size - 1);
//            for (int i = index; i < elements.length -1; i++){
//                elements[i] = elements[i+1];
//                elements[size -1] = null;
//            }
//            return elements;
//            size --;
        }
        elements[index] = null;
        size--;
    }


    // E get (int i)
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }
}
