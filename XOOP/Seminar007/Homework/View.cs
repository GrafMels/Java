public class View {
    public static int range = 200;
    public static string[] phoneNumber = new string[range];
    public static string[] fullName = new string[range];
    public static string[] birth = new string[range];
    public static string[] fullInform = new string[range];

    // public void scaneClose() {
    //     Scanner iScane = new Scanner(System.in);
    //     iScane.close();
    // }
    public static async void readFirstAsync() {
        using (StreamReader reader = new StreamReader("Import/UserPhoneNumbers.txt"))
        {
            string text = await reader.ReadToEndAsync();
            phoneNumber = text.Split("\r\n");
        }

        using (StreamReader reader = new StreamReader("Import/UserFullName.txt"))
        {
            string text = await reader.ReadToEndAsync();
            fullName = text.Split("\r\n");
        }

        using (StreamReader reader = new StreamReader("Import/UserBirth.txt"))
        {
            string text = await reader.ReadToEndAsync();
            birth = text.Split("\r\n");
        }
    }

    public static async void readSubsequent() {
        Console.WriteLine("Выберете с какого файла считать: \n1. XML\n2. MD\n3. TXT\n4. HTML");
        bool check = true;
        int x = 404;
        int NewNumber = 404;
        while (check == true) {
            String? number = Console.ReadLine();
            if (Int32.TryParse(number, out x)) {
                NewNumber = Int32.Parse(number);
                if (NewNumber > 0 && NewNumber < 5) {
                    check = false;

                } else {
                    Console.WriteLine("Вы ввели неверное число введите ещё раз: ");
                }
            } else {
                Console.WriteLine("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            }
        }

        if (NewNumber == 1 && Model.open[0]) {
            using (StreamReader reader = new StreamReader("File/File.xml")){
                string[] separators = new string[] { "/r/n", "<xml>", "<XmlFormat>", "<PhoneBook>", "</xml>", "</XmlFormat>", "</PhoneBook>"};
                string text = await reader.ReadToEndAsync();
                fullInform = text.Split(separators, StringSplitOptions.RemoveEmptyEntries);
            }
        } else if (NewNumber == 2 && Model.open[1]) {
            using (StreamReader reader = new StreamReader("File/File.md")){
                string[] separators = new string[] { "/r/n", "# PhoneBook"};
                string text = await reader.ReadToEndAsync();
                fullInform = text.Split(separators, StringSplitOptions.RemoveEmptyEntries);
            }
        } else if (NewNumber == 3 && Model.open[2]) {
            using (StreamReader reader = new StreamReader("File/File.txt")){
                string[] separators = new string[] { "/r/n", "PhoneBook"};
                string text = await reader.ReadToEndAsync();
                fullInform = text.Split(separators, StringSplitOptions.RemoveEmptyEntries);
            }
        } else if (NewNumber == 4 && Model.open[3]) {
            using (StreamReader reader = new StreamReader("File/File.html")){
                string[] separators = new string[] { "/r/n", "<html>", "<HtmlFormat>", "<PhoneBook>", "</html>", "</HtmlFormat>", "</PhoneBook>"};
                string text = await reader.ReadToEndAsync();
                fullInform = text.Split(separators, StringSplitOptions.RemoveEmptyEntries);
            }
        }
    }

    public static void writeFormat() {
        Console.WriteLine("Выберете формат сохранения: \n1. XML\n2. MD\n3. TXT\n4. HTML");
        bool check = true;
        int x = 404;
        int NewNumber = 404;
        while (check == true) {
            String? number = Console.ReadLine();
            if (Int32.TryParse(number, out x)) {
                NewNumber = Int32.Parse(number);
                if (NewNumber > 0 && NewNumber < 5) {
                    check = false;

                } else {
                    Console.WriteLine("Вы ввели неверное число введите ещё раз: ");
                }
            } else {
                Console.WriteLine("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            }
        }
        Word document = new Word();
        document.setModel(new StringFormat());
        document.appendData(Controller.Users);
        if (NewNumber == 1) {
            document.setFormat(new XmlFormat());
            document.click();
        } else if (NewNumber == 2) {
            document.setFormat(new MdFormat());
            document.click();
        } else if (NewNumber == 3) {
            document.setFormat(new TxtFormat());
            document.click();
        } else if (NewNumber == 4) {
            document.setFormat(new HtmlFormat());
            document.click();
        }
    }
}
