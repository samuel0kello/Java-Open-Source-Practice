class sumOfOddNumbers{
    public static void main(String[] args) {

        int sum = 0;
        int num = 0;

        // Using for loop
        sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1) 
                sum += i;
        }
        System.out.println(sum);

        // Using do-while loop
        sum = 0;
        num = 1;
        do {
            if(num % 2 == 1) {
                sum += num;
            }
            num++;
        } while(num <= 100);

        System.out.println(sum);

        // Using while loop
        sum = 0;
        num = 1;
        while(num <= 100){
            if(num % 2 == 1) {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }
}