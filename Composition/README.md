# Car-Engine Composition Example

## Açıklama
Bu proje, **Java’da encapsulation ve composition** kavramlarını göstermek amacıyla hazırlanmıştır.  
- `Car` sınıfı bir `Engine` nesnesine sahiptir (**has-a relationship**).  
- `Engine` sınıfı motorun çalışmasını simüle eder.  
- `Car.startCar()` çağrıldığında, aracın motoru başlatılır.

---

## Sınıflar ve İşlevleri

### Engine
- `start()` metodu: Motorun çalıştığını ekrana yazdırır.  
- Basit bir nesne, motor davranışını simüle eder.

### Car
- **Private** `Engine engine` alanı: Encapsulation örneği.  
- `Car()` constructor’ı: Motor nesnesini başlatır.  
- `startCar()` metodu: Motoru çalıştırır (`engine.start()` çağrısı).  

### Main
- `main` metodunda `Car` nesnesi oluşturulur ve `startCar()` çağrılır.  
- Çıktı: `"Engine is starting..."`

---

## Örnek Kullanım

```java
Car car = new Car();
car.startCar();  // Engine is starting...
