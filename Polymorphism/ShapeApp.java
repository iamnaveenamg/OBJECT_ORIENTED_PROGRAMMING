class ShapeApp{
    public static void main(String args[]){
        Shape s;
        Square sq=new Square();
        Rectangle re=new Rectangle();
        Circle ci=new Circle();

        // Square
        s=sq;
        s.findArea();
        s.display();


        // Rectangle
        s=re;
        s.findArea();
        s.display();

        // Circle
        s=ci;
        s.findArea();
        s.display();

    }
}