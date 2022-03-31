abstract class a{
    abstract void display();
    void disp()
    {
        System.out.println("method from x class");
    }
}

class y extends a{
    void display()
    {
        System.out.println("method from y class");
    }
}

class abstract_main{
    public static void main(String args[])
    {
        y obj=new y();
        obj.disp();
    }
}