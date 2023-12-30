
public class AbstractFactoryDemo {

public static void main(String[] args) {
       

 

      AbstractFactory superFactory = FactoryProducer.getFactory("cars");
      IProduct product = superFactory.getCar("lamborgini");
      product.Build();


        // CarFactory carFactory = new CarFactory();
        // IProduct product_1 = carFactory.getCar("lamborgini");
        // product_1.Build();


        // MobileFactory mobileFactory = new MobileFactory();
        // IProduct product = mobileFactory.getMobile("samsung");
        // product.Build();


}
     
}
