Feature: авторизация

  Scenario: авторизация на тестовом портале Jira
    Предыстория: открыта страница портала - https://edujira.ifellow.ru/secure/Dashboard.jspa
    When Вводим логин suhinina и пароль Qwerty123
    When Нажимаем кнопку войти
    Then Проверяем, что мы авторизованы

