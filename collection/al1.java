import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
        ArrayList al = new ArrayList();
        al.add(100); // Integer Object
        al.add("A"); // String object
        al.add(true); // Boolean object
        al.add(20.5); // Double object

        System.out.println(al);
    }
}