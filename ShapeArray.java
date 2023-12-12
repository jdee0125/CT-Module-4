package pack;

//ShapeArray.java (Driver Class)
public class ShapeArray {
public static void main(String[] args) {
   Sphere sphere = new Sphere(5.0);
   Cylinder cylinder = new Cylinder(3.0, 7.0);
   Cone cone = new Cone(4.0, 6.0);

   Shape[] shapeArray = {sphere, cylinder, cone};

   for (Shape shape : shapeArray) {
       System.out.println(shape.toString());
   }
}
}
