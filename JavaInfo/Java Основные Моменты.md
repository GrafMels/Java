# Типы данных
## Особенности
- String - единственный тип данных который подходит для использования функций сравнения таких как If, else if, while. Делается это через метеод equals(), который сравнивает значения.
Так же в отличии от других языков программирования строка не является массивом символов в java априори.

[Пример](Example001.java).

-
-
-



## Нэйминг

Для пременных и метдов camelCase

Для классов PascalCase

# Функции

## Функция сравнения( *If* )

В Java сравнение объектов производится с помощью метода equals() класса Object. Этот метод сравнивает содержимое объектов и выводит значение типа boolean. Значение true - если содержимое эквивалентно, и false — если нет.

Операция == не рекомендуется для сравнения объектов в Java. Дело в том, что при сравнении объектов, операция == вернет true лишь в одном случае — когда ссылки указывают на один и тот же объект. В данном случае не учитывается содержимое переменных класса.

# Try Catch Finaly

## import java.io.IOException;

При работе с фалами в java нужно ловить эту ошибку. Либо способом на весь метод main:

<public static void main(String[] args)**throws IOException** {   }>

Либо на кусок кода в котором будет FileWriter:


static void put_data(){

        try(FileWriter writer = new 
        FileWriter("output.txt")){
            String c_String = String.
            valueOf(c);
            if(c_String.equals("-1")){
                writer.write(a + " ^ " + b + " = " + c_double);
            }else if(c_String.equals("0")){
                writer.write(a + " ^ " + b + " = Не определено");
            }else{
                writer.write(a + " ^ " + b + " = " + c);
            } 
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
   



