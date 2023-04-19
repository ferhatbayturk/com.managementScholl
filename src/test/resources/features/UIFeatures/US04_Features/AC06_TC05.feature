@US04_AC06_TC05 @team11
Feature:Dean ekleyebilme

  Scenario Outline: TC01_Dean_olustur
    Given Alı "https://www.managementonschools.com" gider
    And Alı bır sanıye bekler
    When Alı Login butonuna tiklar
    And Alı bır sanıye bekler
    And Alı Admin olarak Username "<Username>" girer
    And Alı bır sanıye bekler
    And Alı Admin olarak Password "<Password>" girer
    And Alı bır sanıye bekler
    And Alı Login sayfasinda Login butona tiklar.
    And Alı bır sanıye bekler
    And Alı Menu butonuna tiklar
    And Alı bır sanıye bekler
    And Alı Main Menu listinin acildigini gorur
    And Alı bır sanıye bekler
    And Alı Main Menu Listinden Dean Management text`ine tiklar
    And Alı bır sanıye bekler
    And Alı Dean Management alaninin goruldugunu dogrular
    And Alı bır sanıye bekler
    And Alı Dean Management`in altinda Add Dean alaninin goruldugunu dogrular
    And Alı bır sanıye bekler
    And Alı Name "<Name>" alanina veri girer
    And Alı bır sanıye bekler
    And Alı Surname "<Surname>" alanina veri girer
    And Alı bır sanıye bekler
    And Alı Bırth Place "<Birth Place>" alanina veri girer
    And Alı bır sanıye bekler
    And Alı Gender alaninda gerekli checkbox`a tiklar
    And Alı bır sanıye bekler
    And Alı Date Of Bırth "<Date Of Birth>" alanina tarih girer
    And Alı bır sanıye bekler
    And Alı Phone "<Phone>" harf veri girer
    And Alı bır sanıye bekler
    And Alı Ssn alanina istenilen formatta veri girer
    And Alı bır sanıye bekler
    And Alı User Name alanina veri girer
    And Alı bır sanıye bekler
    And Alı password alanina gecerli sifre girer
    And Alı bır sanıye bekler
    When Alı Submit butonuna tiklar
    And Alı bır sanıye bekler
    Then Alı uyari mesaji alir
#
    Examples: dean_bilgileri
      | Username  | Password   | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321 | hasan | tarik    | Van         | 29-03-2001    | abs-def-ghjk  | 505-41-6328  |Team11     | 57916929 |