interface area
{
    float pi=3.14f;
    float compute(float x,float y);
}

class rectangle implements area
 {
    public float compute(float x,float y)
    {
        return (x*y);
    }
 }

 class circle implements area
 {
     public float compute (float x,float y)
     {
         return (pi*x*x);
     }
 }

 class interface_test
 {
     public static void main(String args[])
     {
         rectangle rect=new rectangle();
         circle cir=new circle();
         area Area;
         Area= rect;
         System.out.println("Area of rectangle "+Area.compute(10,20));
         Area=cir;
         System.out.println("Area of circle "+Area.compute(10,0));

     }
 }