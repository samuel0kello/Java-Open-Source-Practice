class variables{
    public static void main(String[] args) {

        /*
         * @parm Data types and variable Declaration
         */

         int age;
         String name;
         float height;
         double PI;
         boolean male;

         /*
          * @parm variables initialization
          */
          age = 21;
          name = "Samuel Okello";
          height = 5.6f;
          PI = 3.142;
          male = true;

          /*
           * @parm Various Operations
           */
          System.out.println(" Sum :" + (age + height ));
          System.out.println(" Difference " + ( age - height ));
          System.out.println(" Product" + ( age * height ));
          System.out.println(" Quotient" + ( age / height ));
          System.out.println(" Remainde" + ( age % height ));
          System.out.println(" Pre-increment" + ( ++age));
          System.out.println(age);
          System.out.println(" Post-increment" + ( age++));
          System.out.println(" Pre-decrement" + ( --age));
          System.out.println(" Post-decrement" + ( age--));

          /*
           * End
           */
    }
}