public class Stringmethod {
    public static void main(String[] args){
        String name="Hello java";
        String x="Hello-java";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(0,5));
        System.out.println(x);
        System.out.println(x.charAt(6));
        System.out.println(name.equals(x));
        System.out.println(name + x);
        System.out.println(name.replace('o','a'));
        System.out.println(name.isEmpty());



    }
}
