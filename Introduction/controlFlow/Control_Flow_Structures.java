class Control_Flow_Structures{
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        /*
         * While loop
         */

         while(i <= 6){
            sum =sum++;
            i++;     //increment
         }
         System.out.println(sum);

         /*
          * Do While Loop
          */

          do{
            sum = sum++;
            i++;
          }while(i <= 6);
          System.out.println(sum);

        /*
         * For Loop
         */

         for(int i = 1; i <= 6; i++){
            sum = sum++;
         }
         System.out.println(sum);

        /*
         *  Switch case
         */
        //  switch () {
        //     case value:
                
        //         break;
         
        //     default:
        //         break;
        //  }

        /*
         *  Continue Statement
         */

         for(int i = 1; i <= 100; i++){
            if((i % 2) == 0 && (i % 3) == 0 ){
                Continue;
                System.out.println(i);
            }
         }
    }
}