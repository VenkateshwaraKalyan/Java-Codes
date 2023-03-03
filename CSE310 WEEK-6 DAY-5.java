/*Create a class Student with attributes name(String) and registrationNo(int) and a method show to display the attributes of the Student. Write a menu driven program with 2 choices to take the input of the student attributes and display the attributes.

Input Format

Your program should take the 2 choice as input. • If the first input will be 1 then also ask to user to enter the details of the student. If the entered registrationNo is negative, do not accept the input and prompt again to take new input until user will not entered the positive registrationNo. • If the first input will be 2 then display the default values of Student attributes separated by comma in the same line. • If the first input will be any other int value, display the message “Wrong Choice”.

Constraints

Student registrationNo should be positive value(excluding 0).

Output Format

Your program should display the attributes of Student or the message “Wrong Choice” as the User choice at the runtime.

Sample Input 0

1
John
10


Sample Output 0

John,10


Sample Input 1

2


Sample Output 1

null,0
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

  class Student{
      String name; int reg;
      
      void show(String name,int reg){
          this.name=name; this.reg=reg;
          System.out.println(name+","+reg);
      }
  }
  

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int choice=obj.nextInt(); Student a=new Student();
        if(choice==1){
            obj.nextLine();
            String name=obj.nextLine(); 
            int reg=obj.nextInt();
            while(reg<=0){
                 reg=obj.nextInt();
            }
                a.show(name,reg);
        }
        else if(choice==2){
            a.show("null",0);
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
}
