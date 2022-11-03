package sheet.pkg1;
public class Stack {
    private int[] arr = new int[100];
    private int top = -1;
    void push(int val){
        if(top==99){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top] = val;
        }
    }
    void pop(){
        if(top==-1){
           System.out.println("Stack is Empty"); 
        }
        else{
            top--;
        }
    }
    void Display(){
        while(top!= -1){
            System.out.println(arr[top]);
            this.pop();
        }
    }
}
