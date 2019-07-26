package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;



public class ArrayDequeTest {
    private ArrayDeque<Person> personDeque;
    private Person Ajulu;
    private Person Amy;
    private Person Esso;


    @Before
    public void setUp() throws Exception {
        personDeque= new ArrayDeque<>();
        Ajulu= new Person("Ajulu", 1995);
        Amy= new Person("Amy", 1992);
        Esso= new Person("Esso", 1990);

        personDeque.add(Ajulu);
        personDeque.add(Amy);
        personDeque.add(Esso);
    }

    @After
    public void tearDown() throws Exception {
        personDeque.clear();

    }

    @Test
    public void testDeque(){
        personDeque.clear();
        Assert.assertTrue(personDeque.isEmpty());

    }
    @Test
    public void testDeque1(){
        Integer expected= 3;
        Integer actual= personDeque.size();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testDeque2(){
        personDeque.add(new Person("Mike", 1996));
        Integer expected= 4;
        Integer actual= personDeque.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeque3(){
        Person expected= Ajulu;
        Person actual= personDeque.peek();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDeque4(){
        Person Maddie= new Person("Maddie", 1980);
        personDeque.addFirst(Maddie);
        Person expected= Maddie;
        Person actual= personDeque.peek();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDeque5(){
        personDeque.removeFirst();
        Person expected= Amy;
        Person actual= personDeque.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeque6(){
        Person expected= Ajulu;
        Person actual= personDeque.pop();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeque7(){
        personDeque.pop();
        Integer expected= 2;
        Integer actual= personDeque.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeque8(){
        Person Liam= new Person("Liam", 2000);
        personDeque.push(Liam);
        Integer expected = 4;
        Integer actual= personDeque.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeque0(){
        Person Liam= new Person("Liam", 2000);
        personDeque.offerLast(Liam);
        Person expected= personDeque.peekLast();
        Person actual= personDeque.peekLast();
        Assert.assertEquals(expected, actual);

    }

}
