# Internship jdbc demo & project skeleton for task 2

## Задача 2

Необходимо написать программу, которая будет выводить меню с выбором следующих опций:
1. Прочитать из файла и базы данных(Postgresql) и вывести на экран данные (Формат такой же как и в задаче номер 1)
2. Импортировать данные из файла в базу данных
3. Прочесть только из базы данных и вывести на экран данные (Формат такой же как и в задаче номер 1)
4. Выход

Требования:
1. Внести изменения в GitHub репозиторий с проектом - into-task-vivat-internship-2023
2. Проект должен быть создан при помощи Maven.
    - В проекте должен быть файл pom.xml
    - Добавить junit зависимость и любые другие, которые считаете нужным
3. Файл с данными может быть в папке resources проекта или путь к нему может передаваться как параметр командной строки
4. В репозитории должен быть файл README.md с описанием проекта и инструкцией по запуску
5. Должны быть юнит тесты покрывющие функционал программы
6. В случае если в файле будет найдена ошибка, программа должна выводить сообщение об ошибке и продолжать работу с остальными данными

Tips:
1. В проекте есть docker-compose который запускает postgresql базу данных. Для запуска выполнить команду `docker-compose up -d`
2. Базу данных нужно будет созвать вручную. Все sql скрипты оставляйте в папке migrations проекта