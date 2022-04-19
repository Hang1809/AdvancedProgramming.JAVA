public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(2);
        list.add(4);
        list.add(1,3);
        list.add(2,5);
        System.out.println(list);


        list.remove(2);
        System.out.println("After remove :" + list);
    }
}
