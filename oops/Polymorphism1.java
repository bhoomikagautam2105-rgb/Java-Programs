 // constructor overloading
 class Box{
    double width,height,depth;
    Box(double w,double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = height = depth = 0;
    }
    Box(double len){
        width = height = depth = len;
    }
    public double volume(){
        return width*height*depth;
    }
 }
 class Polymorphism1 {
    public static void main(String[] agrs){
        Box mybox1 = new Box();
        Box mybox2 = new Box(10,20,25);
        Box mybox3 = new Box(7);
        double vol;
        vol = mybox1.volume();
        System.out.println("volume of box1 is "+vol);
        vol = mybox2.volume();
        System.out.println("volume of box2 is "+vol);
        vol = mybox3.volume();
        System.out.println("volume of box3 is "+vol);
    }
   
    
    
}
