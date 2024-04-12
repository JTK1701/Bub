public class Main {
    public static void main(String[] args) {
        char sp = ' ';
        char b = 'B';
        int line = 0;
        int column = 0;
        while (column < 10 ) {
            while (line < 20) {
                if (line == 0 || line == 19 || column == 0 || column == 9) {
                    System.out.print(b);
                } else {
                    System.out.print(sp);
                }
                line++;
            }
            line = 0;
            column++;
            System.out.println(" ");
        }


        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        int line2 = 0;
        int column2 = 0;
        //int lineSp = 1;
        while (column2 < 10) {
            while (line2 < 20) {
                while (line2 > 0 && line2 < 19 && column2 > 0 && column2 < 9) {
                    while (line2 == 19) {
                        System.out.print(b);
                        line2++;
                    }
                    System.out.print(sp);
                    line2++;
                }
                System.out.print(b);
                line2++;
            }
            line2 = 0;
            column2++;
            System.out.println(" ");
        }
    }
}

