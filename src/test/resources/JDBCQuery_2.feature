Feature: JDBCAuery_2

 # Database üzerinden hastane sistemine gerekli bilgiler girilerek randevu alinabildigini dogrulayiniz.
@t113_2

  Scenario: Database üzerinden hastane sistemine gerekli bilgiler girilerek randevu alinabildigini dogrulayiniz.

    * DataBase baglantisi kurulur
    * Update Query'si hazirlanir
    * Sonuclar alinir ve dogrulanir
    * DataBase baglantisi kapatilir