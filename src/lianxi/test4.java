package lianxi;


import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test4 {

        public void object2File(Object o, File file) throws IOException {
            FileWriter writer = new FileWriter(file);
            try {
                ObjectMapper m = new ObjectMapper();
                m.writeValue(writer, o);
            } finally {
                writer.close();
            }
        }

        public Object file2Object(File file, Class clazz) throws IOException {
            FileReader reader = new FileReader(file);
            try {
                ObjectMapper m = new ObjectMapper();
                return m.readValue(reader, clazz);
            } finally {
                reader.close();
            }
        }
    }


