public class Main {
    public static void main(String[] args) {


        MyLinkedList myList = new MyLinkedList(null);
        myList.traverse(myList.getRoot());

        String cities = "Hamburg Berlin Muenchen Bremen Frankfurt Kiel Nuerenberg Stuttgart Dueselldorf Luebeck Dresden";
        String name = "Dresden";
        Node a = new Node(name);

        myList.addItem(a);

        myList.traverse(myList.getRoot());

        String[] data = cities.split(" ");
        for(String s : data){
            myList.addItem(new Node(s));
        }
        myList.traverse(myList.getRoot());

    }
}
