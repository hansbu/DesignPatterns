package CreationalPatterns.BuilderPattern;

/**
 *
 * @author Ashwani
 */
public class LargePepsi extends Pepsi{
    @Override
    public String name() {
       return "750 ml Pepsi";
    }

    @Override
    public String size() {
        return "Large Size";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
