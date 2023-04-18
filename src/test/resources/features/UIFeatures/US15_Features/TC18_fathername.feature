Feature: fathername alanina gecerli bir isim girilir
  Scenario: TC18_fathername
    Given Kullanici anasayfaya belirtilen URL'ye gider
    When Kullanici anasayfanın acildigini goruntuler
    And Kullanici Login butonuna tiklar
    And Kullanici Login menusunun altinda doldurulacak alanlari goruntuler
    And Kullanici User Name bilgisini girer
    And Kullanici en az sekiz karakterli bir Password bilgisini girer
    And Kullanici Login butonuna tiklar
    And Kullanici login isleminin basarili oldugunu dogrular
    And Kullanici sag kosede Menu butonuna tiklar
    And Kullanici Menu butonunun altinda acilan alt munude student management butonunu tiklar
    And Kullanici student management sayfasinin acildigini dogrular
    And Kullanici acilan sayfada choose teacher butonunu tiklar
    And Kullanicin acilan drapdowndan ogrencinin danisman ogretmenini secer
    And Kullanici danisman ogretmenin secildigini dogrular
    And Kullanici name alanina gecerli bir isim girer
    And Kullanici surname alanina gecerli bir isim girer
    And Kullanici birt place alanina gecerli bir sehir ismi girer
    And Kullanici email alanina gecerli bir adres girer
    And Kullanici phone alanina gecerli bir phone numarasi girer
    And Kullanici male butonuna tiklar
    And Kullanici date of birth alanina gecerli bir tarih girer
    And Kullanici ssn alanina gecerli formatta bir numara girer
    And Kullanici ogrenci username girer
    And Kullanici fathername alanina bir isim girer
    And Kullanici required yazisinin kayboldugunu dogrular