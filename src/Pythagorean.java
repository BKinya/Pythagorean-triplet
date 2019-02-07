public class Pythagorean {
    public static void main(String[] args){
        System.out.println(getPythagoreanTriplet());
    }

    /**
     * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
     * a2 + b2 = c2
     * @return
     */

    public static String getPythagoreanTriplet(){

        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c)  // Note: This implies b < c
                    return Integer.toString(a * b * c);
            }
        }
        throw new AssertionError("Not found");

    }
}
