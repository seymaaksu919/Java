#CompanyRolesDemo

Bu proje, **Java’da inheritance (kalıtım), constructor zinciri ve polymorphism** kavramlarını göstermek amacıyla hazırlanmıştır. 
Employee, Developer, Manager ve TeamLead sınıfları kullanılarak bir teknoloji şirketindeki çalışan hiyerarşisi örneklendirilmiştir.

---

##🚀Kavramlar

- **Inheritance (Kalıtım):** Employee → Manager → TeamLead → Developer  
- **Constructor Zinciri:** Alt sınıf oluşturulurken önce üst sınıfların constructor’ları çalışır.  
- **`super` Kullanımı:** Üst sınıfın metodunu çağırmak için kullanılır.  
- **Referans Türü vs Nesne Türü:**  
  ```java
  Employee e = new TeamLead("Akif", team);
  e.work(); // Çalışma anında TeamLead metodları çalışır


Protected Değişkenler: Alt sınıflardan erişilebilir (protected String name;)

Alt Sınıfa Özel Değişkenler: TeamLead sınıfında teamMembers ve teamSize tanımlanmıştır.


Dosya Yapısı

Employee.java → Üst sınıf

Developer.java → Employee’den türetilmiş alt sınıf

Manager.java → Employee’den türetilmiş alt sınıf

TeamLead.java → Manager’dan türetilmiş alt sınıf, ekip yönetimi özellikleri

Main.java → Programın çalıştırıldığı sınıf


Beklenen Çıktı:

Employee created..
Manager created..
TeamLead created..
Employee is working..
Manager is working..
TeamLead is leading a team of 4 developers..

📌 Notlar

Kodda constructor zinciri, override edilmiş metotlar ve polymorphism gösterilmiştir.

TeamLead constructor’ı, parametre olarak dizi alır ve ekip büyüklüğünü otomatik olarak belirler.

Referans tipi ve nesne tipi farkı, polymorphism kavramını açıkça gösterir.







