package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();

        // 마지막에 추가 //O(n)
        list.add("A");
        list.add("B");
        list.add("C");

        // 첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0, "D"); // O(1)
        System.out.println(list);

        System.out.println("첫 번째 항목에 삭제");
        list.remove(0); // remove First O(1)
        System.out.println(list);

        // 중간 항목에 추가, 삭제
        System.out.println("중간 항목에 추가");
        list.add(1, "E"); // O(n)
        System.out.println(list);

        System.out.println("중간 항목에 삭제");
        list.remove(1); // remove O(n)
        System.out.println(list);
    }
}
