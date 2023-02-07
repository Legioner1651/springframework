# springframework
Доступ к данным через JPA

Основное задание

краткое описание задачи:
1. есть сервис для учета книг
2. данные хранятся в двух таблицах (author и book) - структура таблиц находится в файле schema.sql
3. имеется сервис BookService который имеет метод getAll(), возвращающий все данные из таблиц
4. для примера создан тест сервиса BookService -> BookServiceTest, проверяющий работу этого сервиса

задача
5. согласно заданию, создан сервис BookAnalyticService с единственным методом analyze(), вызывая который,
   согласно требованиям должна вернуться строка типа: ФамилияАвтора1 ИмяАвтора1 : КоличествоКнигАвтора1, ФамилияАвтора2 ИмяАвтора2 : КоличествоКнигАвтора2, и т.д.
   для всех авторов, имеющих хотя бы одну книгу (порядок не важен).
   Либо вернуть "Нет данных для анализа", если нет данных
6. необходимо разработать тесткейсы и написать тесты для этого сервиса


Задание *
1. Есть апи для получения погоды в городах WeatherApi, которое возвращает объект содержащий различную информацию о погодном состоянии в городе
   или пусто в случае если возникла какая-то ошибка или сервис недоступен.
2. Есть сервис анализа погоды (температуры) WeatherService, в котором единственый метод
   whatWhetherToday() должен возвращать описание погоды по температуре в виде строки.

задача
4. Необходимо разработать тесткейсы и написать тесты для сервиса WeatherService
5. Найти ошибки разработки, если они есть, и отразить в отчете (письме)
6. Тесты должны работать независимо от того где и когда их запускают. (использовать mockito или подобное)

инструкция:
0. Раскоментировать файлы WeatherApi и WeatherService, и блок зависимости в pom файле для <groupId>io.swagger</groupId>
1. Для того, чтобы проект собирался необходимо создать новый проект из гит репозитория https://github.com/weatherapicom/java
2. Для того, чтобы проверить реальную работу апи нужно в созданном проекте в файле io.swagger.client.model.Current
   изменить типы полей  feelslikeC и visKm с Integer на BigDecimal (Не забыть поменять тип в сеттерах и геттерах)
3. Запустить команду mvn clean install
4. После этого вернуться в текущий (тестовый) проект и обновить зависимости maven (Скомпилированный проект должен подтянуться)
   