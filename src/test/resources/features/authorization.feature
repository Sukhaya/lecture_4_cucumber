Feature: авторизация

  Scenario: авторизация на тестовом портале Jira
    When Вводим логин suhinina и пароль Qwerty123
    When Нажимаем кнопку войти
    When Получаем имя текущего юзера
    Then Проверяем, что мы авторизованы

