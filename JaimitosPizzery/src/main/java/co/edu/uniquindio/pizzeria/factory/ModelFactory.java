package co.edu.uniquindio.pizzeria.factory;

public class ModelFactory {

    private static ModelFactory modelFactory;

    private Pizzeria pizzeria;

    private ModelFactory(){

        pizzeria = new Pizzeria();
    }

    public static ModelFactory getInstance(){

        ModelFactory ModelFactory = null;
        if(ModelFactory == null){
            ModelFactory = new ModelFactory();

        }
        return ModelFactory;
    }
}
