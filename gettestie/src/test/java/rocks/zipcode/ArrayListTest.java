package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class ArrayListTest {
    private ArrayList<Person> arrayList;
    private Person Ajulu;
    private Person Amy;


    @Before
    public void setUp() throws Exception {
        arrayList = new ArrayList<>();
        Ajulu = new Person("Ajulu", 1995);
        Amy = new Person("Amy", 1994);
        arrayList.add(Ajulu);
        arrayList.add(Amy);
    }

    @After
    public void tearDown() throws Exception {
        arrayList.clear();
    }

    @Test
    public void ArrayListClear() {
        arrayList.clear();
        Assert.assertTrue(arrayList.isEmpty());

    }

    @Test
    public void ArrayListSizeTest() {
        Integer expected = 2;
        Integer actual = arrayList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ArrayListSizeTest1() {
        arrayList.add(new Person("James", 1992));
        Integer expected = 3;
        Integer actual = arrayList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ArrayListTest2(){
        arrayList.remove(Amy);
        Assert.assertFalse(arrayList.contains(Amy));
    }
    @Test
    public void ArrayListTest3() {
        Person expected= Ajulu;
        Person actual= arrayList.get(0);
        Assert.assertEquals(expected, actual);
    }

}



