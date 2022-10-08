import ra.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(10);
        listInterger.add(11);
        listInterger.add(12);
        listInterger.add(13);
        listInterger.add(14);
        System.out.println("element 4 :"+listInterger.get(4));
        System.out.println("element 1 :"+listInterger.get(1));
        System.out.println("element 2 :"+listInterger.get(2));

    }
}