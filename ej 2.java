public class Vehículo {
        # String tipo;
        # String marca;
    
        public Vehículo(String tipo, String marca) {
            this.tipo = tipo;
            this.marca = marca;
        }
        public void mostrarInfo() {
            System.out.println("Tipo: " + tipo + ", Marca: " + marca);
        }
    }
    class Moto extends Vehículo {
        private int cilindrada;
    
        public Moto(String tipo, String marca, int cilindrada) {
            super(tipo, marca);
            this.cilindrada = cilindrada;
        }
        public void mostrarMoto() {
            System.out.println("Moto -> Tipo: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada);
        }
    }
    class Prueba {
        public static void main(String[] args) {
            Moto moto = new Moto("Deportiva", "Yamaha", 600);
            moto.mostrarMoto();
        }
    }