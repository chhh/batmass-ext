/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package umich.ms.batmass.lookupviewer;

import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;

/**
 *
 * @author Geertjan
 */
public class LookupNode extends BeanNode<Object> {

    public LookupNode(Object bean, Children kids) throws IntrospectionException {
        super(bean);
        setDisplayName(bean.getClass().getCanonicalName());
        setChildren(kids);
    }
    
}
