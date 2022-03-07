package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class paranthesisStack {

    private static boolean balancedBracket(String s) {
        Stack stack = new Stack();
        for (int i=0; i<s.length();i++){
            char x = s.charAt(i);
            if (x == '{' || x== '[' || x=='('){
                stack.push(x);
                continue;
            }
            else{
                if (stack.isEmpty()) {
                    return false;
                }else{
                    char check;
                    switch (x){
                        case ')':
                            check = (char) stack.pop();
                            if (check == '{' || check == '['){
                                return false;
                            }break;
                            case ']':
                            check = (char) stack.pop();
                            if (check == '(' || check =='{'){
                                return false;
                            }break;
                            case '}':
                            check = (char) stack.pop();
                            if (check == '(' || check =='['){
                                return false;
                            }break;
                    }
                }
            }

        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if (balancedBracket(s))
            System.out.println("Balanced");
        else System.out.println("Not Balanced");
    }


}
