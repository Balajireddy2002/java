import java.util.*;
public class vibgyor
{
     public static void main(String args[])
       {
             Scanner sc=new Scanner(System.in);
             char c=sc.next().charAt(0);
             if(c=='v'){
                System.out.println("violet");
             }
           else if(c=='i'){
                System.out.println("indigo");
             }
          else if(c=='b'){
                System.out.println("blue");
             }
         else if(c=='g'){
                System.out.println("green");
             }
         else if(c=='y'){
                System.out.println("yellow");
             }
       else if(c=='o'){
                System.out.println("orange");
             }
        else if(c=='r'){
                System.out.println("red");
             }
       else{
               System.out.println("user entered colour is not VIBGYOR");
            }
        }
}
