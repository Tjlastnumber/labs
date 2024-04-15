package com.lab.tikalab;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

class TikaLabApplicationTests {

    @Test
    void contextLoads() throws TikaException, IOException, SAXException {
        System.out.println("s = " + parseToPlainTextChunks());
    }

    public String parseToPlainTextChunks() throws IOException, SAXException, TikaException {
        Tika tika = new Tika();
        try (InputStream stream = TikaLabApplicationTests.class.getResourceAsStream("/test.pdf")) {
            return tika.parseToString(stream);
        }
    }
}
