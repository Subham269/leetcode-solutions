class MyCircularQueue {
    int front=0,rear=-1,size,count=0;
    int queue[];
    public MyCircularQueue(int k) {
        size=k;
        queue=new int[size];
    }
    
    public boolean enQueue(int value) {
        
        if(count<size)
        {
            rear=(rear+1)%size;
            queue[rear]=value;
            count++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() 
    {
        if(count==0)
        {
            return false;
        }
        count--;
        front=(front+1)%size;
        return true;
    }
    
    public int Front() {
        if(count==0)
        return -1;
        return queue[front];
    }
    
    public int Rear() {
        if(count==0)
        return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        if(count==0)
        return true;
        return false;
    }
    
    public boolean isFull() {
        if(count==size)
        return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */