public class RaitaSort {
   public static void raitaSort(int[] arr, int n) {
      if (n <= 1) // Dizinin boyutu 1 veya daha az ise, diziyi sıralamak gerekli değildir.
         return;
      
      // Dizi elemanlarını iki eşit parçaya ayırır.
      int[] arr1 = new int[n / 2];
      int[] arr2 = new int[n - n / 2];
      for (int i = 0; i < n / 2; i++)
         arr1[i] = arr[i];
      for (int i = n / 2; i < n; i++)
         arr2[i - n / 2] = arr[i];
      
      // İki parçayı ayrı ayrı sıralar.
      raitaSort(arr1, n / 2);
      raitaSort(arr2, n - n / 2);
      
      // İki parçayı birleştirir.
      int i = 0, j = 0, k = 0;
      while (i < n / 2 && j < n - n / 2) {
         if (arr1[i] < arr2[j])
            arr[k++] = arr1[i++];
         else
            arr[k++] = arr2[j++];
      }
      while (i < n / 2)
         arr[k++] = arr1[i++];
      while (j < n - n / 2)
         arr[k++] = arr2[j++];
   }

   public static void main(String[] args) {
      int[] arr = { 11, 34, 22, 9, 10 };
      raitaSort(arr, arr.length); // Raita sıralama metodunu çağırır.
      for (int i = 0; i < arr.length; i++)
         System.out.print(arr[i] + " "); // Sıralanmış diziyi ekrana yazdırır.
   }
}
