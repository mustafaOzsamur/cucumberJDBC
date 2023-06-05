@day4
Feature: JDBC Query 3

  # Database üzerinden appointment tablosunda ögleden önce icin alinmis randevularin ögleden
  # sonra icin alinan randevulardan az oldugunu dogrulayiniz.

  Background: Connection
    * DataBase baglantisi kurulur

  Scenario: appointment tablosunda ögleden önce icin alinmis randevularin ögleden sonra icin alinan randevulardan az oldugunu dogrulayiniz.

    * Randevu sayilarini ogrenebilecegimiz sqi querysi hazirlanir
    * Query calistirilir ve sonuclar dogrulanir
    * DataBase baglantisi kapatilir


