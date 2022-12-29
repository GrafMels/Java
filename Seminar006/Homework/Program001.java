import java.util.ArrayList;
import java.util.Scanner;


public class Program001 {
    public static Scanner scan = new Scanner(System.in, "cp866");
    public static void main(String[] args) {
        Infrastructure infrastructure = new Infrastructure();
        for (int i = 0; i < infrastructure.filmSize; i++) {
            System.out.println(infrastructure.getAllInfo(i+1));
        }
        System.out.println("\n\n\n");

        String filmName = input();
        System.out.println(filmName);

        System.out.println("\n\n\n");
        Integer[] findingNumber = infrastructure.findAll(filmName);
        for (int i = 0; i < infrastructure.filmSize; i++) {
            if(findingNumber[i]!=null){
            System.out.println(infrastructure.getAllInfo(findingNumber[i]));
            }
            
        }
        
    }
    public static String input(){
        System.out.print("Введите название фильма, жанра, или продюсера: ");
        String name = scan.next();
        return name;  
    }
}

class Infrastructure {
    int filmSize = 0;

    public Infrastructure() {
        init();
    }

    Db db;

    public Db getDb() {
        return db;
    }

    public String getAllInfo(int idCinema) {
        Cinema c = db.films.get(idCinema - 1);

        return String.format("%d %s %s %s",
                c.id,
                c.name,
                db.genres.get(c.genre - 1).name,
                db.prod.get(c.filmProd - 1).titleName);
    }

    public Integer[] findAll(String substring) {
        String[] films = new String[filmSize];
        Integer[] Number = new Integer[filmSize];
        int k = 0;
        for (int index = 0; index < filmSize; index++) {
            films[index] = getAllInfo(index+1);
            if(films[index].toLowerCase().contains(substring.toLowerCase())){
                Number[k] = index+1;
                k++;
            }
        }
        return Number;
    }

    Db init() {
        db = new Db();
        Cinema c1 = new Cinema(1, "Тьма: Монстры за поворотом (2018)", 1, 1);
        Cinema c2 = new Cinema(2, "Светская жизнь (2016)", 2, 2);
        Cinema c3 = new Cinema(4, "Удивительный Человек-паук (сериал 1977 - 1979)", 3, 3);
        Cinema c4 = new Cinema(3, "Особенности национальной охоты (1995)", 4, 4);
        Cinema c5 = new Cinema(5, "Особенности национальной рыбалки (1998)", 4, 5);
        Cinema c6 = new Cinema(6, "Особенности национальной охоты в зимний период (2000)", 4, 6);
        Cinema c7 = new Cinema(7, "Особенности национальной политики (2003)", 4, 7);
        Cinema c8 = new Cinema(8, "Старгерл (сериал 2020 - ...)", 3, 3);
        Cinema c9 = new Cinema(9, "Вышка (2022)", 5, 8);
        Cinema c10 = new Cinema(10, "Аватар (2009)", 3, 9);
        Cinema c11 = new Cinema(11, "Аватар: Путь воды (2022)", 3, 9);
        Cinema c12 = new Cinema(12, "Титаник (1997)", 6, 9);
        Cinema c13 = new Cinema(13, "Терминатор (1984)", 3, 9);

        db.films.add(c1);
        db.films.add(c2);
        db.films.add(c3);
        db.films.add(c4);
        db.films.add(c5);
        db.films.add(c6);
        db.films.add(c7);
        db.films.add(c8);
        db.films.add(c9);
        db.films.add(c10);
        db.films.add(c11);
        db.films.add(c12);
        db.films.add(c13);

        filmSize = db.films.size();

        db.genres.add(new Genre(1, "Ужасы"));
        db.genres.add(new Genre(2, "Драма"));
        db.genres.add(new Genre(3, "Фантастика"));
        db.genres.add(new Genre(4, "Комедия"));
        db.genres.add(new Genre(5, "Триллер"));
        db.genres.add(new Genre(6, "Мелодрама"));

        FilmProducerFactory pf = new FilmProducerFactory();
        db.addFilmProducer(pf.getFilmProducer("Marco Tempera"));
        db.addFilmProducer(pf.getFilmProducer("Летти Аронсон"));
        db.addFilmProducer(pf.getFilmProducer("DC"));
        db.addFilmProducer(pf.getFilmProducer("Александр Голутва"));
        db.addFilmProducer(pf.getFilmProducer("Дмитрий Делов"));
        db.addFilmProducer(pf.getFilmProducer("Константин Эрнст"));
        db.addFilmProducer(pf.getFilmProducer("Юлия Лим"));
        db.addFilmProducer(pf.getFilmProducer("Дэвид Хэйринг"));
        db.addFilmProducer(pf.getFilmProducer("Джеймс Кэмерон"));
        
        

        return db;
    }
}

class Db {
    ArrayList<Cinema> films = new ArrayList<>();
    ArrayList<FilmProducer> prod = new ArrayList<>();
    ArrayList<Genre> genres = new ArrayList<>();

    public void addFilmProducer(FilmProducer producer) {
        prod.add(producer);
    }
}

class Cinema {
    int id;
    int filmProd;
    String name;
    int genre;

    public Cinema(int id, String name, int genre, int filmProd) {
        this.id = id;
        this.filmProd = filmProd;
        this.name = name;
        this.genre = genre;
    }
}

class FilmProducer {
    int id;
    String titleName;
}

class Genre {
    int id;
    String name;

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class FilmProducerFactory {
    int count = 1;

    public FilmProducer getFilmProducer(String name) {
        FilmProducer fp = new FilmProducer();
        fp.id = count++;
        fp.titleName = name;
        return fp;
    }
}