<!DOCTYPE html>
<html lang="tr">
<head>
    <meta charset="UTF-8">
    <title>Java Interface & Polimorfizm</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 40px;
            max-width: 800px;
        }
        code {
            background: #f4f4f4;
            padding: 2px 4px;
            border-radius: 4px;
            font-family: monospace;
        }
        pre {
            background: #f4f4f4;
            padding: 10px;
            border-radius: 4px;
            overflow-x: auto;
        }
        h1, h2, h3 {
            color: #333;
        }
    </style>
</head>
<body>

    <h1>👨‍💻 Java Interface ve Polimorfizm Örneği</h1>

    <p>Bu sayfa, Java'da <strong>interface kullanımı</strong> ve <strong>polimorfizm</strong> kavramlarını örnekle açıklar.</p>

    <h2>🚀 Ana Fikir</h2>

    <ul>
        <li><strong>Interface →</strong> Ortak şablon sağlar. Farklı sınıflar (<code>BilgisayarMuhendisi</code>, <code>MakineMuhendisi</code>) aynı interface'i (<code>IMuhendis</code>) uygular.</li>
        <li><strong>Polimorfizm →</strong> Farklı sınıfları ortak tip gibi kullanma imkânı verir. <code>IMuhendis</code> referansı üzerinden hepsi tek bir yöntemle işlenir.</li>
        <li><strong>Avantajlar →</strong> Kod tekrarını azaltır, esneklik sağlar. Yeni bir mühendis sınıfı eklenirse mevcut kod bozulmaz.</li>
    </ul>

    <h2>✅ Örnek Kullanım</h2>

    <pre><code>// Interface
public interface IMuhendis {
    void askerlikYapildiMi(boolean yapildiMi);
    void bilgileriYazdir();
}

// Bilgisayar Mühendisi
public class BilgisayarMuhendisi implements IMuhendis {
    public void askerlikYapildiMi(boolean yapildiMi) { /* ... */ }
    public void bilgileriYazdir() { /* ... */ }
}

// Makine Mühendisi
public class MakineMuhendisi implements IMuhendis {
    public void askerlikYapildiMi(boolean yapildiMi) { /* ... */ }
    public void bilgileriYazdir() { /* ... */ }
}

// Ana Sınıf
public class Main {
    public static void main(String[] args) {
        BilgisayarMuhendisi bm = new BilgisayarMuhendisi();
        MakineMuhendisi mm = new MakineMuhendisi();

        muhendisBilgileriYazdir(bm);
        muhendisBilgileriYazdir(mm);
    }

    public static void muhendisBilgileriYazdir(IMuhendis muhendis) {
        muhendis.askerlikYapildiMi(true);
        muhendis.bilgileriYazdir();
    }
}</code></pre>

    <h2>📌 Özet</h2>

    <blockquote><strong>Interface:</strong> Sınıflara ortak şablon sunar.<br>
    <strong>Polimorfizm:</strong> Farklı sınıfları ortak tipten işleyerek esneklik sağlar.<br>
    <strong>Kazanç:</strong> Modüler, genişletilebilir, bakımı kolay yapı.</blockquote>

    <h2>⚙️ Gereksinimler</h2>
    <ul>
        <li>Java 8+</li>
        <li>Bir IDE veya terminal</li>
    </ul>

    <h2>📂 Klasör Yapısı</h2>
    <pre><code>/src
 ├── IMuhendis.java
 ├── BilgisayarMuhendisi.java
 ├── MakineMuhendisi.java
 └── Main.java
</code></pre>

    <h2>👏 Katkıda Bulun</h2>
    <p>Fikirlerinizi paylaşabilir, yeni mühendis türleri ekleyebilir, bu örneği genişletebilirsiniz.</p>

</body>
</html>

