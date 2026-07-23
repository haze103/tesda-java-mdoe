public class Task2 {
    public static void main(String[] args) {
        char charH = 'H', charW = 'w', charR = 'r', charD = 'd';
        byte three = 3;
        short one = 1;
        int zero = 0;
        float fltVer = 2.0f;
        boolean bol = true;
        String strResult = " " + charH + three + one + one + zero + 
                            " " + charW + zero + charR + one + charD + 
                            " " + fltVer + " " + bol;
        System.out.println(strResult.trim());
    }
}
