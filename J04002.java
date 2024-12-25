import java.util.Scanner;

public class J04002 {
    private int width;
    private int height;
    private String color;

    public J04002() {
        this.width = 1;
        this.height = 1;
    }

    public J04002(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int findArea(){
        return this.width * this.height;
    }

    public int findPerimeter(){
        return 2 *(this.width + this.height);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int width = ip.nextInt();
        int height = ip.nextInt();
        String color = ip.next();
        if(width <= 0 || height <= 0) System.out.println("INVALID");
        else{
            J04002 HCN = new J04002(width, height, color);
            System.out.print(HCN.findPerimeter() + " " + HCN.findArea() + " ");
            String Color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
            System.out.println(Color);
        }

    }
}
