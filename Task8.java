public class Task8 {

    public static void main(String[] args) {
        Task8 intSum = new Task8();
        
        int[] arrInput = {4, 5, 10};
        System.out.println("Output:");
        System.out.println("Total Sum: " + intSum.sumOfSums(arrInput));
    }

    public int sumOfSums(int... intInputs){
        int intCumSum = 0, intTriSum;
        
        for (int intInput : intInputs) {
            intTriSum = 0;
            for (int i = 1; i <= intInput; i++) {
                intTriSum += i;
            }
            intCumSum += intTriSum;
            System.out.println("Parameter " + intInput + ":" +
                "sum = " +  intTriSum + ", cumulative sum = " + intCumSum);
        }
        return intCumSum;
    }
}
