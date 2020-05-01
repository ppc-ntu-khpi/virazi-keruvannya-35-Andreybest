# Практична робота "Вирази, керування виконанням програми"

Цей репозиторій містить стартовий код для виконання практичної роботи, який містить заготовки двох класів, що демонструють структуру проекту для виконання завдань на керуючі конструкції та вирази.

## В рамках практичної роботи ви маєте зробити наступне:
1. модифікувати стартовий код таким чином, щоб метод ```Calculate``` класу ```Exercise``` містив код обчислення значення у відповідності до обраного вами завдання (у разі необхідності можна додавати до класу нові приватні методи)
2. рядок, який виводиться у результаті виконання методу ```main``` класу ```TestResult``` теж слід скоригувати у відповідності до специфіки завдання
3. **README.MD репозиторію має містити опис обраного вами завдання** (краще - з картинками та форматуванням :blush:)!
4. **УВАГА!** Не слід вважати, що завдання дуже прості! Вам необхідно подбати про:
    * **оптимізацію програми - обрати оптимальні з точки зору обсягу використовуваної пам'яті типи даних**
    * **іменування змінних і констант у відповідності до рекомендацій**
    * **javadoc-коментарі для класу ```Exercise```, які пояснюють що саме обчислюється і які вихідні дані для цього потрібні**
5. здати завдання. **Нагадую, що здаючи завдання через Google Classroom, слід вказати посилання на створений для вас репозиторій!**

**P.S.** Ви можете обрати завдання на власний розсуд - реалізувати алгоритм, який вас зацікавив, однак якщо буде надто багато однакових класів, завдання не буде зараховано - намагайтесь робити самотужки та у власному стилі! Звісно ж, ніхто не забороняє користуватись Інтернетом, шукати й використовувати знайдене у Мережі!

----

## Список завдань
<del>1. Заповніть масив простими числами з вказаного діапазону і виведіть його у вигляді рядка</del>  
<del>2. Заповнити масив довільного розміру числами в порядку зростання, починаючи з центру масиву, наприклад, ````[5,4,3,2,1,0,1,2,3,4,5]````</del>  
**3. Знайти в масиві число, яке повторюється найбільшу кількість разів**  
<del>4. Рядок містить математичний вираз типу "1 + 33-4 * 7". Написати програму для підрахунку значення виразу (пріоритет операцій можна не враховувати)</del>  
<del>5. Знайти всі різні подання числа N у вигляді сум K натуральних чисел (1 <K <N). Якщо К = 0, то видати всі можливі суми. Подання чисел, що відрізняються лише порядком доданків, вважаються однаковими</del>  
<del>6. Знайти всі різні подання числа N у вигляді добутків K натуральних чисел (1 <K <N). Якщо К = 0, то видати всі можливі добутки. Подання чисел, що відрізняються лише порядком співмножників, вважаються однаковими</del>  
<del>7. Трамвайні квитки мають шестизначні номери, вважають якщо квиток «щасливий» то сума перших трьох цифр дорівнює сумі останніх. Знайти кількість щасливих квитків</del>  
<del>8. Відсортувати одновимірний масив, розбиваючи його на групи елементів по 1, 2, 4, 8 і т.д. Дозволяється використовувати допоміжний масив</del>  
<del>9. Відсортувати одновимірний масив, розбиваючи його на групи елементів по 1, 2, 4, 8 і т.д. Дозволяється використовувати допоміжний масив. У результуючому масиві не повинно бути дублікатів</del>  
<del>10. Визначити кількість способів, якими можна піднятися на 10-ту сходинку драбини, якщо можливо підніматися переступаючи через кілька сходинок</del>  
<del>11. Визначити кількість способів, якими можна піднятися на 10-ту сходинку драбини, якщо можливо підніматися перестрибуючи не більше ніж через дві сходинки</del>  
<del>12. Фішка може переміщуватися по полю довжиною Х тільки вперед. Розмір кожного кроку не перевищує К. знайти кількість способів якими фішка може пройти з поля під номером 1 до поля Х</del>  
<del>13. Перевірте чи є задане число [числом Армстронга](https://uk.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%90%D1%80%D0%BC%D1%81%D1%82%D1%80%D0%BE%D0%BD%D0%B3%D0%B0)</del>  
<del>14. Знайдіть друге за величиною число у заданому масиві</del>  
<del>15. На склаі є 50000 полиць. Для кожної полиці замовили табличку з номером, але коли таблички надрукували, виявилося що друкарський верстат через несправності не друкував цифру 2, тому всі таблички, в номерах яких містились "двійки" (00002, 20202 тощо) треба передрукувати. Визначте число таких помилкових табличок</del>  
<del>16. Електронний годинник. Підрахувати скільки разів за добу трапляється так, що зліва від двокрапки показується симетрична комбінація для тієї, що праворуч від двокрапки (02:20, 11:11 або 15:51)</del>  
<del>17. Американці вважають нещасливим число 13, китайці - 4. Для спільних навчань штаб української армії вирішив не використовувати бойову техніку, номер якої містить числа 4 або 13 (40123, 13313, 12345 або 13040), щоб не бентежити іноземних колег. В розпорядженні армії 100000 одиниць бойової техніки. Визначити скільки всього номерів доведеться виключити</del>

## Використання
1. Почніть програму на методі main классу TestResult
2. Отримайте найбільш повторюване число з приведених чисел
![Result](img/result.png)

Made by Andrii Kotliar
