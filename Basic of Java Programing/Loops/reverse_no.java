public class reverse_no {
    public static void main(String args[]){
        int n = 28092006;
        while(n > 0){
            int last_dig = n%10;
            System.out.print(last_dig + " ");
            n = n/10;
        }
    }
}
