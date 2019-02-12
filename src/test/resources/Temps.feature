Feature: Temps

  Scenario Template: ajouter des heures
    Given un temps 20 heures 45 minutes et 56 secondes
    When ajout <nbHeure> heure
    Then la valeur de temps est <newHeure> heures <newMinute> minutes <newSeconde> secondes

  Examples:
    |nbHeure|newHeure|newMinute|newSeconde|
    |2      |22      |45       |56        |
    |5      |1       |45       |56        |

  Scenario Template: ajouter des minutes
    Given un temps 21 heures 50 minutes et 20 secondes
    When ajout <nbMinutes> minutes
    Then la valeur de temps est <newHeure> heures <newMinute> minutes <newSeconde> secondes

  Examples:
    |nbMinutes|newHeure|newMinute|newSeconde|
    |2        |21      |52       |20        |
    |26       |22      |16       |20        |
    |60       |22      |50       |20        |
    |75       |23      |5        |20        |
    |135      |0       |5        |20        |

  Scenario Template: ajouter des secondes
    Given un temps 22 heures 58 minutes et 57 secondes
    When ajout <nbSeconde> secondes
    Then la valeur de temps est <newHeure> heures <newMinute> minutes <newSeconde> secondes

  Examples:
    |nbSeconde|newHeure|newMinute|newSeconde|
    |2        |22      |58       |59        |
    |3        |22      |59       |0         |
    |68       |23      |0        |5         |
    |3601     |23      |58       |58        |
    |3606     |23      |59       |3         |
    |3683     |0       |0        |20        |
