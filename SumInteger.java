public class SumInteger{

    public static void main(String[] args) {
        System.out.println(findSum("PRA12Ga782d45601$3"));
    }

    public static int findSum(String nums){
        int sum = 0;

        int a = 0;

        for(int i = 0; i < nums.length(); i++){

            if(Character.isDigit(nums.charAt(i))){
                a = a * 10 + nums.charAt(i) - '0';
            }else{
                sum += a;
                a=0;
            }
        }
        if(a != 0) sum += a;
        
        return sum;
    }
}
