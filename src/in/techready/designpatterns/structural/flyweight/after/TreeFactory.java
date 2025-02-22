package in.techready.designpatterns.structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

// TreeFactory class to manage shared TreeFlyweight instances
public class TreeFactory {
    private static Map<String, TreeFlyweight> treeFlyweights = 
                                              new HashMap<>();

    public static TreeFlyweight getTreeFlyweight(String type){
        treeFlyweights.computeIfAbsent(type, 
                                       TreeFlyweight::new);
        return treeFlyweights.get(type);
    }
}