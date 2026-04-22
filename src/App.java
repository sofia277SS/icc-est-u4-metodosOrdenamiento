public class App {
    public static void main(String[] args) throws Exception {
        metodoBurbuja();
        metodoBurbujaAvanzado();
        
    }

    public static void metodoBurbuja() {
        System.out.println("Metodo Burbuja");
        int[] arreglo= new int[]{10,-5,0,2,7};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente();
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDescendente();
        metodoBurbuja.imprimirArreglo();
    }

    public static void metodoBurbujaAvanzado() {
        System.out.println("Metodo Burbuja Avanzado");
        int[] arreglo= new int[]{50,5,20,30,0,-10,15};
        MetodoBurbujaAvanzado metodoBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        metodoBurbujaAvanzado.printArreglo();
        metodoBurbujaAvanzado.sort(true);
        metodoBurbujaAvanzado.printArreglo();
        metodoBurbujaAvanzado.sort(false);
        metodoBurbujaAvanzado.printArreglo();
    }


}
