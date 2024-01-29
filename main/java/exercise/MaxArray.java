package exercise;

public class MaxArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 3, 8};
        int min = Integer.MAX_VALUE;
        for(int num:numbers){
            if(min<num){
                min=num;
            }
        }
        System.out.println("max no is :" + min);
    }

}
