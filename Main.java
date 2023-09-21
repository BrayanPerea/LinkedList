
public class Main {
    public static void main(String[] args) {

                LinkedList linkedList = new LinkedList();
                linkedList.agregarHead(5);
                linkedList.agregarHead(3);
                linkedList.agregarHead(0);
                linkedList.agregarTail(10);
                linkedList.imprimirLista();
                linkedList.agregarPorPosicion(2, 99);
                linkedList.imprimirLista();
                linkedList.eliminarPorPosicion(1);
                linkedList.imprimirLista();
                linkedList.reemplazarPorPosicion(1, 42);
                linkedList.imprimirLista();
                linkedList.eliminarInicio();
                linkedList.imprimirLista();

        int valorBuscado = 99;
        int posicion = linkedList.buscarPorValor(valorBuscado);

        if (posicion != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado en la posición " + posicion);
        } else {
            System.out.println("Valor " + valorBuscado + " no encontrado en la lista");
        }

        linkedList.eliminarFinal();
        linkedList.imprimirLista();
    }



}
            // [7] -> [6] -> [5]
            // [7] -> [0] -> [5] -> [10]
            // [7] -> [0] -> [1] ->  [5] -> [10]
            // [7] -> [0] -> [1] ->  [5] -> [10] -> [6] -> [8]
            // [7] -> [0] -> [1] ->  [5] -> [10] -> [8] ->  [6] -> [8]
            //agrege un nodo en la posicion  = 5;
            // head                 //tail
