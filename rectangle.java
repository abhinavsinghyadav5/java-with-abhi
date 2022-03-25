public class rectangle {
    int length,width;
    void getdata(int x,int y)
    {
        length=x;
        width=y;
    }
 int recarea()
 {
     int area=length*width;
    return(area);
 }
}

class rectarea
{
    public static void main(String[] args)
    {
        int area1,area2;
        rectangle rect1=new rectangle();
        rectangle rect2=new rectangle();
        rect1.length=250;
        rect2.width=100;
        area1=rect1.length*rect2.width;
        rect2.getdata(20,15);
        area2=rect2.recarea();
        System.out.println("Area 1="+ area1);
        System.out.println("Area 2="+ area2);

    }
}
