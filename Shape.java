package pack;

//Shape.java
abstract class Shape {
 abstract double surfaceArea();
 abstract double volume();
}

//Sphere.java
class Sphere extends Shape {
 private double radius;

 public Sphere(double radius) {
     this.radius = radius;
 }

 @Override
 public double surfaceArea() {
     return 4 * Math.PI * Math.pow(radius, 2);
 }

 @Override
 public double volume() {
     return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
 }

 @Override
 public String toString() {
     return "Sphere - Radius: " + radius + ", Surface Area: " + surfaceArea() + ", Volume: " + volume();
 }
}

//Cylinder.java
class Cylinder extends Shape {
 private double radius;
 private double height;

 public Cylinder(double radius, double height) {
     this.radius = radius;
     this.height = height;
 }

 @Override
 public double surfaceArea() {
     return 2 * Math.PI * radius * (radius + height);
 }

 @Override
 public double volume() {
     return Math.PI * Math.pow(radius, 2) * height;
 }

 @Override
 public String toString() {
     return "Cylinder - Radius: " + radius + ", Height: " + height + ", Surface Area: " + surfaceArea() + ", Volume: " + volume();
 }
}

//Cone.java
class Cone extends Shape {
 private double radius;
 private double height;

 public Cone(double radius, double height) {
     this.radius = radius;
     this.height = height;
 }

 @Override
 public double surfaceArea() {
     double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
     return Math.PI * radius * (radius + slantHeight);
 }

 @Override
 public double volume() {
     return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
 }

 @Override
 public String toString() {
     return "Cone - Radius: " + radius + ", Height: " + height + ", Surface Area: " + surfaceArea() + ", Volume: " + volume();
 }
}


