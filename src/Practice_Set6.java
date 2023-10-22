class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public double surfaceArea(){
        return 2*3.14*radius * radius +2*3.14*radius*height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
}




public class Practice_Set6 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setHeight(12);
        cy.setRadius(2);
        System.out.println("Height of cyinder is : " + cy.getHeight());
        System.out.println("Radius of cyinder is : " + cy.getRadius());
        System.out.println("Surface Area of cylinder is : " + cy.surfaceArea());
        System.out.println("Volume of cylinder is : " + cy.volume());
;    }
}
