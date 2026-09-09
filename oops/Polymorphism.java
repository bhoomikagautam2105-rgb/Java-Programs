 // method overloading
 class Line{
    public void draw(){    // no agruments
        System.out.println();
        for(int i=1; i<50; i++){
            System.out.print("_");
        }
    }
    
    public void draw(int n){  // with one agruments
      System.out.println();
      for(int i=1; i<n; i++){
        System.out.print("_");
      }
    }

    public void draw(int n,String ch){  // with two arguments
        System.out.println();
        for(int i=1; i<n; i++){
            System.out.print(ch);
        }
    }
    public void draw(String ch , int n){
        System.out.println();
        for(int i=1; i<n; i++){
            System.out.println(ch);
        }
    }
 }
 class Polymorphism {
   public static void main(String[] args) {
    Line l1 = new Line();
    l1.draw();
    l1.draw(70);
    l1.draw(80,"#");
    l1.draw("*",55);
   } 
}
