import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import User.PhoneUser;

abstract class Match {
    abstract Map<Integer, PhoneUser> getRawData();

    abstract void appendRawData(Map<Integer, PhoneUser> t);
}

class StringFormat extends Match {

    Map<Integer, PhoneUser> text;

    @Override
    Map<Integer, PhoneUser> getRawData() {
        return text;
    }

    @Override
    void appendRawData(Map<Integer, PhoneUser> t) {
        text = t;
    }

}

class Word {
    Match model;

    public void setModel(Match model) {
        this.model = model;
    }

    TitleFormat format;

    public void appendData(Map<Integer, PhoneUser> text) {
        model.appendRawData(text);
    }

    public void setFormat(TitleFormat f) {
        format = f;
    }

    void click() {
        format.print(model.getRawData(), "PhoneBook");
    }
}

interface TitleFormat {
    void print(Map<Integer, PhoneUser> text, String header);
}

class XmlFormat implements TitleFormat {

    @Override
    public void print(Map<Integer, PhoneUser> text, String header) {
        try (FileWriter writer = new FileWriter("File/File.xml")) {
            writer.write("<xml>\n");
            writer.write("<XmlFormat>\n");
            writer.write(String.format("<%s>\n", header));
            for (int i = 0; i < 200; i++) {
                writer.write(text.get(i).getFullInformation());
                writer.write("\n");
            }
            writer.write(String.format("</%s>\n", header));
            writer.write("</XmlFormat>\n");
            writer.write("</xml>\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Сохранено в формате XML");
    }
}

class MdFormat implements TitleFormat {

    @Override
    public void print(Map<Integer, PhoneUser> text, String header) {
        try (FileWriter writer = new FileWriter("File/File.md")) {
            writer.write(String.format("# %s", header));
            for (int i = 0; i < 200; i++) {
                writer.write(String.format("\n* %s", text.get(i).getFullInformation()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Сохранено в формате MD");
    }
}

class TxtFormat implements TitleFormat {
    @Override
    public void print(Map<Integer, PhoneUser> text, String header) {
        try (FileWriter writer = new FileWriter("File/File.txt")) {
            writer.write(String.format("%s\n", header));
            for (int i = 0; i < 200; i++) {
                writer.write("\n");
                writer.write(text.get(i).getFullInformation());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Сохранено в формате txt");
    }

}
