class MyRangeException extends Exception { // checked exception
    public String toString() { return "MyRangeException" ; }
    }
    class MyNumberException extends RuntimeException { // unchecked exception
        public String toString() { return " MyNumberException " ; }
    }
    public class CheckedException {
        private static void write() throws IOException, MyRangeException {
            FileReader fin = new FileReader("employee.txt") ;
            throw new MyNumberException() ;
            throw new MyRangeException() ;
        }
        public static void main(String[] args) throws IOException, MyRangeException {
            write() ;
        }
    }
