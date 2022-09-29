Feature: Калькулятор

  Scenario Outline: Сумма двух цифр
    Given две цифры <a> и <b>
    When ищем сумму двух цифр
    Then результат должен быть <total>


    Examples:
      | a | b | total |
      | 3 | 2 |   5   |
      | 4 | 2 |   6   |