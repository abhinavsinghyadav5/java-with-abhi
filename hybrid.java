class student //multilple inheritance....
{
    int roll_no;
    public void getNumber(int n)
   {
      roll_no=n;
   }
   public void putnumber()
   {
       System.out.println("Roll no is "+roll_no);
   }
}

class test extends student
 {
     float part1,part2;
     public void getmarks(float m1,float m2)
     {
         part1=m1;
         part2=m2;
     }
     public void putmarks()
     {
         System.out.println("Marks obtained");
         System.out.println("part1 = "+part1);
         System.out.println("part2 = "+part2);
     }
 }
 interface sports
 {
     float sportwt=6.0f;
     void putwt();
 }

class result extends test implements sports{
    float total;
    public void putwt()
    {
        System.out.println("Sports = "+sportwt);
    }

    void display()
    {
        total=part1+part2+sportwt;
        putnumber();
        putmarks();
        putwt();
        System.out.println("Total is = "+total);
    }
}   
class hybrid 
{
    public static void main(String[] args)
    {
        result r=new result();
        r.getNumber(5);
        r.getmarks(90.5f,90.3f);
        r.display();
    }
}