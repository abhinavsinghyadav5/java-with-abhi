public class armstrong {
    public static void main(String args[])
    {   int a,sum=0,temp;
        int n=367;
        a=n;
        while(a!=0)
        {
            temp=a%10;
            sum=sum+(temp*temp*temp);
            a=a/10;
        }
        if(sum==n)
        System.out.println("Number is armstrong ");
        else
        System.out.println("Number is not armstrong");
    }
}
