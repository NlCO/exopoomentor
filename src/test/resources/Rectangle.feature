Feature:

  Scenario Outline: calcul du périmètre
    Given un rectangle de longueur <L> et de largeur <l>
    When je calcule le prérimtre
    Then Le périmetre est de <P>

  Examples:
    |L|l|P|
    |5|4.08|18.16|

  Scenario Outline: calcul de la surface
    Given un rectangle de longueur <L> et de largeur <l>
    When je calcule la surface
    Then La surface est de <S>

  Examples:
    |L|l|S|
    |5.2|6.58|34.216|

  Scenario Outline: tester si le rectangle est carré
    Given un rectangle de longueur <L> et de largeur <l>
    When je vérifie sir le rectangle est carré
    Then Le rectangle est carré : <booleanSquare>

  Examples:
    |L|l|booleanSquare|
    |5.2|5.2|true     |
    |5.3|5.1|false    |


