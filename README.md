# AAT_Raita_algoritmasi
java dilinde raita algoritması
Raita algoritmasının matematiksel ve asimptotik analizini aşağıdaki şekilde yapabiliriz:

Matematiksel Analiz:
Raita algoritması, sıralama işlemindeki her adımda iki alt liste oluşturur ve bunları birleştirir. 
Bu işlem, alt listelerin boyutu 1 olana kadar tekrarlanır ve bu nedenle log n adım gerektirir. Her adımda alt listeleri birleştirme işlemi,
alt listelerin toplam sayısı n olduğunda n kez gerçekleştirilir. Dolayısıyla, toplam işlem sayısı n log n'dir.

Asimptotik Analiz:
Raita algoritması O(nlogn) zaman karmaşıklığına sahiptir. Bu, algoritmanın veri kümesinin büyüklüğüne bağlı olarak büyüme hızının logaritmik 
olduğu anlamına gelir. Büyük veri kümeleri için performansı yüksektir ve en kötü durumda bile makul derecede hızlı çalışır.
Özetle, Raita algoritması, n elemanlı bir dizi için O(nlogn) zaman karmaşıklığına sahip bir sıralama algoritmasıdır.


