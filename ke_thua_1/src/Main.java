public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Cylinder với các giá trị mặc định
        Cylinder defaultCylinder = new Cylinder();
        System.out.println("Default Cylinder: " + defaultCylinder.toString());
        System.out.println("Surface Area of Default Cylinder: " + defaultCylinder.getArea());

        // Tạo đối tượng Cylinder với chiều cao được cung cấp
        Cylinder cylinderWithHeight = new Cylinder(7.0);
        System.out.println("Cylinder with height 7.0: " + cylinderWithHeight.toString());
        System.out.println("Surface Area of Cylinder with height 7.0: " + cylinderWithHeight.getArea());

        // Tạo đối tượng Cylinder với bán kính và chiều cao
        Cylinder cylinderWithRadiusHeight = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder with radius 5.0 and height 10.0: " + cylinderWithRadiusHeight.toString());
        System.out.println("Surface Area of Cylinder with radius 5.0 and height 10.0: " + cylinderWithRadiusHeight.getArea());

        // Tạo đối tượng Cylinder với bán kính, màu, và chiều cao
        Cylinder customCylinder = new Cylinder(5.0, 12.0, "green");
        System.out.println("Custom Cylinder: " + customCylinder.toString());
        System.out.println("Surface Area of Custom Cylinder: " + customCylinder.getArea());

        // Kiểm tra setter và getter
        customCylinder.setHeight(8.0);
        customCylinder.setRadius(6.0);
        customCylinder.setColor("blue");
        System.out.println("Updated Custom Cylinder: " + customCylinder.toString());
        System.out.println("Surface Area of Updated Custom Cylinder: " + customCylinder.getArea());
    }
}