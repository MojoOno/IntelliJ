import java.util.ArrayList;

public class KitchenShelf {
    private final ArrayList<KitchenEquipment> equipmentList = new ArrayList<>();

    private final String item;

    public KitchenShelf(String item) {
        this.item = item;
    }

    public void addEquipment(KitchenEquipment item){
        equipmentList.add(item);
    }
    public void removeEquipment(KitchenEquipment item){
        if(equipmentList.contains(item)){
            equipmentList.remove(item);
        }else{
            System.out.println("\"" + item + "\" is not in list\n");
        }
    }

    public void displayKitchenShelf(){
        StringBuilder output = new StringBuilder(item + "\n");
        for(KitchenEquipment e : equipmentList){
            output.append("* ").append(e).append(",\n");
        }
        System.out.println(output);
    }

    @Override
    public String toString() {
        return "KitchenShelf{" +
                "equipmentList=" + equipmentList +
                '}';
    }
}
