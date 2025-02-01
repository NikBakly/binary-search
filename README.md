# Релизация методов бинарного поиска
##  Домашнее задание по курсу Алгоритмы и структуры данных

### Отчёт о выполнении задания
Отчёт о выполнении задания в формате pdf доступен по ссылке
[Отчёт](./docs/ru/ОТЧЁТ.pdf)  

## Реализованные методы
Для работы со списками:
- static int binarySearch(byte[] a, byte key)  
- static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key)  
- static int binarySearch(char[] a, char key)  
- static int binarySearch(char[] a, int fromIndex, int toIndex, char key)  
- static int binarySearch(double[] a, double key)  
- static int binarySearch(double[] a, int fromIndex, int toIndex, double key)  
- static int binarySearch(float[] a, float key)  
- static int binarySearch(float[] a, int fromIndex, int toIndex, float key)  
- static int binarySearch(int[] a, int key)  
- static int binarySearch(int[] a, int fromIndex, int toIndex, int key)  
- static int binarySearch(long[] a, long key)  
- static int binarySearch(long[] a, int fromIndex, int toIndex, long key)  
- static int binarySearch(short[] a, short key)  
- static int binarySearch(short[] a, int fromIndex, int toIndex, short key)  
- static int binarySearch(T[] a, T key, Comparator c)  
- static int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c)  

Для работы с коллекциями:
- static int binarySearch(List> list, T key)  
- static int binarySearch(List list, T key, Comparator c)


## Установка

Для установки программы скачайте архив репозитория по ссылке или склонируйте его  
```bash
git clone https://github.com/idAndrey/binary-search.git  
```  
Для работы сервиса внешние библиотеки не требуются  

## Структура проекта

```plaintext
BinarySearch
├─ BinarySearch.iml                  
├─ README.md
├─ .gitignore
└─ src
   └─  main
      └─ java
         ├─ binarysearch
         │  ├─ MyArrays.java
         │  ├─ MyCollections.java
         └─ App.java

```
Пакет ***binarysearch*** содержит два класса    
-	***MyArrays***, класс с методами для работы со списками
-	***MyCollections***, класс с методами для работы с коллекциями