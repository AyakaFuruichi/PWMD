public class Calcurator {
    public double Add(double num1, double num2){
        return num1 + num2;
    }

    public double Subtract(double num1, double num2){
        return num1 - num2;
    }

    public double Multiply(double num1, double num2){
        return num1* num2;
    }

    public String Divede(double num1, double num2){
        if(num2 == 0){
            return "cannot devide by zero";
        }else{
            return "" +num1 / num2;
        }
    }
}
