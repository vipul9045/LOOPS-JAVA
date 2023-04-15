import java.util.Scanner;

public class RowColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for ( int i = 1 ; i < r ; i++){
            for ( int j = 0 ; j < r ; j++){
                if ( i == r/2 ){
                    System.out.print("*");
                }
                else if ( j == r/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
