Feature: JDBC Query_1



# Database üzerinden ambulance_call tablosundaki patient_id = 1 olan
# hastanin driver'i Smith olan ambulance ile 2 defa sevkinin gerceklestigini dogrulayiniz
@t113_1

  Scenario: ambulance_call tablosundaki patient_id = 1 olan hastanin driver'i Smith olan ambulance ile
            2 defa sevkinin gerceklestigini dogrulayiniz

    * DataBase baglantisi kurulur
    * Query Hazirlanir
    * Query calistirilir ve sonuclari alinir
    * Query sonuclari dogrulanir
    * DataBase baglantisi kapatilir


