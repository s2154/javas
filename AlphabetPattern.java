package Assignment;
public class AlphabetPattern {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 0; i < n; i++) {
            char alphabet = 'A'; 

            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet);
                alphabet++; 
            }

            System.out.println(); 
        }
    }
}
