package myimple;

public class MyStack {
    //declaring an array

    int [] stack=new int[5];
   int top=0;
   //checking Size
    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;

    }
   //adding an element
    public void push(int data){
        if(top==6){
            System.out.print("Stack is full");
        }else {
            stack[top] = data;
            top++;
        }
    }
    //printing the stack
    public void show(){
        for(int n:stack){
            System.out.print(n+" ");
        }
    }
    //deleting an element

    public int pop(){
        int data=0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }
    //fetching an element

    public int peek(){
        int data;
        data=stack[top-1];
        return data;
    }

}
