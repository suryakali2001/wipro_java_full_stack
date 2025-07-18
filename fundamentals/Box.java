public class Box1{
     private double width;   
     private double height;
     private double depth;

     public Box1(double width,  double height,  double depth){
             this.width=width;
             this.height=height;
             this.depth=depth;
             }
              double getvolume(){
                        return width * height * depth;
             }
              public static void main(String[] args) {
               Box1 box = new Box1(10,50,100);
              System.out.println("The volume of Box1 is " + box.getvolume());
}
}
     
