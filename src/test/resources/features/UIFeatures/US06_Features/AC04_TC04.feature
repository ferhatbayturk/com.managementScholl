@Nilufer

Feature: US06

  Scenario Outline : US06

    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    When Nilufer Home sayfasindaki Login buttonuna tiklar
    And Nilufer Dean olarak User Name'i girer
    And Nilufer Dean olarak Password'u girer
    And Nilufer Login buttonuna tiklar
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrular
    And Nilufer Birth Place alanina "<Birth Place>" girmeyerek bos birakir
    And Nilufer Gender alanina tiklar
    And Nilufer Birth Place alani altinda Required mesajini gorur
    And Nilufer Birth Place alanina valid bir "<Birth Place>" girer
    And Nilufer Birth Place alani altinda hata mesaji goruntulenmemelidir
    Then close the application

    Examples: Dean_Vice_Dean_Bilgileri
      | Birth Place |
      |             |
      | Izmir       |