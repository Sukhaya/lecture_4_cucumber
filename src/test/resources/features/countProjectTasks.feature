Feature: Подсчет количества задач

  Scenario: Проверка количества задач в проекте
  Предыстория: открыта страница портала - https://edujira.ifellow.ru/secure/Dashboard.jspa
    When Авторизуемся под юзером: suhinina и паролем: Qwerty123
    When Открываем список проектов
    When Переходим в проект TestProject
    When Открываем страницу задач
    Then Получаем количество заведенных задач
