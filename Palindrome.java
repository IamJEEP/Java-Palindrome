import java.util.*;

public class Palindrome
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);

  String a = "";
  System.out.println("Please Enter your phrase,sentence or word: ");
  String h = scan.nextLine();
  
  for(int i = 0; i < h.length(); i++)
  {
     if(Character.isDigit(h.charAt(i)) || Character.isLetter(h.charAt(i)))
     {
        a = a+h.charAt(i);
     }
  }
  
  a = a.toLowerCase();
  boolean palindrome = true;
  int j = a.length()-1;
  for(int i = 0; i<a.length()/2; i++)
  {
     if(a.charAt(i) !=a.charAt(j))
     {
        palindrome = false;
        break;
     }
     j--;
  }
  
  if(palindrome)
  {
     System.out.println("Yes it is a palindrome");
  }
  else
  {
     System.out.println("Sorry it is not a palindrome");
  }
}
}