public class palindrome {
    public static void main(String args[])
    {
        int a,s=0,temp;
        int n=353;
        temp=n;
        while(n>0)
        {
            a=n%10;
            s=(s*10)+a;
            n=n/10;
        }
      if(temp==s)
      System.out.println("Palindrome");
      else
      System.out.println("Not Palindrome");
 }
}
