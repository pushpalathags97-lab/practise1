import java.util.ArrayList;
import java.util.List;
    public class list1{
        public static void main(String[] args){
            //syntax for list
            List<String> list = new ArrayList<>();
            list.add("siya");
            list.add("john");
            list.add("Nisha");
            list.add("bob");
            System.out.println("list of the student"+list);
            //access index
            System.out.println("Access the index element"+list.get(2));
            //removing list
            list.remove("siya");
            System.out.println("List of the student"+list);
            //update a list


        }
    }
