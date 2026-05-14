// Stack Implementation using Array
public class DS_11_Stack {
    private int[] stack;
    private int top;
    
    public DS_11_Stack(int size) {
        stack = new int[size];
        top = -1;
    }
    
    public void push(int x) {
        if (top < stack.length - 1) {
            stack[++top] = x;
            System.out.println(x + " pushed");
        } else {
            System.out.println("Stack overflow");
        }
    }
    
    public int pop() {
        if (top >= 0) {
            return stack[top--];
        }
        System.out.println("Stack underflow");
        return -1;
    }
    
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        DS_11_Stack s = new DS_11_Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
