public class Answer9 {
    public static void main(String[] args) {

        try {
            new CustomException("Caused Error ");
        } catch (CustomException e) {
            e.printStackTrace();
        } 
    }
}

class CustomException extends RuntimeException {

    public CustomException(String message){
        // calling constructor of RuntimeException class with parameter (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
        super(message,null,false,false);
    }
}
