public class MobileFactory extends AbstractFactory {

    @Override
    IProduct getMobile(String mobileType) {
        if(mobileType.equalsIgnoreCase("nokia")){
        return new Nokia();
    }else if (mobileType.equalsIgnoreCase("samsung")){
        return new Samsung();
    }else{
        return null;
    }
    }

    @Override
    IProduct getCar(String carType) {
        return null;
    }
    

 

}
