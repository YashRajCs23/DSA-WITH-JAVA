class box {
    private double l;
    double b;
    double h;
    box(double l,double b ,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public double volume() {
        return l*b*h;
    }
    //getter and setter
    public void setlen(double l) throws Exception{
        try {
        if(l<=0) {
            throw new Exception("length -ve nhi hota hai");
        }
        this.l=l;
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public double getlen() {
        return l;
    }
    }
    public class test {
    
        public static void main(String[] args) throws Exception{
        box b1=new box(2,3,1.5);
    //    b1.l=-3;
        b1.setlen(-3);
        System.out.println(b1.getlen());
        System.out.println(b1.volume());
        }
    
    }