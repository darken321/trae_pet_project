import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        init.writeCategories();
//        init.readEmployees();
        System.out.println("Hello TRAE!\n");
        List<Project> projects = new ArrayList<>();
        List<Employee> employees = init.readEmployees();
        List<String> categories = init.readCategories();

//        вывод категорий в консоль
        for (String s:categories){
            System.out.println(s);
        }
//        вывод служащих в консоль
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //https://javarush.com/groups/posts/2318-kompiljacija-v-java
        //В конструктор FileOutputStream можно также передать второй аргумент true. В этом случае, если файл существует, данные в него будут добавляться. Перезаписи файла не произойдет.
    }
}