/**
 * number_pyramid
*/
public class number_pyramid {

    public static void main(String[] args) {
        
        // first method

        int a = 9;
        int num = 1;

        for ( int i=1; i<=a; i++){

            for ( int j=1; j<=a-i; j++){
                System.out.print(" ");
            }

            for ( int j=1; j<=i; j++){
                System.out.print(num + " ");
            }

            num++;
            System.out.println();
        }
    
        // Second method

        int n = 9;

        for ( int i=1; i<=n; i++){

            //space
            int space = ( n-i );
            for ( int j=1; j<=space; j++){
                System.out.print(" ");
            }

            // star 
            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }
}

