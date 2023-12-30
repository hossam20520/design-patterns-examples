public class CarFactory extends AbstractFactory  {

    @Override
   public  IProduct getMobile(String mobileType) {
       return null;
    }

    @Override
  public  IProduct getCar(String carType) {

      if(carType.equalsIgnoreCase("lamborgini")){
        return new Lamborgini();
    }else if(carType.equalsIgnoreCase("ferrari")){
        return new Ferrari();
    }else{
        return null;
    }


    }
    

//   public IProduct getCar(String carType){

//     if(carType.equalsIgnoreCase("lamborgini")){
//         return new Lamborgini();
//     }else if(carType.equalsIgnoreCase("ferrari")){
//         return new Ferrari();
//     }else{
//         return null;
//     }

//   }

}
