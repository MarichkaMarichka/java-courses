package ua.lesson.lessons;

import java.util.*;

/**
 * Created by Marichka on 14.03.2016.
 */
public class ArrList {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_CAPACITY = {};
    private Object[] array;
    //----------------------------------------------

    public ArrList() {
        this.array = EMPTY_CAPACITY;
    }
    public ArrList(int initialCapacity){
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        this.array = new Object[initialCapacity];
    }
    public ArrList(Collection<?> c){
        this.array = c.toArray();
    }
    //--------------------------------------------
    public void add( Object obj){
        Object[] temp = new Object[array.length+1];
        int i;
        for (i = 0; i < array.length; i++){
            temp[i] = array[i];
        }
        temp[i] = obj;
        array = temp;
    }
    //--------------------------------------------
    public void add(int index, Object obj){
        Object[] temp = new Object[array.length+1];
        int i,j;
        for (i = 0; i < index; i++){
            temp[i] = array[i];
        }
        temp[index] = obj;
        for (j = i+1; j < temp.length; j++){
            temp[j] = array[j-1];
        }
        array = temp;
    }
    //--------------------------------------------
    public boolean addAll( Collection<?> col){
        boolean changed = true;
        if(col.size() == 0)
            changed = false;
        else {
            Object[] temp = new Object[array.length + col.size()];
            int i;
            for (i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            for (Object c : col) {
                temp[i] = c;
                i++;
            }
            array = temp;
        }
        return  changed;
    }
    //--------------------------------------------
    public boolean addAll(int index, Collection<?> col){
        boolean changed = true;
        if(col.size() == 0)
            changed = false;
        else {
            Object[] temp = new Object[array.length + col.size()];
            int i,j;
            for (i = 0; i < index; i++) {
                temp[i] = array[i];
            }
            for (Object c : col) {
                temp[i] = c;
                i++;
            }
            for(j = index + col.size(); j < temp.length; j++){
                temp[j] = array[index];
                index++;
            }
            array = temp;
        }
        return  changed;
    }
    //--------------------------------------------
    public int size(){
        return array.length;
    }
    //-------------------------------------------
    public Object[] getArray(){
        return array;
    }
    //-------------------------------------------
    public Object get(int index){
        return array[index];
    }
    //-------------------------------------------
    public Object set(int index, Object obj){
        array[index] = obj;
        return array[index];
    }
    //-------------------------------------------
    public int indexOf(Object obj){
        int found = -1;
        int i = 0;
        for(Object elem : array){
            if(elem.equals(obj)){
                found = i;
                break;
            }
            i++;
        }
        return found;
    }
    //-------------------------------------------
    public int lastIndexOf(Object obj){
        int found = -1;
        int j = 0;
        for(Object elem : array){
            if(elem.equals(obj)){
                found = j;
            }
            j++;
        }
        return found;
    }
    //------------------------------------------
    public Object remove(int index){
        Object[] temp = new Object[array.length-1];
        Object ret = null;
        int i,j;
        for(i = 0; i < index; i++){
            temp[i] = array[i];
        }
        ret = array[index];
        for(j = i; j < temp.length; j++){
            temp[j] = array[j+1];
        }
        array = temp;
        return ret;
    }
    //---------------------------------
}
