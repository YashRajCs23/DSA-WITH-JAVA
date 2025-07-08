public class circularQueueArray{
    public static class Cqa{
        int front=-1,rear=-1,size=0;
        int[] arr=new int[8];
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("queue is full");
            }
            else if(size==0){
                front=rear=0;
                arr[0]=val;
            }
            else if(rear<arr.length-1){
                arr[++rear]=val;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("queue is full");
            }
            else{
                int val=arr[front];
                if(front==arr.length-1) front=0;
                else front++;
                size--;
                return val;
            }

        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("queue is full");
            }
            else return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
                return;
            }
            else if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        Cqa queue = new Cqa();
        queue.display();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.display();  // Output: 1 2 3
        System.out.println(queue.remove());  // Output: 1
        queue.display();  // Output: 2 3
        System.out.println(queue.peek());    // Output: 2
        for(int i=0;i<queue.arr.length;i++){
            System.out.print(queue.arr[i]+" ");
        }
    }
}