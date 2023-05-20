# Mihail Mishkoski, 213235

## Control Flow Graph

## Легенда
- црвено ребро:  Тек на програмата предизвикан од исклучок
- зелен јазел:  Предикатен јазел
- жолт јазел:  for циклус

![SILab2 (4)](https://github.com/mihailmishkoski/SI_2023_lab2_213235/assets/104661985/c3bbba88-417b-4e60-adeb-0085f1ae39db)



**Цикломатска комплексност**

E(edges) = 33  
N(nodes) = 25
Според формулата V(G) = E - N + 2, тогаш 33 - 25 + 2 = 10

Цикломатската комплексност е 10

**Every Branch criteria**  

Every Branch критериумот за тестирање е метода за осигурување дека се поминуваат сите можни гранки во кодот. Ова значи дека секоја точка на одлука (if/else услов) во кодот треба да биде извршена и помината, како и секоја можна променлива во условот (true/false).
Целта на Every Branch критериумот е да се откријат потенцијални грешки или пропуштени случаи кои може да не се покриени при обични тестови. Ова помага да се зголеми довербата во исправноста на софтверот и да се намали ризикот од неочекувани грешки при извршување.
Кога се применува Every Branch критериумот, потребно е да се креираат тестови кои ќе поминат низ секоја можна гранка, со различни комбинации на влезни вредности или услови. Ова вклучува извршување на кодот со различни вредности и по сите можни патеки на извршување. При секој тест, треба да се провери дали резултатот и состојбата на системот соодветствуваат на очекуваниот резултат.  

Во мојот тест ги имплементирав методите:  

-userIsNull  
-usernameIsNull  
-emailIsValidAndNotUnique  
-emailIsValidAndUnique  
-passwordContainsUsernameOrIsShort  
-passwordContainsSpecialCharacter  
-passwordIsValidAndUnique


**Multiple condition criteria**    
  
Multiple condition criteria (Критериум на повеќе услови) е критериум за тестирање кој се фокусира на тестирање на различни комбинации на услови во кодот. Целта е да сме сигурни дека се тестираат сите можни комбинации на услови и нивните резултати.

Во мојот тест ги имплементирав методите:

-userListIsEmpty  
-emailIsInvalid  
-passwordIsTooLong  
-usernameContainsWhitespace  

Програмата не работи правилно само кога се тестира последната метода, не би требало да може корисничкото име да е валидно доколку содржи празни места, но програмата го дозволи тоа.
