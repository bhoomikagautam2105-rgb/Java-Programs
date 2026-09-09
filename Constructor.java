// Constructor overloading....
class Box{
    double width,height,depth;
    Box(double w,double h,double d){
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
class Constructor {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of box1 is "+vol);
        vol = mybox2.volume();
        System.out.println("volume of box2 is "+vol);
        vol = mycube.volume();
        System.out.println("volume of cube is "+vol);
    }
}
