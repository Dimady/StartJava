Задачки на тему
“Переменные: примитивные типы данных”

Создайте класс VariablesTheme с методом main
Все задания реализуйте в нем, отделяя их друг от друга пустой строкой
Решение любой задачи должно начинаться с вывода на консоль (а не комментария) ее названия, включая порядковый номер
Отделяйте в консоли вывод одной программы от другой пустой строкой, чтобы текст не сливался
Не используйте ввод с клавиатуры
Все переменные должны быть локальными
Перед сдачей ДЗ на проверку сверьте свое решение со списком рекомендаций

Создание переменных и вывод их значений на консоль (это название задачи)
объявите переменные всех существующих в Java примитивных типов данных, присвоив им значения
в качестве значений используйте информацию о своем компьютере: количество ядер, частота процессора и тд.
выведите эти данные на консоль

Расчет стоимости товара со скидкой
товар X стоит 100 руб, а товар Y — 200 руб.
вместе на них действует скидка 11%
отобразите в консоли:
сумму скидки
общую стоимость товаров со скидкой

Вывод на консоль слова JAVA
Отобразите в консоли слово JAVA, как в примере ниже:
   J    a  v     v  a                                                  
   J   a a  v   v  a a                                                 
J  J  aaaaa  V V  aaaaa                                                
 JJ  a     a  V  a     a


Отображение min и max значений числовых типов данных
создайте переменные всех целых числовых типов
присвойте им самые большие числа, которые они могут хранить
инкрементируйте, а затем декрементируйте все значения на единицу
выводите данные на консоль для каждой переменной в следующей последовательности:
первоначальное значение
значение после инкремента
значение после декремента

Перестановка значений переменных
создайте две переменные типа double, присвоив им значения 1.1 и 2.2
поменяйте значения переменных местами разными способами:
с помощью третьей переменной
с помощью арифметических операций
с помощью побитовой операции ^
отобразите в консоли:
информацию о применяемом способе перестановки значений
исходные значения переменных
новые значения переменных

Вывод символов и их кодов
создайте 5 переменных, присвоив им значения: 35, 38, 64, 94, 95
отобразите в консоли:
код символа
напротив кода соответствующий ему символ (делайте это программно, а не написав его самим) из ASCII-таблицы

Произведение и сумма цифр числа
имеется число 345
найдите произведение, а затем сумму его цифр
не используйте цикл
выделяйте каждую цифру числа программно, а не написав их самим
используйте для этого только операции / и %
выведите результат в следующем формате:
сумма цифр числа N = столько-то
произведение цифр числа N = столько-то

Задания со *

Вывод на консоль ASCII-арт Дюка
отобразите в консоли Java-талисман, используя символы из примера ниже:
    /\                                                                                                                                       
   /  \                                                                                                                                      
  /_( )\                                                                                                                                     
 /      \                                                                                                                                    
/____/\__\


каждый уникальный символ, включая пробел, храните в отдельной переменной
отобразите (построчно, а не посимвольно) результат в консоль, используя значения переменных

Отображение количества сотен, десятков и единиц числа
имеется число 123
выделите у него программно сотни, десятки и единицы
используйте для этого только операции / и %
отобразите результат, как “Число N содержит:”
X сотен
Y десятков
Z единиц

Преобразование секунд
имеется количество секунд 86399
переведите его в часы, минуты и секунды
используйте для этого только операции / и %
отобразите полученные значения в формате ЧЧ:ММ:СС

Рекомендации по выполнению ДЗ

Для переноса курсора на новую строку, вместо System.out.println(""); используйте \n (где это возможно). Например:
System.out.println("\n2. Поиск максимального числа");


Давайте переменным осмысленные имена (где это возможно), глядя на которые сразу было бы понятно, что они хранят

Перед и после операторов =, +, -, /, *, %, ==, !=, <, <=, >, >=, -=, +=, *=, /= требуется пробел

Есть ряд переменных, имена которых вполне легально можно сокращать, например src вместо source; tmp вместо temp; num/nums вместо number/numbers. При этом следуйте одному стилю именования: в программе не должно быть и num, number или numb - используйте какой-то один подход

Не придумывайте для переменных, которые хранят в разных задачах похожие по смыслу значения, новые имена. Используйте созданные ранее переменные. Например, для переменной, которая хранит исходное значение, меняющееся в процессе работы программы, можно дать имя srcNum (от source number)

При именовании переменных не путайте числа с цифрами: например, 987 — это число (number); а его отдельные составляющие 9, 8, 7 — то уже цифры (digit)
