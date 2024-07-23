import java.util.ArrayList;
import java.util.List;

public class problem {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("burger");
        arrayList.add("hotdog");
        arrayList.add("pho");
        arrayList.add("pizza");
        arrayList.add("sushi");

        arrayList.set(2, "banh mi");
        
        arrayList.remove(3);

        arrayList.add(3, "pizza");

        
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        
        System.out.println(arrayList.contains("sushi"));

        System.out.println(arrayList.indexOf("dxbdv"));

        List<String> subList = arrayList.subList(1, arrayList.size()-1);
        System.out.println(subList);
        
        arrayList.clear();
    }
}
