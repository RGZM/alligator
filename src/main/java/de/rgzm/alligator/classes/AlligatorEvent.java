package de.rgzm.alligator.classes;

import java.util.HashMap;
import java.util.List;
import org.json.simple.JSONObject;

public class AlligatorEvent {

    public String id = "";
    public String name = "";
    public double x = -42.0;
    public double y = -42.0;
    public double z = -42.0;
    public double a = -42.0;
    public double b = -42.0;
    public boolean fixed = false;
    public boolean startFixed = false;
    public boolean endFixed = false;
    public HashMap distances;
    public HashMap distancesNormalised;
    public JSONObject nextFixedStartNeighbour = new JSONObject();
    public JSONObject nextFixedEndNeighbour = new JSONObject();
    public String nn_start_name = null;
    public String nn_end_name = null;
    public String nn_start_id = null;
    public String nn_end_id = null;
    public String floating = "foo";
    public HashMap allenRelations;
    
    public String toString() {
        return id + " " + name + " " + x + " " + y + " " + z + " " + a + " " + b + " " + fixed + " " + startFixed + " " + endFixed;
    }

}
