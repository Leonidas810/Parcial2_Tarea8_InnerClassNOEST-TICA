package uaslp.objetos.list.linked.list;

public interface List {
    void addAtTail (String data);
    void addAtFront(String data);
    boolean removeIndex(int index);
    void removeAll();
    boolean setAt(int index,String data);
    String getAt(int index);
    boolean removeAllWithValue(String data);
    int getSize();
    Iterator getIterator();
}
