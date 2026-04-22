public class MetodoSeleccion {
    int[] arr; 
    public MetodoSeleccion(int[] arr) {
        this.arr=arr;
    }
    
    public void sort(int[] arr){
        int tama=arr.length;
        for (int i=0;i<tama;i++){
            int indiceDelMenor=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[indiceDelMenor]>arr[j]) {
                    indiceDelMenor=j;
                }
            }
            if(i!=indiceDelMenor){
                int auxil=arr[i];
                arr[i]=arr[indiceDelMenor];
                arr[indiceDelMenor]=auxil;
            }
        }
    }

    public void sortDes(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int indiceDelMayor=i;
            for(int j=i+1;j<n;j++){
                if (arr[indiceDelMayor]<arr[j]) {
                    indiceDelMayor=j;
                }
            }
            if(i!=indiceDelMayor){
                int auxil=arr[i];
                arr[i]=arr[indiceDelMayor];
                arr[indiceDelMayor]=auxil;
            }
        }
    }

    public void printArreglo() {
      for (int num : arr) {
            System.out.print(num+", ");
        }
        System.out.println();
    }
    
    
}
