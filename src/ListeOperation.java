import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ListeOperation {

    private static HashMap<Integer, Operation> operations = new HashMap<Integer, Operation>();

    public static void addOperation(Operation operation) {
        operations.put(operation.getId(), operation);
    }

    public static Map<Integer, Operation> getOperationsByCarteId(Integer carteId) {
        Map<Integer, Operation> res = operations.entrySet().stream()
                .filter(o -> carteId.equals(o.getValue().getCarteId()))
                .collect(Collectors.toMap(o -> o.getKey(), o -> o.getValue()));
        for (Object o : res.keySet()) {
            operations.get(o).printOperation();
            System.out.println("\n");
        }
        return res;
    }

    public static Map<Integer, Operation> getOperationsInWeek(Integer carteId) {
        Calendar currentCalendar = Calendar.getInstance();
        int week = currentCalendar.get(Calendar.WEEK_OF_YEAR);
        int year = currentCalendar.get(Calendar.YEAR);
        Calendar targetCalendar = Calendar.getInstance();

        Map<Integer, Operation> res = ListeOperation.getOperationsByCarteId(carteId);

        res = res.entrySet().stream()
                .filter(o -> {
                    targetCalendar.setTime(o.getValue().getDate());
                    int targetWeek = targetCalendar.get(Calendar.WEEK_OF_YEAR);
                    int targetYear = targetCalendar.get(Calendar.YEAR);
                    return week == targetWeek && year == targetYear;
                })
                .collect(Collectors.toMap(o -> o.getKey(), o -> o.getValue()));
        return res;
    }

    public static Map<Integer, Operation> getOperationsByPartenaireId(Integer partenaireId, Municipalite m) {
        Map<Integer, Operation> res = operations.entrySet().stream()
                .filter(o -> m.getNom().equals(o.getValue().getMunicipalite().getNom()))
                .collect(Collectors.toMap(o -> o.getKey(), o -> o.getValue()));
        return res.entrySet().stream().filter(o -> partenaireId.equals(((Operation) o.getValue()).getPartenaireId()))
                .collect(Collectors.toMap(o -> o.getKey(), o -> o.getValue()));
    }

}
