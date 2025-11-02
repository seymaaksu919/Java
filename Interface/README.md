
# Java Interface ve Polimorfizm Örneği

Bu proje, Java'da **interface kullanımı** ve **polimorfizm** konularını basit bir örnek üzerinden göstermektedir.

## 🚀 Ana Fikir

- **Interface → Ortak şablon sağlar.**  
  Farklı sınıflar (`BilgisayarMuhendisi`, `MakineMuhendisi`) aynı interface'i (`IMuhendis`) uygular ve ortak metotları garanti eder.

- **Polimorfizm → Farklı sınıfları ortak tip gibi kullanma imkânı verir.**  
  `IMuhendis` tipinden referansla tüm mühendis sınıfları tek bir yöntemle işlenebilir.

- **Avantajlar → Kod tekrarını azaltır, esneklik sağlar.**  
  Yeni bir mühendis sınıfı eklendiğinde mevcut kod değiştirilmez, sadece `IMuhendis`'i implements etmesi yeterlidir.
