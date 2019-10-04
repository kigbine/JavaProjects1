public class AverageArray {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] intList = new int[10];
        double[] doubleList = new double[10];

        System.out.print("Enter 10 digits for double value: ");
        for (int i = 0; i < doubleList.length; i++){
            doubleList[i] = input.nextDouble();
        }

        System.out.print("Enter 10 digits for integer value: ");
        for (int i = 0; i < intList.length; i++){
            intList[i] = input.nextInt();
        }

        System.out.println("Average value " + average(intList));

    }

    public static int average(int[] array){
        int average = 0;
        for (int i:array){
            average += i;

        }
        return average/ array.length;


    }

    public static double average(double[] array){
        double average = 0;
        for (double i:array){
            average += i;
        }
        return average / array.length;

    }
}
