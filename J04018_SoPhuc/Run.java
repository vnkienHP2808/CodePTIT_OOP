package J04018_SoPhuc;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while(test-- > 0){
            ComplexNumber num1 = new ComplexNumber(ip.nextInt(), ip.nextInt());
            ComplexNumber num2 = new ComplexNumber(ip.nextInt(), ip.nextInt());

            ComplexNumber numAdd = num1.add(num2);
            ComplexNumber numC = numAdd.mul(num1);
            ComplexNumber numD = numAdd.mul(numAdd);
            System.out.print(numC.toString());
            System.out.print(", ");
            System.out.println(numD.toString());
        }
        ip.close();
    }
}
