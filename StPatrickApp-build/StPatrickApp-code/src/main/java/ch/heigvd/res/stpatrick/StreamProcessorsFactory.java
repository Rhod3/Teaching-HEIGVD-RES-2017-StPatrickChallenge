package ch.heigvd.res.stpatrick;

/**
 * This class is responsible for providing different types of Stream Processors.
 * 
 * @author Olivier Liechti
 */
public class StreamProcessorsFactory implements IStreamProcessorsFactory {

  @Override
  public IStreamProcessor getProcessor() {
    return new BasicStreamProcessor();
  }

  @Override
  public IStreamProcessor getProcessor(String processorName) throws UnknownNameException {
      IStreamProcessor p;
      if (processorName.equals("e-remover")){
          p = new ERemoverStreamProcessor();
      } else {
          p = new BasicStreamProcessor();
      }
      return p;
  }

}
