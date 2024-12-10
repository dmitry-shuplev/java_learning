public class FizBaz {
    public static void main(String[] args) {
        fizBuz(3, 30);
    }

    public static void fizBuz(int begin, int finish) {
        if (finish >= begin) {
            for (int i = begin; i <= finish; i++) {
                System.out.println(isFizOrBuz(i));
            }
        }
    }

    public static String isFizOrBuz(int num) {
        String fob = "";
        if (num % 3 == 0) {
            fob = fob + "Fiz";
        }
        if (num % 5 == 0) {
            fob = fob + "Buz";
        } else if (num % 3 != 0) {
            fob = fob + num;
        }
        return fob;
    }
}
