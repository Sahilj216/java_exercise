public class Answer7 {
    public static void main(String[] args) {
        String[] names = {"Alice", null, "Charlie"};

        try {
            int length = names[1].length(); // null error 
            int len = names[5].length(); // index out of bound
            System.out.println("Name length: " + length);

        } catch (NullPointerException e) {
            System.out.println("Caught error: " + e);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Caught error: " + e);
        }finally {
            System.out.println("Finished checking name.");
        }
    }
}
