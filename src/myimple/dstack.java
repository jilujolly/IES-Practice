package myimple;

public class dstack {
    int capacity=2;
        //declaring an array

        int [] stack=new int[capacity];
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
            if(size()==capacity){
                expand();
            }else {
                stack[top] = data;
                top++;
            }
        }
        //Expanding the stack
    private void expand(){
            int length=size();
            int[]newstack=new int[capacity*2];
        System.arraycopy(stack,0,newstack,0,length);
        stack=newstack;
        capacity=2*capacity;
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

