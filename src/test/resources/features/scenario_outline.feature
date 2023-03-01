@login_olma
Feature: Login

  Scenario Outline: TC-01_login_olma
    Given kullanici "https://www.bluerentalcars.com/" gider
    When kullanici login sayfasina gider
    And kullanici  email "<email>" girer
    And kullanici  password "<password>" girer
    And kullanici login butonuna tiklar
    #Then kullanici "<email>"oldugunu dogrular
    Then close the application

  Examples:login_bilgileri
      |               email           | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |
      | raj.khan@bluerentalcars.com   | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com| Nga^g6!   |


#USER STORY : US167854_manager_login_test
#NAME:kullanici tum manager login bilgileriyle giriş yapabilmeli
#AC:
#Given kullanici ana sayfada
#When kullanici login sayfasina gider
#And kullanıcı adini girer->>>>>parametre
#And sifreyi girer->>>>>parametre
#And login buttoning basar
#Then login islemi gerçekleşir
#ARTIFACT:
#url : https://www.bluerentalcars.com/
#Credentials:
#                {"sam.walker@bluerentalcars.com","c!fas_art"},
#                {"kate.brown@bluerentalcars.com","tad1$Fas"},
#                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
#                {“pam.raymond@bluerentalcars.com”,"Nga^g6!"}
#NOT: scenario outline kullanalim