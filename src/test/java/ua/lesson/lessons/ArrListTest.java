package ua.lesson.lessons;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marichka on 14.03.2016.
 */
public class ArrListTest {

    @Test
    public void testAdd() throws Exception {
        ArrList arrList = new ArrList();
        arrList.add("1");
        arrList.add("2");
        assertEquals(arrList.size(),2);
    }

    @Test
    public void testAddIndex() throws Exception {
        ArrList arrList = new ArrList();
        arrList.add("0");
        arrList.add("1");
        arrList.add("2");
        arrList.add("3");
        arrList.add(2,"100");
        for (Object str : arrList.getArray()){
            System.out.println(str);
        }


    }

    @Test
    public void testAddAll() throws Exception {
        ArrayList col = new ArrayList();
        col.add("00");
        col.add("11");
        ArrList arrList = new ArrList();
        arrList.add("0");
        arrList.add("1");
        arrList.addAll(col);
        for (Object str : arrList.getArray()){
            System.out.println(str);
        }
    }

    @Test
    public void testAddAll1() throws Exception {
        ArrayList col = new ArrayList();
        col.add("00");
        col.add("11");
        ArrList arrList = new ArrList();
        arrList.add("0");
        arrList.add("1");
        arrList.addAll(1,col);
        for (Object str : arrList.getArray()){
            System.out.println(str);
        }
    }

    @Test
    public void testIndexOf() throws Exception {
        ArrList arrList = new ArrList();
        arrList.add("0");
        arrList.add("1");
        arrList.add("1");
        arrList.add("3");
        assertEquals(arrList.indexOf("1"),1);
    }

    @Test
    public void testLastIndexOf() throws Exception {
        ArrList arrList = new ArrList();
        arrList.add("0");
        arrList.add("1");
        arrList.add("1");
        arrList.add("3");
        assertEquals(arrList.lastIndexOf("1"),2);
    }

    @Test
    public void testRemove() throws Exception {
        ArrList arrList = new ArrList();
        arrList.add("10");
        arrList.add("1");
        arrList.add("2");
        System.out.println(arrList.remove(2));
        for (Object str : arrList.getArray()){
            System.out.println(str);
        }

    }
}