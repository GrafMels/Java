import java.io.FileWriter;
import java.io.IOException;

public class Program {
  public static String header = "Мойдодыр";

  public static void main(String[] args) {

    Word document = new Word();
    document.setModel(new StringFormat());
    document.appendData("Eдеяло\nУбежало,\nУлетела простыня,\nИ подушка,\nКак лягушка,\nУскакала от меня.",
        header);

    document.setFormat(new XmlFormat());
    document.click();

    document.appendData("\n\nЯ за свечку,\nСвечка — в печку!\nЯ за книжку,\nТа — бежать\nИ вприпрыжку\nПод кровать!",
        header);
    document.setFormat(new MdFormat());
    document.click();

    document.setFormat(new TxtFormat());
    document.click();
  }
}

abstract class Model {
  abstract String getRawData();

  abstract void appendRawData(String t);
}

class StringFormat extends Model {

  String text = "";

  @Override
  String getRawData() {
    return text;
  }

  @Override
  void appendRawData(String t) {
    text += t;
  }

}

class Word {
  Model model;

  public void setModel(Model model) {
    this.model = model;
  }

  TitleFormat format;

  public void appendData(String text, String header) {
    model.appendRawData(text);
  }

  public void setFormat(TitleFormat f) {
    format = f;
  }

  void click() {
    format.print(model.getRawData(), Program.header);
  }
}

interface TitleFormat {
  void print(String text, String header);
}

class XmlFormat implements TitleFormat {

  @Override
  public void print(String text, String header) {
    try (FileWriter writer = new FileWriter("File.xml")) {
      writer.write("<xml>\n");
      writer.write("<XmlFormat>\n");
      writer.write(String.format("<%s>\n", header));
      writer.write(text);
      writer.write(String.format("\n</%s>\n", header));
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
  public void print(String text, String header) {
    try (FileWriter writer = new FileWriter("File.md")) {
      writer.write(String.format("# %s\n", header));
      writer.write(text);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Сохранено в формате MD");
  }

}

class TxtFormat implements TitleFormat {

  @Override
  public void print(String text, String header) {
    try (FileWriter writer = new FileWriter("File.txt")) {
      writer.write(String.format("%s\n\n", header));
      writer.write(text);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Сохранено в формате txt");
  }

}
