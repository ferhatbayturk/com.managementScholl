@US06_TC06 @team11
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Kullanici "https://www.managementonschools.com/" url'ine gider
    Given Kullanici Home sayfasindaki Login buttonuna tiklar
    Given Kullanici Dean olarak User Name'i girer
    Given Kullanici Dean olarak Password'u girer
    Given Kullanici Login buttonuna tiklar
    Given Kullanici "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC06_Date_Of_Birth_alaninin_testi
    When Kullanici Date Of Birth alanina "<Date Of Birth>" girmeyerek bos birakir
    And Kullanici Phone alanina tiklar
    And Kullanici Date Of Birth alani altinda Required mesajini gorur
    And Kullanici Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Kullanici Date Of Birth alani altinda hata mesaji goruntulenmemelidir

    Examples: Dean_Vice_Dean_Bilgileri
      | Date Of Birth |
      |               |
      | 06.08.1965    |
