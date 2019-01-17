public class SimpleClass {

    int i,j;
    public static void main(String[] args) {

        System.out.println(new SimpleClass().getI());
        System.out.println(new SimpleClass().getJ());

    }

    SimpleClass (){
        i=10;
        j=20;
    }
    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
