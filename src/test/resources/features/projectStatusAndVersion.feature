Feature: Проверка полей в заведенной задаче

  Scenario: проверка статуса и версии
  Предыстория: открыта страница портала - https://edujira.ifellow.ru/secure/Dashboard.jspa
    When Авторизуемся под юзером: suhinina и паролем: Qwerty123
    When Открываем список проектов
    When Переходим в проект TestProject
    When Открываем страницу списка задач
    When Переходим в задачу TestSelenium_bug
    When Проверяем статус задачи и выводим привязку к версии