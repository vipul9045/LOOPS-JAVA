public class AlphaPattern {
    public static void main(String[] args) {
        int size = 5 ;
        int alpha = 65 ;
        int num = 0 ;
        for ( int i = 0 ; i <= size ; i++){
            for ( int j = size ; j >=1 ; j--){
                System.out.print(" ");
            }
            for ( int k = 0 ; k < i*2-1 ; k++){
                System.out.println((char)(alpha + num++));
            }
            num = 0 ;System.out.println();
        }
        for ( int i = 1 ; i <= size -1 ; i++){
            for ( int j = 0 ; j<i ; j++){
                System.out.print(" ");
            }
            for ( int k = (size-i)*2-1 ; k>0 ; k--){
                System.out.println((char)(alpha + num ++));
            }
        }
    }
}
