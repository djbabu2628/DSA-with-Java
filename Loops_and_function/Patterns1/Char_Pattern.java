public class Char_Pattern{
    public static void main(String args[]){
        char ch='A';
        for(int line=0;line<=4;line++){
            for(int j=0;j<=line;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}