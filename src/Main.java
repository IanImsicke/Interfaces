//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static <T> ArrayList<T> collectAll(T[] objects, Filter filter) {
        ArrayList<T> result = new ArrayList<>();
        for (T obj : objects) {
            if (filter.accept(obj)) {
                result.add(obj);
            }
        }
        return result;
    }
}
