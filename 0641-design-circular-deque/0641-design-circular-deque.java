class MyCircularDeque {
    int front=0,rear=-1,count=0,k=0;
    int[] queue;
    public MyCircularDeque(int k1) {
        queue=new int[k1];
        k=k1;
    }
    
    public boolean insertFront(int value) 
    {
        if(k==count)
        return false;
        if(count==0)
        {
            front=0;
            rear=0;
        }
        else
        front=(front-1+k)%k;
        queue[front]=value;
        count++;
        return true;
        
    }
    
    public boolean insertLast(int value) {
        if(k==count)
        return false;
        rear=(rear+1)%k;
        queue[rear]=value;
        count++;
        return true;
    }
    
    public boolean deleteFront() {
        if(count==0)
        return false;
        front=(front+1)%k;
        count--;
        return true;
        
    }
    
    public boolean deleteLast() {
        if(count==0)
        return false;
        rear=(rear-1+k)%k;
        count--;
        return true;
        
    }
    
    public int getFront() {
        if(count==0)
        return -1;
        return queue[front];
    }
    
    public int getRear() {
        if(count==0)
        return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        if(count==0)
        return true;
        else 
        return false;
    }
    
    public boolean isFull() {
        if(count==k)
        return true;
        else 
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */