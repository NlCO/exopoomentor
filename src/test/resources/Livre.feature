Feature: Livre

  Scenario: test constructeur vide
    Given aucun parametre
    When je crée une instance de Livre
    Then affiche Le livre "null" écrit par "null" en 0 coute "0.0"

  Scenario: test constructeur avec un titre
    Given le titre du livre est "Fairy Tail T1"
    When je crée une instance de Livre avec son titre
    Then affiche Le livre "Fairy Tail T1" écrit par "null" en 0 coute "0.0"

  Scenario: test constructeur avec un titre et auteur
    Given le titre du livre est "Fairy Tail T2" et l'auteur "Hiro Mashima"
    When je crée une instance de Livre avec son titre et son auteur
    Then affiche Le livre "Fairy Tail T2" écrit par "Hiro Mashima" en 0 coute "0.0"

  Scenario: test constructeur avec un titre et auteur et prix
    Given le titre du livre est "Fairy Tail T3" et l'auteur "Hiro Mashima" pour "2.99"
    When je crée une instance de Livre avec son titre et son auteur et sont prix
    Then affiche Le livre "Fairy Tail T3" écrit par "Hiro Mashima" en 0 coute "2.99"

  Scenario: test constructeur avec un titre et auteur et prix et annee
    Given le titre du livre est "Fairy Tail T4" et l'auteur "Hiro Mashima" pour "2.99" en 2006
    When je crée une instance de Livre avec son titre et son auteur son prix et son annee
    Then affiche Le livre "Fairy Tail T4" écrit par "Hiro Mashima" en 2006 coute "2.99"

  Scenario: test constructeur a partir d'un autre livre
    Given la référence est le livre "Fairy Tail T5" de "Hiro Mashima" pour "2.99" en 2006
    When je crée une instance de Livre avec une autre instance
    Then affiche Le livre "Fairy Tail T5" écrit par "Hiro Mashima" en 2006 coute "2.99"
