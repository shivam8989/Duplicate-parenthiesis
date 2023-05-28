package Stack;
import java.util.Stack;
public class Duplicate_Parenthses {
    public static boolean isDuplicate(String str){
        Stack<Character> list  = new Stack<>();
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==')'){
                int count = 0;
                while(!list.isEmpty() && list.peek() != '('){
                    list.pop();
                    count++;
                }
                if(count<1) {
                    return true;
                }else{
                        list.pop();
                    }
                }else{
                list.push(ch);
            }
        }
        return false;
    }
    public static void main(String args []){
        String str = "((a+b))";
        String str1 = "(a-b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}
