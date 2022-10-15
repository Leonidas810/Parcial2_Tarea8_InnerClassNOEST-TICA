import uaslp.objetos.list.linked.list.List;
import uaslp.objetos.list.linked.list.arraylist.ArrayList;
import uaslp.objetos.list.linked.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        List list_linked = new LinkedList();
        List list_array = new ArrayList();

    //addAtTail
    list_linked.addAtTail("2");
    list_array.addAtTail("2");

    //addAtFront
    list_linked.addAtFront("1");
    list_array.addAtFront("1");

    //removeIndex
    list_linked.removeIndex(2);
    list_array.removeIndex(2);

    //removeAll
    list_linked.removeAll();
    list_array.removeAll();

    //setAt
    list_linked.setAt(1,"Nuevo");
    list_array.setAt(1,"Nuevo");

    list_linked.addAtFront("Nuevo");
    list_array.addAtFront("Nuevo");

    //getAt
    list_linked.getAt(1);
    list_array.getAt(1);

    //removeAllWithValue
    list_linked.removeAllWithValue("Nuevo");
    list_array.removeAllWithValue("Nuevo");

    //getSize
        list_linked.addAtFront("Nuevo");
        list_array.addAtFront("Nuevo");

    list_linked.getSize();
    list_array.getSize();

    //Iterator
    list_linked.getIterator();
    list_array.getIterator();

}}
