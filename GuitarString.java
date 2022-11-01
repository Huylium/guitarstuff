public class GuitarString {
    //public ringBuffer;
    public RingBuffer ringBuffer;
    public int lol = 0;
    public GuitarString(double frequency) {
        int hold = (int) Math.round(44100/frequency);
        ringBuffer = new RingBuffer(hold);
        for(int i = 0; i<hold; i++){
            ringBuffer.enqueue(0);
        }
    }
    // use a sampling rate of 44,100
    public GuitarString(double[] init)  {
        ringBuffer = new RingBuffer(init.length);
        for(int i = 0; i<init.length; i++){
            ringBuffer.enqueue(init[i]);
        }
    }  // size and values are given by the array
    public void pluck()   {
        for(int i = 0; i<ringBuffer.size(); i++){
            ringBuffer.dequeue();
            ringBuffer.enqueue(Math.random()*1-.5);
        }
    }                // set the buffer to white noise
    public void tic()       {
         double hold1 = ringBuffer.dequeue();
         double hold2 = sample();
         hold1 = (hold1 + hold2)/2;
         ringBuffer.enqueue(hold1);
        lol++;
    }              // advance the simulation one time step
    public  double sample()    {
        return ringBuffer.peek();
    }            // return the current sample
    public  int time()   {
        return lol;
    }                  // return number of tics

}
