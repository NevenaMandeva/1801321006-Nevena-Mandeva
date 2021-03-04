
Feature: Наемане на кола 

  Scenario: Валиден избор на кола за наем за съответната дата
    Given Клиентът отваря страницата за резервация
    When Клиентът избира държава от падащия лист "Bulgaria"
    And Селектира град от активния лист за избраната в предна стъпка държава "Plovdiv"
    And Селектира локация за получаване на колата от активен лист за избрания в предна стъпка град "Plovdiv Airport"
    And Избира дата на получаване "17-02-2021"
    And Избира дата на връщане "25-02-2021"
    And Избира кола от генерирания лист, свободни коли за съответния период "Opel Astra Sedan"
    And Клиентът въвежда своето име "Георги"
    And Клиентът въвежда своята фамилия "Георгиев"
    And Клиентът въвежда имейл "gg@gmail.com"
    And Клиентът въвежда имейл отново за потвърждение "gg@gmail.com"
    And Клиентът въвежда възраст "42"
    And Клиентът се съгласява с правилата и условията "true"
    And Натиска бутона за създаване на резервация
    Then Съобщение "Успешна резервация!"


  Scenario: Невалиден избор на кола за наем за съответната дата
    Given Клиентът отваря страницата за резервация
    When Клиентът избира държава от падащия лист "Bulgaria"
    And Селектира град от активния лист за избраната в предна стъпка държава "Plovdiv"
    And Селектира локация за получаване на колата от активен лист за избрания в предна стъпка град "Plovdiv Airport"
    And Избира дата на получаване "06-03-2021"
    And Избира дата на връщане "10-03-2021"
    And Избира кола от генерирания лист, свободни коли за съответния период "Opel Astra Sedan"
    And Клиентът въвежда своето име "Георги"
    And Клиентът въвежда своята фамилия "Георгиев"
    And Клиентът въвежда имейл "gg@gmail.com"
    And Клиентът въвежда имейл отново за потвърждение "gg@gmail.com"
    And Клиентът въвежда възраст "42"
    And Клиентът се съгласява с правилата и условията "true"
    And Натиска бутона за създаване на резервация
    Then Съобщение "Колата, която се опитвате да резервирате е заета за посочената дата!"
    
  Scenario: Неуспешена резервация при неприети правила и условия
    Given Клиентът отваря страницата за резервация
    When Клиентът избира държава от падащия лист "Bulgaria"
    And Селектира град от активния лист за избраната в предна стъпка държава "Plovdiv"
    And Селектира локация за получаване на колата от активен лист за избрания в предна стъпка град "Plovdiv Airport"
    And Избира дата на получаване "06-03-2021"
    And Избира дата на връщане "10-03-2021"
    And Избира кола от генерирания лист, свободни коли за съответния период "Opel Astra Sedan"
    And Клиентът въвежда своето име "Георги"
    And Клиентът въвежда своята фамилия "Георгиев"
    And Клиентът въвежда имейл "gg@gmail.com"
    And Клиентът въвежда имейл отново за потвърждение "gg@gmail.com"
    And Клиентът въвежда възраст "42"
    And Клиентът се съгласява с правилата и условията "false"
    And Натиска бутона за създаване на резервация
    Then Съобщение "Моля посочете, че сте информирани и съгласни с нашите правила и условия!"
    
   Scenario: Опит за резервация от непълнолетно лице
    Given Клиентът отваря страницата за резервация
    When Клиентът избира държава от падащия лист "Bulgaria"
    And Селектира град от активния лист за избраната в предна стъпка държава "Plovdiv"
    And Селектира локация за получаване на колата от активен лист за избрания в предна стъпка град "Plovdiv Airport"
    And Избира дата на получаване "17-02-2021"
    And Избира дата на връщане "25-02-2021"
    And Избира кола от генерирания лист, свободни коли за съответния период "Opel Astra Sedan"
    And Клиентът въвежда своето име "Георги"
    And Клиентът въвежда своята фамилия "Георгиев"
    And Клиентът въвежда имейл "gg@gmail.com"
    And Клиентът въвежда имейл отново за потвърждение "gg@gmail.com"
    And Клиентът въвежда възраст "16"
    And Клиентът се съгласява с правилата и условията "true"
    And Натиска бутона за създаване на резервация
    Then Съобщение "Трябва да имате навършени 18 години, за резервация!"
    
   Scenario: Резервация на кола с личен шофьор от фирмата
    Given Клиентът отваря страницата за резервация
    When Клиентът избира държава от падащия лист "Bulgaria"
    And Селектира град от активния лист за избраната в предна стъпка държава "Plovdiv"
    And Селектира локация за получаване на колата от активен лист за избрания в предна стъпка град "Plovdiv Airport"
    And Избира дата на получаване "17-02-2021"
    And Избира дата на връщане "25-02-2021"
    And Избира кола от генерирания лист, свободни коли за съответния период "Opel Astra Sedan"
    And Клиентът въвежда своето име "Георги"
    And Клиентът въвежда своята фамилия "Георгиев"
    And Клиентът въвежда имейл "gg@gmail.com"
    And Клиентът въвежда имейл отново за потвърждение "gg@gmail.com"
    And Клиентът въвежда възраст "42"
    And Клиентът избира да наеме и личен шофьор "true"
    And Клиентът се съгласява с правилата и условията "true"
    And Натиска бутона за създаване на резервация
    Then Съобщение "Успешна резервация с шофьор!"
