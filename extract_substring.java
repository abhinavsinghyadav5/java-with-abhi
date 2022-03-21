    import java.util.*;

public class extract_substring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString;
        int startIndex;
        int endIndex;

        System.out.println("Enter a string : ");
        inputString = scan.nextLine();
        System.out.println("Enter the first index of the substring : ");
        startIndex = scan.nextInt();
       System.out.println("Enter the second index of the substring : ");
       endIndex = scan.nextInt();

       char[] ch = new char[endIndex - startIndex + 1];
       inputString.getChars(startIndex, endIndex + 1, ch, 0);
       System.out.println("Output : " + String.valueOf(ch));

}

}
