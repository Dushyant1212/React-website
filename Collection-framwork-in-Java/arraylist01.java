import java.util.ArrayList;
import java.util.Iterator;

public class arraylist01 {
    public static void main(String[] args) {
        ArrayList<Integer> StudentName = new ArrayList<>();
        StudentName.add(20);
        StudentName.add(30);
        StudentName.add(40);
        StudentName.add(50);
        System.out.println(StudentName);
        //For loop Iterator
        for (int i=0;i<StudentName.size();i++){
            System.out.println("using For loop Iterator in Elements : "+StudentName.get(i));
        }

        //using foreach loop...
        for(Integer element : StudentName){
            System.out.println("ForEach Element Print : "+element);
        }

        //using the Interator...
        Iterator<Integer> elements = StudentName.iterator();
        while (elements.hasNext()){
            System.out.println("Iterator :  "+elements.next());
        }



    }
}
