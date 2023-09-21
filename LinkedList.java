 public class LinkedList {

        class  Node {
            int value;
            Node next = null;
            Node(int value){
                this.value = value;
            }
        }

        protected Node  head = null;
        protected Node tail = null;

        // [5] ->  next null  , head [5] tail [5]
        public void agregarHead(int valor) {
            Node nuevoNodo = new Node(valor);
            nuevoNodo.next = head;
            head = nuevoNodo;
            if(nuevoNodo.next == null){
                tail = nuevoNodo;
            }
        }

        public void agregarTail(int valor) {
            Node nuevoNodo = new Node(valor);
            if (tail == null){
                head = nuevoNodo;
                tail = nuevoNodo;
            } else {
                tail.next = nuevoNodo;
                tail = nuevoNodo;
            }
        }

        public void agregarPorPosicion(int posicion, int valor) {
            if (posicion < 0) {
                throw new IndexOutOfBoundsException();
            } else if (posicion == 0) {
                agregarHead(valor);
            }else {
                Node node = new Node(valor);
                Node actual = head;
                for (int i= 0; i < posicion-1; i++) {
                    if(actual == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    actual = actual.next;
                }
                //[0] -> [3] -> [5] -> [10]
                if(actual.next == null) {
                    agregarTail(valor);
                } else {
                    //[0] -> [3] -> [99]->[5]  -> [10]
                    node.next = actual.next;
                    actual.next = node;
                }
            }
        }

     public int buscarPorPosicion(int posicion) {
         if (posicion < 0) {
             throw new IndexOutOfBoundsException();
         } else {
             Node actual = head;
             for (int i = 0; i < posicion; i++) {
                 if (actual == null) {
                     throw new IndexOutOfBoundsException();
                 }
                 actual = actual.next;
             }
             if (actual == null) {
                 throw new IndexOutOfBoundsException();
             }
             return actual.value;
         }
     }

        public void eliminarPorPosicion(int posicion) {
            if (posicion < 0) {
                throw new IndexOutOfBoundsException();
            } else if (posicion == 0) {
                if (head == null) {
                    throw new IndexOutOfBoundsException();
                }
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            } else {
                Node actual = head;
                for (int i = 0; i < posicion - 1; i++) {
                    if (actual == null || actual.next == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    actual = actual.next;
                }
                if (actual.next == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual.next = actual.next.next;
                if (actual.next == null) {
                    tail = actual;
                }
            }
        }
        public void reemplazarPorPosicion(int posicion, int nuevoValor){
            if (posicion < 0) {
                throw new IndexOutOfBoundsException();
            } else {
                Node actual = head;
                for (int i = 0; i < posicion; i++) {
                    if (actual == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    actual = actual.next;
                }
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual.value = nuevoValor;
            }
        }
        public void eliminarInicio(){
            if (head != null) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            }
        }
     public int eliminarFinal() {
         if (head == null) {
             return 0;
         } else if (head == tail) {
             head = null;
             tail = null;
         } else {
             Node actual = head;
             while (actual.next != tail) {
                 actual = actual.next;
             }
             actual.next = null;
             tail = actual;
         }
         return 0;
     }


         public int buscarPorValor(int valor){
             Node actual = head;
             int posicion = 0;
             while (actual != null) {
                 if (actual.value == valor) {
                     return posicion;
                 }
                 actual = actual.next;
                 posicion++;
             }
             return -1; // Valor no encontrado
         }

        public void imprimirLista(){
            Node actual = head;
            System.out.print("Lista: ");
            while (actual != null) {
                System.out.print(actual.value + " -> ");
                actual = actual.next;
            }
            System.out.println("null");
        }
    }


