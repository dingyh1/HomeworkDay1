package homework1_3_3;






public class TextMUIBlank {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i+ "=" + (j*i) +"\t");
//					System.out.print(j + "*" + i + "=" + (i * j < 10 ? (" " + i * j) : i * j) + "  ");
            }
            System.out.println();
        }
    }
}






