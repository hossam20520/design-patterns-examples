public class FactoryProducer {
    


    public static AbstractFactory getFactory(String factoryName){

        if(factoryName.equalsIgnoreCase("mobiles")){
            return new MobileFactory();
        }else if (factoryName.equalsIgnoreCase("cars")){
            return new CarFactory();
        }else{
            return null;
        }

    }
}
