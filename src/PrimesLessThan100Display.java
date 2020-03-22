public class PrimesLessThan100Display {
    public static void main(String[] args) {
        int index = 2;
        System.out.println("Primes less than 100: ");
        while (index < 100) {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(index)) {
                if (index % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.print(index + " ");
            }
            index++;
        }
    }
}
