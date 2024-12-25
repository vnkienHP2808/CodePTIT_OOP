package J04018_SoPhuc;

public class ComplexNumber {
    private int real;
    private int image;

    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public ComplexNumber add(ComplexNumber num2){
        int realTmp = real + num2.real;
        int imageTmp = image + num2.image;
        return new ComplexNumber(realTmp, imageTmp);
    }

    public ComplexNumber mul(ComplexNumber num2){
        int realTmp = real * num2.real - image * num2.image;
        int imageTmp = real * num2.image + image * num2.real;
        return new ComplexNumber(realTmp, imageTmp);
    }

    public String toString(){
        String tmp;
        if(image < 0) tmp = "-";
        else tmp = "+";
        return real + " " + tmp + " " + Math.abs(image) + "i";
    }
}
