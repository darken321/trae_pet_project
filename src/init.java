import java.io.*;
import java.util.*;

public class init {
    static final String fileCategories = "C:\\java\\IdeaProjects\\Trae\\files\\categories.bin";
    static final String fileEmployees = "C:\\java\\IdeaProjects\\Trae\\files\\employees.bin";
    //запись категорий в файл
    public static void writeCategories() {
        List<String> list = new ArrayList<>();
        list.add("раскрой");
        list.add("кромка");
        list.add("присадка");
        list.add("фрезеровка");
        list.add("сборка");
        list.add("склейка");
        list.add("подготовка к покраске");
        list.add("шлифовка / покраска");
        list.add("подготовка к отгрузке / упаковка");
        list.add("отгрузка");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileCategories)))
        {
            oos.writeObject(list);
        } catch (IOException e) {
            throw new RuntimeException("Can't write/create file", e);
        }
    }
    //чтение категорий из файла
    public static List<String> readCategories() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileCategories))) {
            return  (List<String>) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException("Can't read file", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class exception", e);
        }
        //TODO проверить категории у работников, все ли категории, которые считаны, есть у работников.
    }
    //создание двух работников, работ, которые они могут выполнять, один из них конструктор, в файл
    public static void writeEmployees() {
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setUuid(111);
        emp1.setName("Иван");
        emp1.setSurname("Петров");
        Map<String, Boolean> op1 = new TreeMap<>();
        op1.put("раскрой", true);
        op1.put("кромка", false);
        op1.put("присадка", true);
        op1.put("фрезеровка", false);
        op1.put("сборка", false);
        op1.put("склейка", false);
        op1.put("подготовка к покраске", true);
        op1.put("шлифовка / покраска", false);
        op1.put("подготовка к отгрузке / упаковка", true);
        op1.put("отгрузка", false);
        emp1.setOperations(op1);
        emp1.setConstructor(false);
        emp1.setAdmin(false);
        employees.add(emp1);

        Employee emp2 = new Employee();
        emp2.setUuid(222);
        emp2.setName("Петр");
        emp2.setSurname("Иванов");
        Map<String, Boolean> op2 = new TreeMap<>();
        op2.put("раскрой", false);
        op2.put("кромка", true);
        op2.put("присадка", true);
        op2.put("фрезеровка", false);
        op2.put("сборка", false);
        op2.put("склейка", false);
        op2.put("подготовка к покраске", true);
        op2.put("шлифовка / покраска", false);
        op2.put("подготовка к отгрузке / упаковка", true);
        op2.put("отгрузка", true);
        emp2.setOperations(op2);
        emp2.setConstructor(true);
        emp2.setAdmin(false);
        employees.add(emp2);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileEmployees)))
        {
            oos.writeObject(employees);
        } catch (IOException e) {
            throw new RuntimeException("Can't write/create file", e);
        }
    }

    public static List<Employee> readEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileEmployees))) {
            return  (List<Employee>) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException("Can't read file", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class exception", e);
        }
    }
}


