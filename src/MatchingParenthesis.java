import java.util.ArrayList;
import java.util.Stack;

public class MatchingParenthesis implements IStack {

    private static Stack<Object> stk = new Stack<>();

    public static void main(String[] args){
        stk.push(1);
        stk.peek();
        System.out.println(stk.size());
        stk.pop();
        System.out.println(stk.isEmpty());
    }

    @Override
    public void push(Object value) {
        stk.push(value);
    }

    @Override
    public Object pop() {
        if(stk.isEmpty()){
            return stk;
        }
        else{
            return stk.pop();
        }
    }

    @Override
    public Object peek() {
        return stk.peek();
    }

    @Override
    public int size() {
        return stk.size();
    }

    @Override
    public boolean isEmpty() {
        return stk.isEmpty();
    }
    public String toString() {
        return stk.toString();
    }
}
