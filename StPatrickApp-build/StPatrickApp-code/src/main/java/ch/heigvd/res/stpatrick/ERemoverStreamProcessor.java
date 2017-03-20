package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * The responsibility of this class is to read characters from an input
 * reader, and to write them to an output writer if it's not the character w.
 * 
 * Note: clients do not instantiate this class directly. They obtain instances
 * of this class via the StreamProcessorsFactory.
 * 
 * @author Nicolas Rod
 */
class ERemoverStreamProcessor implements IStreamProcessor {

  @Override
  public void process(Reader in, Writer out) throws IOException {
    BufferedReader br = new BufferedReader(in);
    BufferedWriter bw = new BufferedWriter(out);
    int c = br.read();
    while (c != -1) {
      c = br.read();
      if (Character.toChars(c)[0] != 'e'){
          bw.write(c);
      }
    }
    bw.flush();
  }

}
