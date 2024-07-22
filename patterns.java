public class patterns {
    public static void main(String args[]){
        int n=5;
        // int m=8;

        //Hollow Rectangle
        /*
         * * * * *
         *       *
         *       *
         * * * * *
         */
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1 || j==1 || i==n || j==m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.err.print(" ");
        //         }
        //     }
        //     System.out.print("\n");
        // }

        /* 
         *
         * *
         * * *
         * * * *
         */

        //  for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        /*
             *
            **
           ***
          **** 
         */

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i+j>=5){
        //             System.err.print("*");
        //         }
        //         else{
        //             System.err.print(" ");
        //         }
        //     }
        //     System.out.print("\n");
        // }


        /*
            1
            12
            123
            1234
         */

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.print("\n");
        // }
        

        /*
            12345
            1234
            123
            12
            1
         */
        // for(int i=5;i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.print("\n");
        // }


        /*
            1 
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
         */

        // int num = 1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num + " ");
        //         num +=1;
        //     }
        //     System.out.print("\n");
        // }


        /*
            1 
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
         */

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum = i+j;
        //         if(sum%2==0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.print("\n");
        // }

        /*
            *        *
            **      **
            ***    ***
            ****  ****
            **********
            **********
            ****  ****
            ***    ***
            **      **
            *        *
         */

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
            
        //     int spaces = 2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
            
        //     int spaces = 2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }

        /*
                 *****
                *****
               *****
              *****
             *****
         */
        // for(int i=1;i<=n;i++){
        //     for(int j=i-1;j<n;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");  

            }

            // for(int j=i-1;j<n;j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
}
