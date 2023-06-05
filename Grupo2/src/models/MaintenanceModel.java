package models;
import java.util.List;
public class MaintenanceModel {
    private List<MachineModel> machines;

    public MaintenanceModel( List<MachineModel> machines) {this.machines = machines;}

    public List<MachineModel> getMachines(){return machines;}
}
