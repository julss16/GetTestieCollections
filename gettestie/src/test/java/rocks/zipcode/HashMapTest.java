package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    HashMap<Person, Integer> personMap;
    Person Ajulu;
    Person Amy;

    @Before
    public void setUp() throws Exception {
        personMap= new HashMap<>();
        Ajulu= new Person("Ajulu", 1996);
        Amy= new Person("Amy", 1992);
        personMap.put(Ajulu, Ajulu.getYearOfBirth());
        personMap.put(Amy, Amy.getYearOfBirth());

    }

    @After
    public void tearDown() throws Exception {
        personMap.clear();
    }

    @Test
    public void HashMapTest() {
        personMap.clear();
        Assert.assertTrue(personMap.isEmpty());

    }

    @Test
    public void HashMapTest1() {
        Integer expected= 2;
        Integer actual= personMap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HashMapTest2() {
        Assert.assertTrue(personMap.containsKey(Amy));

    }

    @Test
    public void HashMapTest3() {
        Assert.assertTrue(personMap.containsValue(1996));
    }

    @Test
    public void HashMapTest4() {
        Integer expected= 1992;
        Integer actual= personMap.get(Amy);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HashMapTest5() {
        personMap.remove(Ajulu);
        Integer expected= 1;
        Integer actual= personMap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HashMapTest6() {
        Person Ned= new Person("Ned", 2003);
        personMap.put(Ned, Ned.getYearOfBirth());
        Integer expected= 3;
        Integer actual= personMap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HashMapTest7() {
        personMap.replace(Amy, 8000);
        Integer expected= 8000;
        Integer actual= personMap.get(Amy);
        Assert.assertEquals(expected, actual);
    }
}
