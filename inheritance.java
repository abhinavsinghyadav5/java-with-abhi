 class test{
   public  int x;
   public int getx()
   {
       return x;
   }
   public void setx(int x)
   {
       System.out.println("I am in base class setting x");
       this.x=x;
   }
}

class derived extends test{
    public int y;
    public int gety()
    {
        return y;
    }
    public void sety(int y)
    {
        System.out.println("I am in derived class and setting y");
        this.y=y;
    }
}

public class inheritance
{
    public static void main(String[] args)
    {
        test b=new test();
        b.setx(50);
        System.out.println(b.getx());
        derived d=new derived();
         d.sety(60);
        System.out.println(d.gety());
    }
}
