abstract class Match {
    public abstract Dictionary<int, PhoneUser> getRawData();

    public abstract void appendRawData(Dictionary<int, PhoneUser> t);
}

class StringFormat : Match {

    Dictionary<int, PhoneUser> text = new Dictionary<int, PhoneUser>();

    
    public override Dictionary<int, PhoneUser> getRawData() {
        return text;
    }

    
    public override void appendRawData(Dictionary<int, PhoneUser> t) {
        text = t;
    }

}

class Word {
    Match model = new StringFormat();

    public void setModel(Match model) {
        this.model = model;
    }

    TitleFormat format = new XmlFormat();

    public void appendData(Dictionary<int, PhoneUser> text) {
        model.appendRawData(text);
    }

    public void setFormat(TitleFormat f) {
        this.format = f;
    }

    public void click() {
        format.print(model.getRawData(), "PhoneBook");
    }
}

interface TitleFormat {
    public void print(Dictionary<int, PhoneUser> text, String header);
}

class XmlFormat : TitleFormat {

    async void TitleFormat.print(Dictionary<int, PhoneUser> text, String header) {
        using (StreamWriter writer = new StreamWriter("File/File.xml", false)){
            await writer.WriteAsync("<xml>\n");
            await writer.WriteAsync("<XmlFormat>\n");
            await writer.WriteAsync(String.Format("<{0}>\n", header));
            for (int i = 0; i < 200; i++) {
                await writer.WriteAsync(text[i].getFullInformation());
                await writer.WriteAsync("\n");
            }
            await writer.WriteAsync(String.Format("</{0}>\n", header));
            await writer.WriteAsync("</XmlFormat>\n");
            await writer.WriteAsync("</xml>\n");
            writer.Close();
        }
        Console.WriteLine("Сохранено в формате XML");
    }
}

class MdFormat : TitleFormat {

    async void TitleFormat.print(Dictionary<int, PhoneUser> text, String header) {
        using (StreamWriter writer = new StreamWriter("File/File.md", false)){
            await writer.WriteLineAsync(String.Format("# {0}\r\n", header));
            for (int i = 0; i < 200; i++) {
                await writer.WriteLineAsync(String.Format("* {0}", text[i].getFullInformation()));
            }
            writer.Close();
        }
        Console.WriteLine("Сохранено в формате MD");
    }
}

class TxtFormat : TitleFormat {

    async void TitleFormat.print(Dictionary<int, PhoneUser> text, String header) {
        using (StreamWriter writer = new StreamWriter("File/File.txt", false)){
            await writer.WriteLineAsync(String.Format("{0}\r\n", header));
            for (int i = 0; i < 200; i++) {
                await writer.WriteLineAsync(String.Format("{0}", text[i].getFullInformation()));
            }
            writer.Close();
        }
        Console.WriteLine("Сохранено в формате TXT");
    }

}

class HtmlFormat : TitleFormat {

    async void TitleFormat.print(Dictionary<int, PhoneUser> text, String header) {
        using (StreamWriter writer = new StreamWriter("File/File.html", false)){
            await writer.WriteAsync("<html>\n");
            await writer.WriteAsync(" <title>Страница с именами</title>\n");
            await writer.WriteAsync(" <body>\n");
            await writer.WriteAsync(String.Format("  <header>{0}</header>\n", header));
            await writer.WriteAsync("  <ul>\n");

            for (int i = 0; i < 200; i++) {
                await writer.WriteAsync($"   <li>{text[i].getFullInformation()}</li>\r\n");
            }
            await writer.WriteAsync("  </ul>\n");
            await writer.WriteAsync(" </body>\n");
            await writer.WriteAsync("</html>\n");
            writer.Close();
        }
        Console.WriteLine("Сохранено в формате HTML");
    }

}
