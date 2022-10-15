package uaslp.objetos.list.linked.list.arraylist;

import uaslp.objetos.list.linked.list.Iterator;

public class ArrayListIterator implements Iterator {

    private final ArrayList arrayList;
    private int currentIndex=0;

    public ArrayListIterator(ArrayList arrayList){
        this.arrayList=arrayList;
    }

    public boolean hasNext(){
        return currentIndex < arrayList.getSize();
    }

    public String Next(){
        return arrayList.getAt(currentIndex++);
    }

}
