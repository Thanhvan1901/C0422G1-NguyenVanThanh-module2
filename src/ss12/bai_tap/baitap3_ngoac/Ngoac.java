package ss12.bai_tap.baitap3_ngoac;

import java.util.Stack;

public class Ngoac {
    public static boolean testBracket(String s) {
        Stack<Character> bStack = new Stack<>();
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            char sym = s.charAt(i);

            if (sym == '(') {
                bStack.push(sym);
            }

            if (sym == ')') {
                if (bStack.isEmpty()){
                    return result= false;
                }else {
                    bStack.pop();
                }
            }if (bStack.isEmpty()){
                result= true;
            }else result= false;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(testBracket("()()()()()"));
    }
}