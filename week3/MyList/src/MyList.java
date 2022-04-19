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

    public MyList(int capacity){
        elements = new Object[capacity];
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
            System.arraycopy(elements, index+1, elements, index, size - 1);
//            for (int i = index; i < elements.length -1; i++){
//                elements[i] = elements[i+1];
//                elements[size -1] = null;
//            }
//            return elements;
//            size --;
        }
        elements[--size] = null;
    }

    public int size(){
        return size;
    }



    public Object clone(){
        Object newArr[]= new Object[size];
        for (int i=0; i<size; i++){
            newArr[i] = elements[i];
        }
        return "MyListClone{"+
                "size=" + size +
                ", elements = " + Arrays.toString(newArr)+'}';
    }


    // E get (int i)
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }

    public int indexOf(E e) {
        int indexOf = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                indexOf = i;
            }
        }
        return indexOf;
    }

    public Object clear(){
        for (int i=0; i<size; i++){
            elements[i]=null;
        }
        size = 0;
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
