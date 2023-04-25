@Nilufer @team11

Feature: US23

  Scenario Outline: US23

    Given Nilufer "https://www.managementonschools.com/" url'ine git
    When Nilufer Home sayfasindaki Login buttonuna tikla
    And Nilufer Admin olarak User Name'i gir
    And Nilufer Admin olarak Password'u gir
    And Nilufer Login buttonuna tikla
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrula
    And Nilufer Name alanina valid bir "<Name>" gir
    And Nilufer Surname alanina valid bir "<Surname>" gir
    And Nilufer Birth Place alanina valid bir "<Birth Place>" gir
    And Nilufer Gender alanina valid bir Gender sec
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" gir
    And Nilufer Phone alanina valid bir "<Phone>" gir
    And Nilufer Ssn alanina valid bir "<Ssn>" gir
    And Nilufer User Name alanina valid bir "<User Name>" gir
    And Nilufer Password alanina "<Password>" girmeyerek bos birak
    And Nilufer Submit butonuna tiklayama
    And Nilufer Password alani altinda Required mesajini gor
    And Nilufer Name alanina valid bir "<Name>" gir
    And Nilufer Surname alanina valid bir "<Surname>" gir
    And Nilufer Birth Place alanina valid bir "<Birth Place>" gir
    And Nilufer Gender alanina valid bir Gender sec
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" gir
    And Nilufer Phone alanina valid bir "<Phone>" gir
    And Nilufer Ssn alanina valid bir "<Ssn>" gir
    And Nilufer User Name alanina valid bir "<User Name>" gir
    And Nilufer Password alanina "<Password>" olarak yedi karakter veri gir
    And Nilufer Submit butonuna tiklayama
    And Nilufer Password alani altinda Minimum sekiz character mesajini gor
    Then close the application

    Examples: Admin_Vice_Dean_Bilgileri
      | Name    | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name | Password |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     |          |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     | Nil.123  |