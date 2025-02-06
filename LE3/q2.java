interface Testable {
    void display();
}

class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Display method in Test class");
    }

}
abstract class AbsTest implements Testable {
    @Override
    public void display() {
        System.out.println("Display AbsTest class");
    }
    
}


class Main{
    
    public static void main(String args[])
    {
        Test t1 = new Test();
        t1.display();
        AbsTest t2 = new AbsTest();
        t2.display();
    }
}
