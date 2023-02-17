class Shape{
    void findArea(){
        System.out.println("The area of shape is");
    }
    void display(){
        System.out.println("The name of shape");
    }
}
class Square extends Shape{
    void findArea(){
        int e=10;
        int area=e*e;
        System.out.println("The area of Square is: "+ area);
    }
    void display(){
        System.out.println("The shape of Square");
    }
}
class Rectangle extends Shape{
    void findArea(){
        int l=10, b=5;
        int area=l*b;
        System.out.println("The area of Square is: "+ area);
    }
    void display(){
        System.out.println("The shape of Rectangle");
    }
}
class Circle extends Shape{
    void findArea(){
        int r=5;
        double area=3.142*r*r;
        System.out.println("The area of Square is: "+ area);
    }
    void display(){
        System.out.println("The shape of Rectangle");
    }
}