Feature: Открываем проект

  Scenario: Переходим в проект TestProject
  Предыстория: открыта страница портала - https://edujira.ifellow.ru/secure/Dashboard.jspa
    When Авторизуемся под юзером: suhinina и паролем: Qwerty123
    When Открываем список проектов
    When Переходим в проект TestProject
    When Получаем название текущего открытого проекта
    When Проверяем появилась ли боковая панель проекта
    Then Проверяем, что находимся в нужном проекте