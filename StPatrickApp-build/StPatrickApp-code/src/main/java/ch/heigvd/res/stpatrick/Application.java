package ch.heigvd.res.stpatrick;


/**
 * 
 * @author Olivier Liechti
 */
public class Application {

  IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();
  IStreamDecoratorController decoratorController = new StreamDecoratorController();
  
  public IStreamProcessorsFactory getStreamProcessorsFactory() {
    return processorsFactory;
  }

  IStreamDecoratorController getStreamDecoratorController() {
    return decoratorController;
  }
}
