public class main1 {
  public static void main(String[] args)
  {
      sub s=new sub();
      s.display();
  }
}

class superclass
{
    public int x=30;
    void display()
    {
        System.out.println("super "+x);
    }
}

class sub extends superclass
{
    public int y=50;
    void display()
    {
        System.out.println("superclass "+x);
        System.out.println("subclass "+y);
    }
}