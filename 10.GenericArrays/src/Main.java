public class Main {
    public static void main(String[] args) {
        SList<Integer> list=new SList<>();
        SListIterator<Integer> sListIterator=list.iterator();
        System.out.println(list);
        sListIterator.add(1);
        sListIterator.add(2);
        sListIterator.add(3);
        sListIterator.add(4);
        System.out.println(list);
        sListIterator=list.iterator();
        sListIterator.pop();
        System.out.println(list);
        sListIterator=list.iterator();
        sListIterator.remove(2);
        System.out.println(list);
    }
}
