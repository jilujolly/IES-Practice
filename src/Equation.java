import java.util.Stack;
import java.util.Scanner;
public class Equation {
    String exp="a*x^3+b*x^2+c*x+d";
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int x = input.nextInt();

    }


    Stack<Character>oper=new Stack<Character>();

    public void operand(){
        String s="";
        for(int i=0;i<exp.length();i++){
            if(Character.isDigit(exp.charAt(i))){
               s=s+exp.charAt(i);
            }else{
                oper.push(exp.charAt(i));
            }
        }
    }
}
