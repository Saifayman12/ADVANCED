package task5;

public class ADT {
    private int[] list;
    private int bluehead;
    private int redhead;
    

    public ADT(int cap) {
        list = new int[cap];
        redhead = -1;
        bluehead = cap;
    }

   
// this is a function to add items in blue stack
    
    public void Bpush(int element) {
//    	this if condition checks if the blue stack is full and if it returns stack overflow
        if (bluehead - 1 == redhead) {
            throw new RuntimeException("stk overflow");
        }
        list[--bluehead] = element;}// else add the int element into the blue stack
//    a
//    a function that removes an item from the blue stack
    public int Bpop() {
    	
//    	check if the blue stack is empty or not if its empty return stack underflow

        if (bluehead == list.length) {
            throw new RuntimeException("Blue underflow");
        }
        return list[bluehead++];}// else remove the last element and return it to the function
    
    
    
    
 // this is a function to add items in red stack
    public void Rpush(int element) {
//    	this if condition checks if the red stack is full and if it returns stack overflow
        if (redhead + 1 == bluehead) {
            throw new RuntimeException("stk overflow");
        }
        list[++redhead] = element;// else add the int element into the red stack
    }
    
    
    
    
//  a function that removes an item from the red stack

   public int Rpop() {
//    	check if the red stack is empty or not if its empty return stack underflow

        if (redhead == -1) {
            throw new RuntimeException("Red underflow");
        }
        
        return list[redhead--]; // else remove the last element and return it to the function
    }

//    these functions are to check if every stack is either full or empty with a return type of true or false (boolean)
    public boolean RFull() {
        return redhead + 1 == bluehead;
    }

    public boolean BFull() {
        return bluehead - 1 == redhead;
    }

    public boolean REmpty() {
        return redhead == -1;
    }

    public boolean BEmpty() {
        return bluehead == list.length;
    }

//   the main function that creates a stack of size 20 and uses the push and pop funnction the prints the values
    public static void main(String[] args) {
        ADT stk = new ADT(20);
        stk.Rpush(122);
        stk.Bpush(266);
        stk.Rpush(433);
        stk.Bpush(784);
        stk.Rpush(3);
        stk.Bpush(78);
        stk.Rpush(15);
        stk.Bpush(54);
        stk.Rpush(12);
        stk.Bpush(11);
        System.out.println(stk.Rpop()); 
        System.out.println(stk.Bpop()); 
    }
}