public class reverse_the_no {
    public static void main(String args[]){
        int n = 28092006;
        int last, rev = 0;
        while (n > 0){
            last = n%10;
            rev = (rev*10)+last;
            n = n/10;
        }
        System.out.println(rev);
    }
}
