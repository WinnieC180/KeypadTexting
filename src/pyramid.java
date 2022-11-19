public class pyramid {
    public static void main(String[] arg) {
        for (int i=0; i<=7; i++) {
            for (int j = 7 - i; j >= 0; j--) {
                System.out.print("\t");
            }
            System.out.print("1" + "\t");
            int pow = (int) Math.pow(2, i);
            for (int x = 2; x <= pow; x *= 2) {
                System.out.print(x + "\t");
            }

            for (int y = pow / 2; y > 1; y /= 2) {
                System.out.print(y + "\t");
            }
            if (i != 0) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
