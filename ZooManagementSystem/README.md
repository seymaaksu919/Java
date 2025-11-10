# 🦁 ZooLife: Animal Behavior Simulation

## 1️⃣ Proje Hakkında

“ZooLife”, hayvanların hareket ve davranışlarını simüle eden bir **Java OOP projesidir**.
Bu proje ile aşağıdaki konuları öğrenebilir ve pekiştirebilirsin:

* **Abstract class ve abstract metod kullanımı**
* **Inheritance (Kalıtım)**
* **Interface ve çoklu davranış (Uçma, Koşma, Yüzme)**
* **Polymorphism (Çok biçimlilik)**
* **instanceof ile runtime tip kontrolü**
* **Encapsulation (getter/setter kullanımı)**



---

## 2️⃣ Sınıf ve Interface Yapısı

### 2.1 Abstract Superclass: `Animal`

```java
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) { ... }

    public String getName() { ... }
    public int getAge() { ... }

    public abstract void move(); // Her hayvanın kendi hareketi
}
```

* `Animal` abstract → Kendisi nesne olamaz, sadece şablon sağlar.
* `move()` abstract → Alt sınıflar mutlaka override eder.

---

### 2.2 Interface’ler

* `Flyable` → `fly()` metodunu içerir
* `Swimmable` → `swim()` metodunu içerir
* `Runnable` → `run()` metodunu içerir

> Interface’ler sayesinde bir hayvana birden fazla yetenek eklenebilir.

---

### 2.3 Alt Sınıflar

| Sınıf  | Extends | Implements        | Açıklama      |
| ------ | ------- | ----------------- | ------------- |
| Bird   | Animal  | Flyable, Runnable | Uçar ve koşar |
| Fish   | Animal  | Swimmable         | Sadece yüzer  |
| Mammal | Animal  | Runnable          | Sadece koşar  |

---

## 3️⃣ Polymorphism ve `instanceof`

```java
Animal[] animals = {
    new Bird("Kartal", 3),
    new Fish("Altın Balık", 1),
    new Mammal("Aslan", 5)
};

for (Animal a : animals) {
    a.move(); // Polymorphism: her hayvan kendi hareketini yapar

    if (a instanceof Flyable) ((Flyable)a).fly();
    if (a instanceof Swimmable) ((Swimmable)a).swim();
    if (a instanceof Runnable) ((Runnable)a).run();

    System.out.println("-----------------");
}
```

* `Animal[]` → Alt sınıf nesnelerini bir dizide tutabilirsin
* `instanceof` → Runtime’da hangi yeteneğin çağrılacağını belirler
* Polymorphism → `move()` metodunu alt sınıf kendi biçiminde çalıştırır

---

## 4️⃣ Getter/Setter Kullanımı

* `name` ve `age` private → Encapsulation
* `getName()` ve `getAge()` ile okunur
* Sadece okuma gerekiyorsa setter eklemeye gerek yok

---

## 5️⃣ UML (Metin Tabanlı)

```
                  +----------------+
                  |    Animal      |  <<abstract>>
                  +----------------+
                  | - name: String |
                  | - age: int     |
                  +----------------+
                  | + getName()    |
                  | + getAge()     |
                  | + move() <<abstract>> |
                  +----------------+
                          ^
                          |
          ---------------------------------
          |               |               |
      +---------+     +---------+     +---------+
      |  Bird   |     |  Fish   |     | Mammal  |
      +---------+     +---------+     +---------+
      | + move()|     | + move()|     | + move()|
      | + fly() |     | + swim()|     | + run() |
      | + run() |     +---------+     +---------+
```

---

## 6️⃣ Özet

1. **Abstract sınıf** → Kendisi nesne oluşturulamaz, abstract metodları alt sınıflar override eder.
2. **Interface** → Alt sınıf mutlaka metodları implement eder.
3. **Polymorphism** → Üst sınıf referansı ile alt sınıf metodları çağrılır.
4. **instanceof** → Runtime’da hangi davranışın çağrılacağını kontrol eder.
5. **Getter/Setter** → Encapsulation ve veri okuma/yazma kontrolü.

---

İstersen ben bunu sana **GitHub için hazır Markdown formatında**, tüm dosya isimleri ve küçük açıklamalarla daha **profesyonel** hâle getirebilirim, direkt oraya koysunlar.

Bunu da hazırlayayım mı?

