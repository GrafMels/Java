JDK - компилирует
JRE - окружение для исполнения программы
JVM - исполняет программу

javac -sourcepath ./src -d out src/MainPackage/Main.java
java -classpath ./out  MainPackage.Main


###### Очень важные строки
docker build -t java-app:demo .
docker images
docker run -it java-app:demo

## Примитивные типы

boolean - хранит неопределённое колличество памяти(зависит от jvm) но обычно считается что он хранит байт

Разберём строку:
char myChar = 'H';
char myChar = 'H'; - это инициализация
char myChar - это определение(обьявление)
char - это тип
myChar - это индетификатор(имя)
= - знак присваивания
'H' - это значение

## Ссылочные типы

Это тип имеющий внутри себя ссылку, может иметь значение null.

### Массив 
Это тип имеющий ссылочное значение который ссылается на элементы массива.

int[] array3 = {5, 4, 3, 2, 1};
int[] array2 = new int[5];
int[] array1 = array2;
int[] array0;

#### Final и array 
Если: final int[] array;
То:  Не можем: array = int[] array2;
То:  Можем: array[1] = 5;

#### Не прямоугольные массивы возможны для java

При пересоздании размера массивов нижних уровней в многомерном массиве

#### Индекс это значение смещение относительно начала массива

## Операции java

Опреации в java происходит по таким приоритетам - сначала деление и умножение, слева на право, присваивание в самом конце.

### Битый не битового везёт

! - Логическое “не” (отрицание)
~ - Логическое “не” (отрицание) (битовая операция)
& - Логическое И (AND, умножение)(битовая операция)
| - Логическое ИЛИ (OR, сложение)(битовая операция)
^ - Логическое исключающее ИЛИ (XOR)(битовая операция)
&& - Условное И (сокращённое логическое И)
|| - Условное ИЛИ (сокращённое логическое ИЛИ)

## Методы java

### Почему методы а не функции
Функции внутри классов называются методами, все функции внутри Java внутри классов

### Что такое метод в java

Имя метода - это переходный глагол совершенного вида в настоящем времени.(Вернуть)(Посчитать)(Установить)(Создать)(Ввести).

Нельзя писать функции внутри функций.

Аргументы метода это ссылка на передаваемый обьект.

### Сигнатура метода

Сигнатура метода - это имя метода и его параметры. В сигнатуру метода не входит возращаемое значение. 

Нельзя написать два метода с одинаковой сигнатурой. (С одинаковым именем + колличеством параметров + типами параметров)

# Class
Класс - логическая конструкция для строительства языка джава(шаблон по которому создаются обьекты)






