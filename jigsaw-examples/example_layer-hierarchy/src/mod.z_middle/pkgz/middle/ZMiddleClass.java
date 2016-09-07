package pkgz.middle;

import java.lang.reflect.Layer;

import pkglayer.LayerHierarchy;

public class ZMiddleClass {
    public String doIt() {
        Layer myLayer = this.getClass().getModule().getLayer();
        String layerName  = LayerHierarchy.getLayerName(myLayer);
        String layerLevel = LayerHierarchy.getLayerLevel(myLayer);

        return "\t" + this.toString() + " [ " + ZMiddleClass.class
            + ", module " + this.getClass().getModule().getName() 
            + ", layer '" + layerName + "' on level '" + layerLevel + "' (" + myLayer + ") ]"

            + "\n\tplus " + new pkgz.top.ZTopClass().doIt();
    }
}