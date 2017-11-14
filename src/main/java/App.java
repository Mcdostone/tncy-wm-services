import io.mcdostone.Equipment;
import io.mcdostone.EquipmentType;

public class App {

    public static void main(String[] args) {
        Equipment equipment = new Equipment("frisbee", new EquipmentType());
        System.out.println(equipment);
    }
}
