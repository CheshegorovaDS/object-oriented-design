package pillars;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

// Фабрика легковесов решает, когда нужно создать новый
// легковес, а когда можно обойтись существующим.

public class PillarFactory {
    static Map<String,PillarType> pillarTypes = new HashMap<>();

    public static PillarType getPillarType(String name, Color color, String otherPillarData){
        PillarType result = pillarTypes.get(name);
        if (result == null) {
            result = new PillarType(name, color, otherPillarData);
            pillarTypes.put(name, result);
        }
        return result;
    }
}
