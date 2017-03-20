/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Rhod3
 */
class decoratedReader extends Reader {
    Reader inputReader;

    public decoratedReader(Reader inputReader) {
        this.inputReader = inputReader;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        inputReader.read(cbuf, off, len);
        return 1;
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // Pas le temps de finir :(
    
}
