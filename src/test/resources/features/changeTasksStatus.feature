Feature: Смена статусов задачи

  Scenario: Менять статусы задави до ГОТОВО
  Предыстория: открыта страница портала - https://edujira.ifellow.ru/secure/Dashboard.jspa
    When Авторизуемся под юзером: suhinina и паролем: Qwerty123
    When Переходим к созданию задачи
    When Установим для задачи тип ошибка
    When Установим для задачи тему КукумберТест
    When Установим для задачи описание Что-то нужно написать
    When Подтверждаем создание задачи
    When Открываем список проектов
    When Переходим в проект TestProject
    When Открываем страницу списка задач
    When Переходим в задачу КукумберТест
    When Открываем страницу текущей задачи
    When Меняем статус задачи - Нужно сделать
    Then Проверяем смену статуса СДЕЛАТЬ
    When Меняем статус задачи - В работе
    Then Проверяем смену статуса В РАБОТЕ
    When Меняем статус задачи - Выполнено
    Then Проверяем смену статуса ГОТОВО