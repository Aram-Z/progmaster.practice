package OOP;

public class Main {
    public static void main(String[] args) {


                StringBuilder sb = new StringBuilder("0123456789");
                sb.delete(3, 6);
                sb.insert(2, "-");
                System.out.println(sb);
            }
        }
