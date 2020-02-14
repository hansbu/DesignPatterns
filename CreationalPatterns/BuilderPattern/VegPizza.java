package CreationalPatterns.BuilderPattern;

/**
 *
 * @author Ashwani
 */
public abstract class VegPizza implements Item {

    @Override
    public abstract float price();

    
    @Override
    public abstract  String name();
 
    @Override
    public abstract  String size();
    
}
