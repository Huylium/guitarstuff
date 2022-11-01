import java.lang.reflect.Array;
import java.util.Arrays;

public class RingBuffer {
    int cap;
    int size;
    double[] holder;
    public RingBuffer(int capacity ){
cap = capacity;
holder = new double[cap];
size= 0;
    }

    public int size(){

return size;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(size >= cap){
            return true;
        }
        return false;

    }          // is the buffer full  (size equals capacity)?
    public void enqueue(double x){
        if(isFull()) {
        }else {
            //System.out.println(holder.length);
            holder[size] = x;
            size++;
        }

    }    // add item x to the end (if not full)
    public double dequeue() {
        double take = holder[0];
        double[] replace = new double[cap];
        for(int i = 1; i<holder.length; i++){
            replace[i-1] = holder[i];
        }
        holder = replace;
        size--;
        return take;
    }     // delete and return item from the front (if not empty)
    public double peek(){
        return holder[0];
    }         // return item from the front of the buffer
    public String toString(){
        if(size >=cap){
            return Arrays.toString(holder);
        }
        double[] take = new double[size];
        for(int i = 0; i<size; i++){
            take[i]= holder[i];
        }

        return Arrays.toString(take);
    }         //form [front, next, …, next, last]
    public void toEnd(){

    }

}
