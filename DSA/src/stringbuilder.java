public class stringbuilder {
    public static void main(String[] args){
        StringBuilder  SB =new StringBuilder("HEllo");
        System.out.println(SB.append("java programming"));
        System.out.println(SB.insert(5,"java"));
        System.out.println((SB.reverse()));
        System.out.println(SB.delete(5,10));
        System.out.println(SB.length());
    }
}
