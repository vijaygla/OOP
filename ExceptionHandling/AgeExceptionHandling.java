public class AgeExceptionHandling {
    
    public  void validAge(int age) throws Exception {
        if(age < 18) {
            throw new Exception("You are not mature");
        }
        else {
            System.out.println("You are mature");
        }
    }
    public static void main(String[] args) {
        AgeExceptionHandling a = new AgeExceptionHandling();
        try {
            a.validAge(23);
            a.validAge(13);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


