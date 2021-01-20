public class addbetweenNo {
    public int add(int num1, int num2) {
        int sum = 0;
        for (int i =num1; i<=num2;i++) {
            sum = sum + i;
        }
        return sum;
    }
    public int subtract(int num1, int num2){
        int sum = 0;
        for (int i= num1;  i<=num2; i++) {
            sum = sum - i;
        }
        return sum;
    }
    public int multiply(int num1, int num2) {
        int sum = 1;
        for (int i= num1; i<=num2; i++){
            sum = sum * i;
        }
        return sum;
    }
    public double division(double num1, double num2){
        double sum = 1;
        for(double i= num1; i<=num2; i++){
            sum = sum / i;
            System.out.println(sum);
        }
        return sum;
    }
}