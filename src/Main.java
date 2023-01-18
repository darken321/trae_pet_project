import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello TRAE!\n");
        List<Project> projects = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        List<String> categories = new ArrayList<>();
        //init.writeCategories(); // прописали категории в файл
//        categories = init.readCategories(); // читаем из файла
//        вывод категорий в файл
//        for (String s:categories){
//            System.out.println(s);
//        }
        init.writeEmployees();

        //https://javarush.com/groups/posts/2318-kompiljacija-v-java
        //В конструктор FileOutputStream можно также передать второй аргумент true. В этом случае, если файл существует, данные в него будут добавляться. Перезаписи файла не произойдет.
    }
}