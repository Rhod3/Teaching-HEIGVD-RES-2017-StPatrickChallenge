package ch.heigvd.res.stpatrick;

import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author Nicolas Rod
 */
public class StreamDecoratorController implements IStreamDecoratorController {

    @Override
    public Reader decorateReader(Reader inputReader) {
        return new decoratedReader(inputReader);
    }

    // Manque la classe decoratedWriter à implémenter, pas le temps de le faire :(
    @Override
    public Writer decorateWriter(Writer outputWriter) {
        return new decoratedWriter(inputWriter);
    }
    
}
