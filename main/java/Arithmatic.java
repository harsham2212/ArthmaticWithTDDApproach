public class Arithmatic {
    public int add(int num1, int num2) {
        return  num1 + num2;
    }

    public int operationSupportProvider(int option, int num1, int num2) {
//        switch (option){
//            case 1:
//                return num1 + num2;
//
//            case 2:
//                return  num1 - num2;
//
//            case 3:
//                return  num1 * num2;
//
//            case 4:
//                return num1 / num2;
//
//            default:
//                System.out.println("Please select valid option");
//                break;
//        }
//        if(option == 1){
//            return num1 + num2;
//        }
//        else if (option == 2){
//            return num1 - num2;
//        }
//        else if (option == 3){
//            return num1 * num2;
//        }
//        else if (option == 4){
//            return num1 / num2;
//        }
//        else {
//            System.out.println("please select valid option");
//        }
        return 0;
    }

    public double addNoBetweenRange(int choose, int rang1, int rang2) {
        int sum = 0;
//        for (int i=rang1; i<= rang2;i++){
//            sum = sum + i;
//    }
//        int i = rang1;
//        while (i <= rang2){
//            sum = sum + i;
//            i++;
//        }
//        }
        addbetweenNo addbetweenNo = new addbetweenNo();
        switch (choose){
            case 1:
                return addbetweenNo.add(rang1,rang2);

            case 2:
                return addbetweenNo.subtract(rang1,rang2);

            case 3:
                return  addbetweenNo.multiply(rang1,rang2);

            case 4:
                return addbetweenNo.division(rang1, rang2);

            default:
                System.out.println("please enter valid number");
                break;
        }
        return sum;
    }

}
