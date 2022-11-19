public class Pattern {
    public static void main(String[] arg) {
        for (int i=1; i<=6; i++) {
            for (int j = 6-i; j >=1; j--) {
                System.out.print("   ");
            }
            for (int x = i; x>=1; x--) {
                System.out.print(x + "     ");
            }
            System.out.println();
        }

        for (int i=1; i<=6; i++) {
            for (int j = 6-i; j >=1; j--) {
                System.out.print("  ");
            }
            for (int k=i; k>=1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i= 6; i>=1; i--) {
            for (int j = 6-i; j>=1; j--){
                System.out.print("  ");
            }
            for (int x = 1; x<=i; x++){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        for(int i=0; i<=6; i++){
            for(int j=0; j < i ; j++) {
                System.out.print("  ");
            }
            for(int k=0; k<6-i; k++){
                System.out.print(k+1 + " ");
            }
            System.out.println();
        }
    }
}
