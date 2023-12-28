public class FactoryShape {

  public FactoryShape() {

  }

  public IShape getShape(String shapeType) {

    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("Square")) {
      return new SQUARE();
    } else if (shapeType.equalsIgnoreCase("Line")) {
      return new Line();
    }else if(shapeType.equalsIgnoreCase("circle")){
      return new Circle();
    }
    return null;
  }
}
