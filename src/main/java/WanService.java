import io.mcdostone.Equipment;

import java.util.ArrayList;
import java.util.List;

public class WanService {

    private List<Equipment> equipments;

    public WanService() {
        this.equipments = new ArrayList<Equipment>();
    }

    public void registerEquipment(Equipment e) {
        this.equipments.add(e);
    }

    public void removeEquipment(Equipment e) {
        this.equipments.remove(e);
    }
}
